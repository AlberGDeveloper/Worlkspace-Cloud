package uem.entidad;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Casa {
	private Direccion direccion;
	@Autowired
	@Qualifier("habitacion")
	private ArrayList<Habitacion> habitaciones;
	@Autowired
	@Qualifier("persona")
	private Persona propietario;
	@Autowired
	private ArrayList<Persona> inquilinos;
	private double metros;

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public ArrayList<Habitacion> getHabitaciones() {
		return habitaciones;
	}

	public void setHabitaciones(ArrayList<Habitacion> habitaciones) {
		this.habitaciones = habitaciones;
	}

	public Persona getPropietario() {
		return propietario;
	}

	public void setPropietario(Persona propietario) {
		this.propietario = propietario;
	}

	public ArrayList<Persona> getInquilinos() {
		return inquilinos;
	}

	public void setInquilinos(ArrayList<Persona> inquilinos) {
		this.inquilinos = inquilinos;
	}

	public double getMetros() {
		double Metros = 0;
		for (Habitacion habitacion : habitaciones) {
			Metros += habitacion.getMetros();
		}
		metros = Metros;
		return metros;

	}

	public void setMetros(double metros) {
		this.metros = metros;
	}

	@Override
	public String toString() {
		return "Casa [direccion=" + direccion + ", habitaciones=" + habitaciones + ", propietario=" + propietario
				+ ", inquilinos=" + inquilinos + ", metros=" + metros + "]";
	}

}
