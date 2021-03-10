package spring.entidad;

public class Rezo extends Arma {

	private int rezoDeSanacion;

	@Override
	public int usar() {
		int da�oGeneral = super.usar();
		int numeroAleatorio = Util.generadorNumeros(1, 75);
		if (numeroAleatorio <= rezoDeSanacion) {
			System.out.println("REZO!!!!");
			da�oGeneral = da�oGeneral * 2;
		}

		return da�oGeneral;
	}

	public int getProcentajeMagiaCaotica() {
		return rezoDeSanacion;
	}

	public void setProcentajeMagiaCaotica(int procentajeMagiaCaotica) {
		this.rezoDeSanacion = rezoDeSanacion;
	}

}
