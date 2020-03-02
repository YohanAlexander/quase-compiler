package quase;

import java.util.ArrayList;
import java.util.List;

import java.util.LinkedHashMap;
import java.util.LinkedList;

import java.util.Iterator;

import quase.analysis.*;
import quase.node.*;


public class Semantico extends DepthFirstAdapter {

	LinkedHashMap<Integer, LinkedList<LinkedHashMap<Integer, Simbolo>>> class_hash = new LinkedHashMap<Integer, LinkedList<LinkedHashMap<Integer, Simbolo>>>();
	LinkedList<LinkedHashMap<Integer, Simbolo>> table;
	LinkedList<LinkedHashMap<Integer, Simbolo>> temp_table;

	public int hash(String key)
	{
		int temp = 0;
		for (char c : key.toCharArray())
		{
			temp = (temp * 16 + c) % 211;
		}
		return temp;
	}

	@Override
	public void inStart(Start node)
	{
		System.out.println("-------------------------------------------------");
		System.out.println("Iniciando análise semântica...");
		System.out.println("-------------------------------------------------");
	}

	@Override
	public void outStart(Start node)
	{
	    System.out.println("-------------------------------------------------");
	    System.out.println("Fim da análise semântica");
	    System.out.println("-------------------------------------------------");
	}

	@Override
	public void inAAProgramaPrograma(AAProgramaPrograma node)
	{
		temp_table = null;

		//Adicionar a classe _IO e os seus métodos no início do programa
		String nome = "_IO ";
		int pos = hash(nome);
		class_hash.put(pos, new LinkedList<LinkedHashMap<Integer, Simbolo>>());
		table = (LinkedList<LinkedHashMap<Integer, Simbolo>>) class_hash.get(pos);
		table.add(new LinkedHashMap<Integer, Simbolo>());
		pos = hash("print ");
		table.getLast().put(pos, new Simbolo("funcao", "print ", "P"));
		pos = hash("read ");
		table.getLast().put(pos, new Simbolo("funcao", "read ", "R"));
	}

	@Override
	public void inAADefClasseDefClasse(AADefClasseDefClasse node)
	{
		String nome = node.getNome().toString();
		int pos = hash(nome);
		class_hash.put(pos, new LinkedList<LinkedHashMap<Integer, Simbolo>>());
		System.out.println("Nova linked list de hash tables!");
		table = (LinkedList<LinkedHashMap<Integer, Simbolo>>) class_hash.get(pos);
		System.out.println("Nova hash table!");
		table.add(new LinkedHashMap<Integer, Simbolo>());
	}

	@Override
	public void outAAIdExp(AAIdExp node)
	{
		Iterator<LinkedHashMap<Integer, Simbolo>> it = table.descendingIterator();
		int pos = hash(node.toString());
		while (it.hasNext())
		{
			LinkedHashMap<Integer, Simbolo> tabela = (LinkedHashMap<Integer, Simbolo>) it.next();
			if (tabela.containsKey(pos))
			{
				Simbolo simbolo = tabela.get(pos);
				switch (simbolo.tipo) {
					case "bool ":
						node.replaceBy(new AABooleanoExp());
						break;
					default:
						node.replaceBy(new AANumeroExp());
				}
				return;
			}
		}
		System.out.println(node.toString() + "não encontrado");
	}

	@Override
	public void caseAACallComando(AACallComando node)
	{
		inAACallComando(node);
		if (node.getEsq() != null)
		{
			Iterator<LinkedHashMap<Integer, Simbolo>> it = table.descendingIterator();
			String nome = node.getEsq().toString();
			int pos = hash(nome);
			Simbolo simbolo = null;
			while (it.hasNext())
			{
				LinkedHashMap<Integer, Simbolo> tabela = (LinkedHashMap<Integer, Simbolo>) it.next();
				if (tabela.containsKey(pos))
				{
					simbolo = tabela.get(pos);
					break;
				}
			}
			if (simbolo != null)
			{
				nome = simbolo.getTipo();
				pos = hash(nome);
				temp_table = class_hash.get(pos);
			}
			else
			{
				System.out.println(nome + "não é uma classe");
			}
		}
		if (node.getDir() != null)
		{
			node.getDir().apply(this);
		}
		outAACallComando(node);
	}

	@Override
	public void caseAAIdAtribExp(AAIdAtribExp node)
	{
		inAAIdAtribExp(node);
		outAAIdAtribExp(node);
	}

