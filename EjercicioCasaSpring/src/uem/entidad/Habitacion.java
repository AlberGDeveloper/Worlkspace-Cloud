package uem.entidad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Habitacion {
	
	@Autowired
	private TipoHabitacion tipo;
	private double metros;
	
	public TipoHabitacion getTipo() {
		return tipo;
	}
	public void setTipo(TipoHabitacion tipo) {
		this.tipo = tipo;
	}
	public double getMetros() {
		return metros;
	}
	public void setMetros(double metros) {
		this.metros = metros;
	}
	@Override
	public String toString() {
		return "Habitacion [tipo=" + tipo + ", metros=" + metros + "]";
	}
	
	

}
