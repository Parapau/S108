package N3E1;

import java.util.Objects;

public class Alumne {
	String nom, curs;
	int edat, nota;
	public Alumne(String nom, String curs, int edat, int nota) {
		super();
		this.nom = nom;
		this.curs = curs;
		this.edat = edat;
		this.nota = nota;
	}
	public String getNom() {
		return nom;
	}
	public String getCurs() {
		return curs;
	}
	public int getEdat() {
		return edat;
	}
	public int getNota() {
		return nota;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setCurs(String curs) {
		this.curs = curs;
	}
	public void setEdat(int edat) {
		this.edat = edat;
	}
	public void setNota(int nota) {
		this.nota = nota;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(curs, edat, nom, nota);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumne other = (Alumne) obj;
		return Objects.equals(curs, other.curs) && edat == other.edat && Objects.equals(nom, other.nom)
				&& nota == other.nota;
	}
	@Override
	public String toString() {
		return "Hem dic " + getNom() + " tinc " + getEdat() + " anys i estic treien un " + getNota() + " al curs de " + getCurs();
	}
}
