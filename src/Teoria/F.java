package Teoria;

public class F extends B implements D{
	
	@Override
	public void mentodoA1() {
		System.out.println("Sobreescrito m�todo A1");
	}

	@Override
	public int metodoD(int numero) {
		// TODO Auto-generated method stub
		return numero * 3;
	}
}