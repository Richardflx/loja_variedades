package entidades;

public class Produto {

	private String nomeProd;
	private int codigo;
	private int estoque;

	public Produto(String nomeProd ,int codigo, int estoqueInicial){
		this.nomeProd = nomeProd;
		this.codigo = codigo;
		deposito(estoqueInicial);
	}

	public String getNomeProd() {
		return nomeProd;
	}

	public void setNomeProd(String nomeProd) {
		this.nomeProd = nomeProd;
	}

	public int getCodigo() {
		return codigo;
	}

	public int getEstoque() {
		return estoque;
	}

	public int deposito(int quantidade) {
		return estoque += quantidade;
	}

	public int depositoTirar(int quantidade) {
		return estoque -= quantidade;
	}

}