package sneakerLove.kunde;

public class Adresse {

    private String strasse;
    private String plz;
    private String ort;

    public Adresse() {

    }

    public Adresse(String strasse, String plz, String ort) {
	this.strasse = strasse;
	this.plz = plz;
	this.ort = ort;
    }

    public String getStrasse() {
	return strasse;
    }

    public String getPlz() {
	return plz;
    }

    public String getOrt() {
	return ort;
    }

}
