package spring.videojuego;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.controlador.Arena;
import spring.entidad.Personaje;
import spring.entidad.Util;

public class ClasePrincipalSpring {

	public static ApplicationContext context = null;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("recursos/Context.xml");

		Personaje arquero = context.getBean("arquero", Personaje.class);
		Personaje mago = context.getBean("mago", Personaje.class);
		Personaje guerrero = context.getBean("guerrero", Personaje.class);
		Personaje curandero = context.getBean("curandero", Personaje.class);
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
