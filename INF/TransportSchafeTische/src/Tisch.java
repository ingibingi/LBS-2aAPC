/*
 * Beispielanwendung: die Tisch-Klasse implementiert das Interface
 */

public class Tisch implements Transportierbar
{
    public String kennzeichnung;
    public boolean zerbrechlich;
    public float gewicht, laenge, hoehe, breite;

    public Tisch (String name, boolean zerbrechlich, float gewicht, float laenge, float breite, float hoehe)
    {
        kennzeichnung = name;
        this.zerbrechlich = zerbrechlich;
        this.gewicht = gewicht;
        this.laenge = laenge;
        this.breite = breite;
        this.hoehe = hoehe;
    }

    public float gewicht()
    {
        return gewicht;
    }
    public float laenge()
    {
        return laenge;
    }
    public float breite()
    {
        return breite;
    }
    public float hoehe()
    {
        return hoehe;
    }
    public boolean zerbrechlich()
    {
        return zerbrechlich;
    }
    public String beschriftung()
    {
        String text = "Tisch " + kennzeichnung;

        return text;
    }
}