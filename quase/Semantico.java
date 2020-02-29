package quase;

import java.util.ArrayList;
import java.util.List;

import java.util.LinkedHashMap;
import java.util.LinkedList;

import java.util.Iterator;

import quase.analysis.*;
import quase.node.*;


public class Semantico extends DepthFirstAdapter {

	LinkedList<LinkedHashMap<Integer, Simbolo>> table = new LinkedList<LinkedHashMap<Integer, Simbolo>>();

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
	public void outAAIdExp(AAIdExp node)
	{
		if (table.getLast().containsKey(hash(node.toString())))
		{
			System.out.println("Aqui");
			node.replaceBy(new AANumeroExp());
		}
		else
		{
			System.out.println("Erro semântico de id");
		}
	}
	
	@Override
	public void inAADefClasseDefClasse(AADefClasseDefClasse node)
	{
		table.add(new LinkedHashMap<Integer, Simbolo>());
		System.out.println("Nova hash table!");
	}
	
	@Override
	public void caseAAPinicializacaoPinicializacao(AAPinicializacaoPinicializacao node)
	{	
		inAAPinicializacaoPinicializacao(node);
        outAAPinicializacaoPinicializacao(node);
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
	public void outAASomaExp(AASomaExp node)
	{
		if (node.getEsq() instanceof AANumeroExp &&
			node.getDir() instanceof AANumeroExp)
		{
			node.replaceBy(new AANumeroExp());
		}
		else
		{
			System.out.println("Erro semântico de soma");
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
			System.out.println("Erro semântico de subtração");
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
			System.out.println("Erro semântico de multiplicação");
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
			System.out.println("Erro semântico de divisão");
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
			System.out.println("Erro semântico de módulo");
		}
	}
	
	@Override
	public void outAAIgualExp(AAIgualExp node)
	{
		if (node.getEsq() instanceof AANumeroExp &&
			node.getDir() instanceof AANumeroExp)
		{
			node.replaceBy(new AANumeroExp());
		}
		else if (node.getEsq() instanceof AABooleanoExp &&
				 node.getDir() instanceof AABooleanoExp)
		{
			node.replaceBy(new AABooleanoExp());
		}
		else
		{
			System.out.println("Erro semântico de módulo");
		}
	}
	
	public void outAAOrExp(AAOrExp node)
	{
		if (node.getEsq() instanceof AABooleanoExp &&
			node.getDir() instanceof AABooleanoExp)
		{
			node.replaceBy(new AABooleanoExp());
		}
		else
		{
			System.out.println("Erro semântico de ou");
		}
	}
	
	public void outAAAndExp(AAAndExp node)
	{
		if (node.getEsq() instanceof AABooleanoExp &&
			node.getDir() instanceof AABooleanoExp)
		{
			node.replaceBy(new AABooleanoExp());
		}
		else
		{
			System.out.println("Erro semântico de e");
		}
	}
	
	public void outAADifExp(AADifExp node)
	{
		if (node.getExp() instanceof AABooleanoExp)
		{
			node.replaceBy(new AABooleanoExp());
		}
		else
		{
			System.out.println("Erro semântico de negação");
		}
	}
}
