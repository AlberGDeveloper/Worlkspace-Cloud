package uem.entidad;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Direccion {

	private String tipoVia;
	private String nombrevia;
	private String cp;

	public String getTipoVia() {
		return tipoVia;
	}

	public void setTipoVia(String tipoVia) {
		this.tipoVia = tipoVia;
	}

	public String getNombrevia() {
		return nombrevia;
	}

	public void setNombrevia(String nombrevia) {
		this.nombrevia = nombrevia;
	}

	public String getCp() {
		return cp;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}

}
