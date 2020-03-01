package quase;

import java.util.ArrayList;

public class Simbolo {

	String tipo, nome, valor;
	ArrayList<String> parametros;

	public Simbolo(String tipo, String nome) {
		this.tipo = tipo;
		this.nome = nome;
	}

	public Simbolo(String tipo, String nome, String valor) {
		this.tipo = tipo;
		this.nome = nome;
		this.valor = valor;
	}

	public Simbolo(String tipo, String nome, String valor, ArrayList<String> parametros) {
		this.tipo = tipo;
		this.nome = nome;
		this.valor = valor;
		this.parametros = parametros;
	}

	public void setTipo(String tipo)
	{
		this.tipo = tipo;
	}

	public String getTipo()
	{
		return this.tipo;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public String getNome()
	{
		return this.nome;
	}

	public void setValor(String valor)
	{
		this.valor = valor;
	}

	public String getValor()
	{
		return this.valor;
	}

	public void addParametro(String par)
	{
		this.parametros.add(par);
	}

	public String getParametro(int i)
	{
		return this.parametros.get(i);
	}

	public int numParametros()
	{
		return this.parametros.size();
	}

	@Override
    public boolean equals(Object obj)
    {
        return obj instanceof Simbolo
               && this.nome.equals(((Simbolo) obj).getNome());
    }

}