	@Override
	public void caseAAIdCallExp(AAIdCallExp node)
	{
		inAAIdCallExp(node);
		if (node.getEsq() != null)
		{
			Iterator<LinkedHashMap<Integer, Simbolo>> it = table.descendingIterator();
			String nome = node.getEsq().toString();
			int pos = hash(nome);
			Simbolo simbolo = null;
			while (it.hasNext())
			{
				LinkedHashMap<Integer, Simbolo> tabela = (LinkedHashMap<Integer, Simbolo>) it.next();
				if (tabela.containsKey(pos))
				{
					simbolo = tabela.get(pos);
					break;
				}
			}
			if (simbolo != null)
			{
				nome = simbolo.getTipo();
				pos = hash(nome);
				temp_table = class_hash.get(pos);
			}
			else
			{
				System.out.println(nome + "não é uma classe");
			}
		}
		if (node.getDir() != null)
		{
			node.getDir().apply(this);
		}
		outAAIdCallExp(node);
	}

	@Override
	public void outAAIdCallExp(AAIdCallExp node)
	{
		if (node.getDir() instanceof AANumeroExp)
		{
			node.replaceBy(new AANumeroExp());
		}
		else if (node.getDir() instanceof AABooleanoExp)
		{
			node.replaceBy(new AABooleanoExp());
		}
	}

	@Override
	public void outAAChamadaExp(AAChamadaExp node)
	{
		LinkedHashMap<Integer, Simbolo> tabela;
		if (temp_table != null)
		{
			tabela = temp_table.getFirst();
			temp_table = null;
		}
		else
		{
			tabela = table.getFirst();
		}
		String nome = node.getEsq().toString();
		int pos = hash(nome);
		if (tabela.containsKey(pos))
		{
			Simbolo func = tabela.get(pos);
			List<PExp> copy = new ArrayList<PExp>(node.getDir());
			int len_copy = copy.size();
			if (func.getValor().equals("P"))
			{
				if (len_copy != 1)
				{
					System.out.println(nome + "recebe apenas 1 parâmetro");
				}
				return;
			}
			if (func.getValor().equals("R"))
			{
				if (len_copy != 0)
				{
					System.out.println(nome + "recebe nenhum parâmetro");
				}
				return;
			}
			int len_par = func.numParametros();
			if (len_copy != len_par)
			{
				System.out.println(nome + "tem " + len_par + " paramêtros, mas está recebendo " + len_copy + " parâmetros");
			}
			for (int i = 0; i < len_copy; i++)
			{
				if (func.getParametro(i).equals("bool") &&
					copy.get(i) instanceof AABooleanoExp)
					continue;
				if ((func.getParametro(i).equals("int") || func.getParametro(i).equals("real")) &&
					copy.get(i) instanceof AANumeroExp)
					continue;
				System.out.println((i + 1) + "-ésimo parâmetro de tipo inválido");
				return;
			}
			if (func.getValor().equals("int ") || func.getValor().equals("real "))
				node.replaceBy(new AANumeroExp());
			else if (func.getValor().equals("bool "))
				node.replaceBy(new AABooleanoExp());
		}
		else
		{
			System.out.println("Função " + nome + "não encontrada");
		}
	}

	@Override
	public void caseAAChamadaExp(AAChamadaExp node)
	{
		inAAChamadaExp(node);
		LinkedList<LinkedHashMap<Integer, Simbolo>> temp = null;
        List<PExp> copy = new ArrayList<PExp>(node.getDir());
		if (copy.size() > 0)
		{
			temp = temp_table;
			temp_table = null;
		}
        for(PExp e : copy)
        {
			e.apply(this);
		}
		if (temp != null)
		{
			temp_table = temp;
		}
		outAAChamadaExp(node);
	}

	@Override
	public void outAAIdAtribExp(AAIdAtribExp node)
	{
		int pos = hash(((AAIdExp)node.getEsq()).toString());

		if (class_hash.containsKey(pos))
		{
				LinkedHashMap<Integer, Simbolo> temp_table = class_hash.get(pos).getLast();
				pos = hash(node.getDir().toString());
				if (temp_table.containsKey(pos))
				{
					Simbolo simbolo = temp_table.get(pos);
					switch (simbolo.tipo) {
						case "bool ":
							node.replaceBy(new AABooleanoExp());
							break;
						default:
							node.replaceBy(new AANumeroExp());
					}
				}
				else
				{
					System.out.println("Atributo " + node.getDir().toString() + "não encontrado");
				}
		}
		else
		{
			System.out.println("A classe de " + node.getEsq().toString() + "não existe");
		}
	}

