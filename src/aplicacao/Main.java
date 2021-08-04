package aplicacao;

import java.util.ArrayList;

import entidades.Produto;
import entidades.Usuario;

public class Main {

	public static void listaUsuario (Usuario user) {
		System.out.println("Nome Funcionario: "
				+ user.getNome()
				+ "\n"
				+ "Função: "
				+ user.getFuncao());
	}

	public static void listaProduto(Produto produto) {
		System.out.println("Nome do Produto: "
				+ produto.getNomeProd()
				+ "\n"
				+ "Codigo Produto: "
				+ produto.getCodigo()
				+ "\n"
				+ "Quantidade em estoque: "
				+ produto.getEstoque());
	}

	public static void main(String[] args) {



		ArrayList<Usuario> funcionario = new ArrayList<Usuario>();
		ArrayList<Produto> produtos = new ArrayList<Produto>();


		/* Cadastrando Funcionario */

		Usuario usuario = new Usuario("Mateus Barbosa", "Auxiliar");

		Usuario usuario1 = new Usuario("Jhonatan Cardoso", "Administração");

		Usuario usuario2 = new Usuario("Luiza Silva", "Recepção");

		funcionario.add(usuario);
		funcionario.add(usuario1);
		funcionario.add(usuario2);

		/* Cadastrar dados Produtos*/

		Produto itens = new Produto("Copo", 12323, 12);
		Produto itens1  = new Produto("Prato", 34234, 10);

		produtos.add(itens);      /* Adicionando ao Array*/
		produtos.add(itens1);


		/* Percorrendo Arrays*/

		for (Usuario f : funcionario ) {

			listaUsuario(f);
			System.out.println("----------------------------");

		}

		System.out.println("----------------------------");

		for (Produto p : produtos) {

			listaProduto(p);
			System.out.println("----------------------------");
		}

	}

}