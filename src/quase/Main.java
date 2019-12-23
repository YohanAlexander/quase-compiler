package quase;

import quase.lexer.*;
import quase.node.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		try
		{
			String arquivo = "teste/primo.quase";

			Lexer lexer = new Lexer(new PushbackReader(new FileReader(arquivo), 1024)); 
			Token token;
			while(!((token = lexer.next()) instanceof EOF))
			{
				System.out.print(token.getClass());
				System.out.println(" ( "+token.toString()+")");
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
