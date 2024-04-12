package calculadora;

public class OperacaoPotencia {
	
	private int base;
	private int expoente;
	
	public OperacaoPotencia(int base, int expoente) {
		this.base = base;
		this.expoente = expoente;
	}
	
	public int CalcularPotencia() {
		int resultado = 1;
		for(int i = 0; i < expoente; i++) {
			resultado *= base;
		}
		return resultado;
	}
}
