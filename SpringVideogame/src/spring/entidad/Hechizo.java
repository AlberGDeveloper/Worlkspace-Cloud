package spring.entidad;

public class Hechizo extends Arma{

	private int procentajeMagiaCaotica;
	
	@Override
	public int usar() {
		int daņoGeneral = super.usar();
		int numeroAleatorio = Util.generadorNumeros(1, 100);
		if(numeroAleatorio <= procentajeMagiaCaotica) {
			System.out.println("MAGIA CAOTICA!!");
			daņoGeneral = daņoGeneral * 2;
		}
		
		return daņoGeneral;
	}

	public int getProcentajeMagiaCaotica() {
		return procentajeMagiaCaotica;
	}

	public void setProcentajeMagiaCaotica(int procentajeMagiaCaotica) {
		this.procentajeMagiaCaotica = procentajeMagiaCaotica;
	}

	
}
