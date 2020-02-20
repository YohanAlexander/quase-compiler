package quase;

import java.util.ArrayList;
import java.util.List;

import quase.analysis.*;
import quase.node.*;


public class Semantico extends DepthFirstAdapter {

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

	//@Override
	public void AParametroParametro(AParametroParametro node)
	{
		System.out.println("-------------------------------------------------");
		System.out.println("O tipo desta declaração é " + node.getTipo());
		System.out.print("Variáveis: " + node.getId());
    	System.out.println();
    	System.out.println("Ações a serem tomadas na tabela de símbolos:");
    	System.out.println("-->Inserir ( "+ node.toString()+")");

	}

}
