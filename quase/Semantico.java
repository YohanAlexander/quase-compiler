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
	}

	@Override
	public void outStart(Start node)
	{
	    System.out.println("-------------------------------------------------");
	    System.out.println("Fim da análise semântica");
	    System.out.println("-------------------------------------------------");
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
	public void caseAAIdAtribExp(AAIdAtribExp node)
	{
		inAAIdAtribExp(node);
		outAAIdAtribExp(node);
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
		table.getLast().put(pos, new Simbolo("funcao", nome, valor));
		
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
