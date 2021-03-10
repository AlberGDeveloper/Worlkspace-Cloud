package uem.negocio;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import uem.entidad.Casa;

public class MainSpring {
	
	public static ApplicationContext context = null;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("recursos/context.xml");
		
		Casa casa = (Casa) context.getBean("casa");
		System.out.println(casa); 
	}

}
