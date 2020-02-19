package quase;

import java.util.ArrayList;
import java.util.List;

import quase.analysis.*;
import quase.node.*;

// Nesta classe eu defino as ações de acordo com os nós, sobrescrevendo 
// os métodos da classe DepthFirstAdapter quando necessário.
// Evitem dar override nos métodos caseXXX. Caso precisem, garantam que
// os comandos de acesso aos nós filhos não são apagados nem que
// tenham sua ordem de chamada invertida.
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
	 
	 /*TODO
	 @Override
	 //neste ponto eu assumo que acabei de sair de um nó declaração
	 //logo, seus filhos já foram visitados.
	 public void outTOKEN(TOKEN node)
	    {
		 //O nó atual (node) tem dois filhos: tipo (node.getTipo) 
		 //e uma lista de ids (node.getIdentificadores()). 
		 //Olhem o arquivo com a classe do nó quando precisarem saber 
		 //quais são os filhos possíveis.
		 //Neste caso, as informações estão em ADeclaracoesDeclaracao.java 
		 
		 
		 // node.getTipo é do tipo abstrato PTipo. Quando precisarem identificar 
		 // que instância de um nó está sendo usada, vocês
		 // devem verificar quem são as filhas dela no pacote tipo.node
		 // Neste exemplo, node.getTipo pode ser uma instância de TReal ou 
		 // de TInteiro.		 
		  System.out.println("-------------------------------------------------");
		  System.out.println("O tipo desta declaração é " + node.getTipo());
		  
		  //node.getIdentificadores é a lista de nome de veriáveis. Ela é uma lista porque eu 
		  //a defini desta maneira na minha gramática abstrata.
		  System.out.print("Variáveis: ");
		  List<PVar> copy = new ArrayList<PVar>(node.getIdentificadores());
          for(PVar e : copy)
          {
        	  //e contém o token associado a cada var da lista. 
              System.out.print(e.toString());
          } 
          System.out.println();
          System.out.println("Ações a serem tomadas na tabela de símbolos:");
          for(PVar e : copy)
          {
              System.out.println("-->Inserir ( "+ e.toString()+", " +node.getTipo()+")");
          }
	    }*/
	 

	 
}
