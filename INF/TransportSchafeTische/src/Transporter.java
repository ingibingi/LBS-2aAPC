import static java.lang.Math.max;
import static java.lang.Math.min;

public class Transporter {
    float lfLaenge;
    float lfBreite;
    float lfHoehe;
    float maxZuladung;

    public Transporter(float lfLaenge, float lfBreite, float lfHoehe, float maxZuladung){
        this.lfLaenge = lfLaenge;
        this.lfBreite = lfBreite;
        this.lfHoehe = lfHoehe;
        this.maxZuladung = maxZuladung;
    }

    public boolean hatPlatz(float laenge, float breite, float hoehe){
        boolean hatPlatz = true;

        float gutLang = max(laenge, breite);
        float gutKurz = min(laenge, breite);

        float flaecheLang = max(lfLaenge, lfBreite);
        float flaecheKurz = min(lfLaenge, lfBreite);

        if(gutLang > flaecheLang){
            hatPlatz = false;
        } else if (gutKurz > flaecheKurz) {
            hatPlatz = false;
        }

        if(hoehe > this.lfHoehe){
            hatPlatz = false;
        }

        return hatPlatz;
    }
    public boolean istGewichtOK(float gewicht){
        boolean istOK = (gewicht <= this.maxZuladung);
        return istOK;
    }

}
