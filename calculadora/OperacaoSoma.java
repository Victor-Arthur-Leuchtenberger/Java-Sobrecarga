package calculadora;

public class OperacaoSoma {
	
	private int num1, num2, num3;
	
	public OperacaoSoma(int n1, int n2, int n3) {
		this.num1 = n1;
		this.num2 = n2;
		this.num3 = n3;
	}
	
	public int CalcularSoma() {
		int resultado = num1 + num2 + num3;
		return resultado;
	}
}
