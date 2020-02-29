package quase;

public class Simbolo {
	String tipo, nome, valor;
	
	public Simbolo(String tipo, String nome) {
		this.tipo = tipo;
		this.nome = nome;
	}
	
	public Simbolo(String tipo, String nome, String valor) {
		this.tipo = tipo;
		this.nome = nome;
		this.valor = valor;
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
	
	@Override
    public boolean equals(Object obj) 
    {
        return obj instanceof Simbolo
               && this.nome.equals(((Simbolo) obj).getNome());
    }
}
