/**package spring.videojuego;

import java.util.ArrayList;
import java.util.List;

import spring.controlador.Arena;
import spring.entidad.Arco;
import spring.entidad.Arma;
import spring.entidad.Hechizo;
import spring.entidad.Healer;
import spring.entidad.Espada;
import spring.entidad.Guerrero;
import spring.entidad.Mago;
import spring.entidad.Personaje;
import spring.entidad.Rezo;
import spring.entidad.Util;

public class ClasePrincipal {

	public static void main(String[] args) {
		Personaje guerrero = new Guerrero();
		Personaje curandero = new Healer();
		Personaje mago = new Mago();
		Arma espada = new Espada();
		Arma arco = new Arco();
		Arma rezo = new Rezo();
		Arma hechizo = new Hechizo();

		guerrero.setNombre("Conan");
		guerrero.setNivel(3);
		guerrero.setPuntosVida(150);
		guerrero.setIniciativa(5);
		guerrero.setArma(espada);

		rezo.setDañoMaximo(20);
		rezo.setDañoMinimo(5);

		curandero.setNombre("Scooby");
		curandero.setNivel(5);
		curandero.setPuntosVida(150);
		curandero.setIniciativa(4);
		curandero.setArma(rezo);

		hechizo.setDañoMaximo(20);
		hechizo.setDañoMinimo(10);
		((Hechizo) hechizo).setProcentajeMagiaCaotica(50);

		mago.setNombre("Gandalf");
		mago.setNivel(7);
		mago.setPuntosVida(150);
		mago.setIniciativa(6);
		mago.setArma(hechizo);
		((Mago) mago).setInteligencia(4);

		List<Personaje> listaPersonajes = new ArrayList<Personaje>();
		listaPersonajes.add(guerrero);
		listaPersonajes.add(curandero);
		listaPersonajes.add(mago);

		int contrincante1 = Util.generadorNumeros(0, 3);
		int contrincante2 = 0;
		do {
			contrincante2 = Util.generadorNumeros(0, 3);
		} while (contrincante1 == contrincante2);

		Personaje luchador1 = listaPersonajes.get(contrincante1);
		Personaje luchador2 = listaPersonajes.get(contrincante2);

		Arena arena = new Arena(luchador1, luchador2);
		Personaje pg = arena.combate();

		System.out.println("Personaje ganador!!" + pg.getNombre());

	}

}
**/