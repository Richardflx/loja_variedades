package entidades;

public class Usuario {
	private String nome;
	private String funcao;



	public Usuario (String nome, String funcao) {
		this.nome = nome;
		this.funcao = funcao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
}