package quase;

import java.util.ArrayList;
import java.util.List;

import java.util.LinkedHashMap;
import java.util.LinkedList;

import quase.analysis.*;
import quase.node.*;


public class Semantico extends DepthFirstAdapter {

	LinkedList<LinkedHashMap<String, Integer>> table = new LinkedList<LinkedHashMap<String, Integer>>();

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

}
