package sneakerLove.kunde;

public class Kunde {

    private String vorname;
    private String nachname;
    private String benutzername;
    private String passwort;
    private String email;

    private Adresse adresse;

    public Kunde() {

    }

    public Kunde(String vorname, String nachname, String benutzername, String passwort, String email, Adresse adresse) {
	this.vorname = vorname;
	this.nachname = nachname;
	this.benutzername = benutzername;
	this.passwort = passwort;
	this.email = email;
	this.adresse = adresse;
    }

    public String getVorname() {
	return vorname;
    }

    public String getNachname() {
	return nachname;
    }

    public String getBenutzername() {
	return benutzername;
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
