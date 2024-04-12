package calculadora;

public class Operacao {
	
	private int nFatorial = 0;
	private int numero1 = 0;
	private int numero2 = 0;
	
	public int soma(int n1, int n2) {
		return n1 + n2;
	}

	public int getNumero1() {
		return numero1;
	}
	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}
	public int getNumero2() {
		return numero2;
	}
	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}
	
	public int subtracao() {
		return numero1 - numero2;
	}
	
	public int multiplicacao() {
		return numero1 * numero2;
	}
	
	public int divisao() {
		return numero1 / numero2;
	}
		
	
	public void setFatorial(int n) {
		this.nFatorial = n;
	}
	
	public int fatorialRecursivo(int n) {
		if (n == 1 || n == 0) {
			return 1;
		} else {
			return fatorialRecursivo(n - 1) * n;
		}
	}
	public int getFatorial() {
		return fatorialRecursivo(nFatorial);
	}
}