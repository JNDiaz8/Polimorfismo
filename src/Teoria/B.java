package Teoria;

public class B implements A {

	@Override
	public void mentodoA1() {
		System.out.println("Implementado m�todo A1");
	}

	@Override
	public void metodoA2(String argumento) {
		System.out.println("En el m�todo A2 " + argumento);
	}

}