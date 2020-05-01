package tracklink_rest.tracklink.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

import org.bson.types.ObjectId;
@Document(collection = "Cliente")
public class Cliente implements Serializable{

	@Id private ObjectId  _id;
	
	private String nombre;
	private String apellidoP;
	private String apellidoM;
	private String edad;
	public ObjectId  getId() {
		return _id;
	}
	public void setId(ObjectId  _id) {
		this._id = _id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidoP() {
		return apellidoP;
	}
	public void setApellidoP(String apellidoP) {
		this.apellidoP = apellidoP;
	}
	public String getApellidoM() {
		return apellidoM;
	}
	public void setApellidoM(String apellidoM) {
		this.apellidoM = apellidoM;
	}
	public String getEdad() {
		return edad;
	}
	public void setEdad(String edad) {
		this.edad = edad;
	}
	
}