	@Override
	public void caseAAPinicializacaoPinicializacao(AAPinicializacaoPinicializacao node)
	{
		inAAPinicializacaoPinicializacao(node);
        outAAPinicializacaoPinicializacao(node);
	}

	@Override
	public void caseAADecConsDec(AADecConsDec node)
	{
		inAADecConsDec(node);
		outAADecConsDec(node);
	}

	@Override
	public void outAADecConsDec(AADecConsDec node)
	{
		String tipo = node.getEsq().toString();
		List<PPinicializacao> copy = new ArrayList<PPinicializacao>(node.getDir());
		for (int i = 0; i < copy.size(); i++)
        {
			String[] nome_val = copy.get(i).toString().split("\\s+");
			int pos = hash(nome_val[0] + " ");
			table.getLast().put(pos, new Simbolo(tipo, nome_val[0], nome_val[1]));
        }
	}

	@Override
	public void caseAADecVarDec(AADecVarDec node)
	{
		inAADecVarDec(node);
		outAADecVarDec(node);
	}

	@Override
	public void outAADecVarDec(AADecVarDec node)
	{
		String tipo = node.getEsq().toString();
		List<PExp> copy = new ArrayList<PExp>(node.getDir());
		for (int i = 0; i < copy.size(); i++)
        {
			String[] nome_val = copy.get(i).toString().split("\\s+");
			int pos = hash(nome_val[0] + " ");
			table.getLast().put(pos, new Simbolo(tipo, nome_val[0]));
        }
	}

	@Override
	public void caseAADecObjDec(AADecObjDec node)
	{
		inAADecObjDec(node);
		outAADecObjDec(node);
	}

	@Override
	public void outAADecObjDec(AADecObjDec node)
	{
		String tipo = node.getEsq().toString();
		int pos = hash(tipo);
		if (class_hash.containsKey(pos))
		{
			List<PExp> copy = new ArrayList<PExp>(node.getDir());
			for (int i = 0; i < copy.size(); i++)
			{
				String[] nome_val = copy.get(i).toString().split("\\s+");
				pos = hash(nome_val[0] + " ");
				table.getLast().put(pos, new Simbolo(tipo, nome_val[0]));
			}
		}
		else
		{
			System.out.println("A classe " + tipo + "não existe");
		}
	}

	@Override
	public void inAADecFuncaoDec2(AADecFuncaoDec2 node)
	{
		String nome = node.getEsqn().toString();
		String valor = node.getEsq().toString();
		int pos = hash(nome);
		table.getLast().put(pos, new Simbolo("funcao", nome, valor, new ArrayList<String>()));
		Simbolo func = table.getLast().get(pos);

		table.add(new LinkedHashMap<Integer, Simbolo>());
		System.out.println("Nova hash table!");
		List<PParametro> copy = new ArrayList<PParametro>(node.getMid());
		for (int i = 0; i < copy.size(); i++)
        {
			String[] nome_val = copy.get(i).toString().split("\\s+");
			pos = hash(nome_val[1] + " ");
			table.getLast().put(pos, new Simbolo(nome_val[0], nome_val[1]));
			func.addParametro(nome_val[0]);
        }
	}

	@Override
	public void outAADecFuncaoDec2(AADecFuncaoDec2 node)
	{
		table.removeLast();
	}

	@Override
	public void caseAADecFuncaoDec2(AADecFuncaoDec2 node)
	{
		inAADecFuncaoDec2(node);
		if (node.getDir() != null)
		{
			node.getDir().apply(this);
		}
		outAADecFuncaoDec2(node);
	}

	@Override
	public void inAADecProcedimentoDec2(AADecProcedimentoDec2 node)
	{
		String nome = node.getEsq().toString();
		int pos = hash(nome);
		table.getLast().put(pos, new Simbolo("procedimento", nome));

		table.add(new LinkedHashMap<Integer, Simbolo>());
		System.out.println("Nova hash table!");
		List<PParametro> copy = new ArrayList<PParametro>(node.getMid());
		for (int i = 0; i < copy.size(); i++)
        {
			String[] nome_val = copy.get(i).toString().split("\\s+");
			pos = hash(nome_val[1] + " ");
			table.getLast().put(pos, new Simbolo(nome_val[0], nome_val[1]));
        }
	}

