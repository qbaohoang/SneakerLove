package sneakerLove.kunde;

public class Kunde {

	private String vorname;
	private String nachname;
	private String nutzername;
	private String passwort;
	private String email;
// TODO: ID_Kunde
	private Adresse adresse;

	public Kunde() {

	}

	public Kunde(String vorname, String nachname, String email, String nutzername, String passwort) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.nutzername = nutzername;
		this.passwort = passwort;
		this.email = email;
	}

	public String getVorname() {
		return vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public String getNutzername() {
		return nutzername;
	}

	public String getPasswort() {
		return passwort;
	}

	public String getEmail() {
		return email;
	}

	public Adresse getAdresse() {
		return adresse;
	}

}
