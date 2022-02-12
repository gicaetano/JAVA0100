package classe;

public class DataTeste {
	
	public static void main(String[] args) {
		
		Data d1 = new Data();
		//d1.dia = 16;
		//d1.mes = 11;
		//d1.ano = 1985;
		
		var d2 = new Data(04, 07, 2006);
		//d2.dia = 04;
		//d2.mes = 07;
		//d2.ano = 2006;
		
		String dataFormatada1 = d1.obterDataFormatada();
		
		System.out.printf(dataFormatada1);
		System.out.println(d2.obterDataFormatada());
		
		
	}

}