	@Override
	public void outAADecProcedimentoDec2(AADecProcedimentoDec2 node)
	{
		table.removeLast();
	}

	@Override
	public void caseAADecProcedimentoDec2(AADecProcedimentoDec2 node)
	{
		inAADecProcedimentoDec2(node);
		if (node.getDir() != null)
		{
			node.getDir().apply(this);
		}
		outAADecProcedimentoDec2(node);
	}

	@Override
	public void outAASomaExp(AASomaExp node)
	{
		if (node.getEsq() instanceof AANumeroExp &&
			node.getDir() instanceof AANumeroExp)
		{
			node.replaceBy(new AANumeroExp());
		}
		else
		{
			System.out.println("Erro semântico de soma em " + node.toString());
		}
	}

	@Override
	public void outAASubtExp(AASubtExp node)
	{
		if (node.getEsq() instanceof AANumeroExp &&
			node.getDir() instanceof AANumeroExp)
		{
			node.replaceBy(new AANumeroExp());
		}
		else
		{
			System.out.println("Erro semântico de subtração em " + node.toString());
		}
	}

	@Override
	public void outAAMultiExp(AAMultiExp node)
	{
		if (node.getEsq() instanceof AANumeroExp &&
			node.getDir() instanceof AANumeroExp)
		{
			node.replaceBy(new AANumeroExp());
		}
		else
		{
			System.out.println("Erro semântico de multiplicação em " + node.toString());
		}
	}

	@Override
	public void outAADivExp(AADivExp node)
	{
		if (node.getEsq() instanceof AANumeroExp &&
			node.getDir() instanceof AANumeroExp)
		{
			node.replaceBy(new AANumeroExp());
		}
		else
		{
			System.out.println("Erro semântico de divisão em " + node.toString());
		}
	}

	@Override
	public void outAAModExp(AAModExp node)
	{
		if (node.getEsq() instanceof AANumeroExp &&
			node.getDir() instanceof AANumeroExp)
		{
			node.replaceBy(new AANumeroExp());
		}
		else
		{
			System.out.println("Erro semântico de módulo em " + node.toString());
		}
	}

	@Override
	public void outAAIgualExp(AAIgualExp node)
	{
		if ((node.getEsq() instanceof AANumeroExp &&
			node.getDir() instanceof AANumeroExp) ||
			(node.getEsq() instanceof AABooleanoExp &&
			node.getDir() instanceof AABooleanoExp))
		{
			node.replaceBy(new AABooleanoExp());
		}
		else
		{
			System.out.println("Erro semântico de igualdade em " + node.toString());
		}
	}

	@Override
	public void outAAMenorExp(AAMenorExp node)
	{
		if (node.getEsq() instanceof AANumeroExp &&
			node.getDir() instanceof AANumeroExp)
		{
			node.replaceBy(new AABooleanoExp());
		}
		else
		{
			System.out.println("Erro semântico de menor que em " + node.toString());
		}
	}

	@Override
	public void outAAOrExp(AAOrExp node)
	{
		if (node.getEsq() instanceof AABooleanoExp &&
			node.getDir() instanceof AABooleanoExp)
		{
			node.replaceBy(new AABooleanoExp());
		}
		else
		{
			System.out.println("Erro semântico de ou em " + node.toString());
		}
	}

	@Override
	public void outAAAndExp(AAAndExp node)
	{
		if (node.getEsq() instanceof AABooleanoExp &&
			node.getDir() instanceof AABooleanoExp)
		{
			node.replaceBy(new AABooleanoExp());
		}
		else
		{
			System.out.println("Erro semântico de e em " + node.toString());
		}
	}

	@Override
	public void outAANegativoExp(AANegativoExp node)
	{
		if (node.getExp() instanceof AANumeroExp)
		{
			node.replaceBy(new AANumeroExp());
		}
		else
		{
			System.out.println("Erro semântico de negação em " + node.toString());
		}
	}

	@Override
	public void outAADifExp(AADifExp node)
	{
		if (node.getExp() instanceof AABooleanoExp)
		{
			node.replaceBy(new AABooleanoExp());
		}
		else
		{
			System.out.println("Erro semântico de negação em " + node.toString());
		}
	}

	@Override
	public void outAASeCondExp(AASeCondExp node)
	{
		if (!(node.getEsq() instanceof AABooleanoExp))
			System.out.println("A expressão " + node.toString() + "deve ter como resultado um booleano!");
	}

}
