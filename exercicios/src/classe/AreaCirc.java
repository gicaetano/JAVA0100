package classe;

public class AreaCirc {
	
	double raio;
	double pi = 3.14;
	
	AreaCirc(double raioInicial) {
		raio = raioInicial;
	}
	
	double area() {
		return pi * Math.pow(raio, 2);
	}

}