package classe;

public class ValorVsReferencia {
	
	public static void main(String[] args) {
		
		double a = 2;
		double b = a;   //Atribuição por valor (Tipo Primitivo)
		
		a++;
		b--;
		
		System.out.print(a + " " + b);
		
		Data d1 = new Data(1, 6, 2022);
		Data d2 = d1;   //Atribuição por referência (Objeto)
		
		d1.dia = 31;
		d2.mes = 12;
		
		d1.ano = 2025;
		
		System.out.print(d1.obterDataFormatada());
		System.out.print(d2.obterDataFormatada());
		
		voltarDataParaValorPadrao(d1);
		System.out.print(d1.obterDataFormatada());
		System.out.print(d2.obterDataFormatada());
		
		int c = 5;
		alterarPrimitivo(c);
		System.out.println(c);
	}
	
	static void voltarDataParaValorPadrao(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.mes = 1970;
	}
	
	static void alterarPrimitivo(int a) {
		a ++;
	}

}
