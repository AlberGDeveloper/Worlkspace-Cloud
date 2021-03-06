package spring.entidad;

public class Rezo extends Arma {

	private int rezoDeSanacion;

	@Override
	public int usar() {
		int daņoGeneral = super.usar();
		int numeroAleatorio = Util.generadorNumeros(1, 75);
		if (numeroAleatorio <= rezoDeSanacion) {
			System.out.println("REZO!!!!");
			daņoGeneral = daņoGeneral * 2;
		}

		return daņoGeneral;
	}

	public int getProcentajeMagiaCaotica() {
		return rezoDeSanacion;
	}

	public void setProcentajeMagiaCaotica(int procentajeMagiaCaotica) {
		this.rezoDeSanacion = rezoDeSanacion;
	}

}
