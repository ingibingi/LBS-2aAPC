/*
 * Beispielanwendung: das Interface Transportierbar
 */

public interface Transportierbar
{
    public final float MAX_GEWICHT_PRO_FLAECHE = 29.99F;

    // alle Methoden in Interfaces sind implizit public und abstract
    // alle vier Methodendeklarationen sind zulässig
    // jede dieser Methoden ist public und abstract
    float gewicht();
    float laenge();
    float breite();
    float hoehe();

    boolean zerbrechlich();
    String beschriftung();
}