package classe;

public class Produto {
	
	String nome;
	double preco;
	static double desconto = 0.25;
	
	//Contrutores
	Produto(){
		
	}
	
	Produto(String nomeInicial, double precoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
	}
	
	//Métodos
	double precoComDesconto () {
		return preco * (1 - desconto);
	}
	
	double precoComDesconto(double descontoDoGerente) {
		return preco * (1 - desconto + descontoDoGerente);
	}
	
}
