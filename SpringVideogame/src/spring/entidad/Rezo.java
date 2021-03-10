package spring.entidad;

public class Rezo extends Arma {

	private int rezoDeSanacion;

	@Override
	public int usar() {
		int dañoGeneral = super.usar();
		int numeroAleatorio = Util.generadorNumeros(1, 75);
		if (numeroAleatorio <= rezoDeSanacion) {
			System.out.println("REZO!!!!");
			dañoGeneral = dañoGeneral * 2;
		}

		return dañoGeneral;
	}

	public int getProcentajeMagiaCaotica() {
		return rezoDeSanacion;
	}

	public void setProcentajeMagiaCaotica(int procentajeMagiaCaotica) {
		this.rezoDeSanacion = rezoDeSanacion;
	}

}
