package fundamentos.operadores;

public class DesafioLogicos {
	public static void main(String[] args) {
		// Trabalho na terça (V ou F)
		// Trabalho na quinta (V ou F)
		
		boolean trabalhoTerca = true;
		boolean trabalhoQuinta = true;
		
		boolean comprouTv50 = trabalhoTerca && trabalhoQuinta;
		boolean comprouTv32 = trabalhoTerca ^ trabalhoQuinta;
		boolean comprouSorvete = trabalhoTerca || trabalhoQuinta;		
		
		System.out.println("Comprou Tv de 50\"? " + comprouTv50);
		System.out.println("Comprou Tv de 32\"? " + comprouTv32);
		System.out.println("Comprou Tv de Sorvete? " + comprouSorvete);
		System.out.println("Mais saudavel? " + !comprouSorvete);
	}
}
