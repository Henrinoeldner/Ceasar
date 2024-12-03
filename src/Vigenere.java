//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Vigenere extends Kryptomat {


    public Vigenere() {
        gt = "";
        kt = "";
        s = "a";
    }

    /**
     * setzt gt auf eine, mit Vigener verschluesselte Version von kt
     * x´ste Buchstabe von gt wird mit dem x´sten Buchstaben von s addirt
     */
    public void verschluesseln() {
        String speicher;
        //geheimtext wird gelehrt
        gt = "";
        //tkt wird auf eine großgeschriebene Variante von kt gesetzt
        String tkt = kt.toUpperCase();
        //gSchluessel wirde auf eine großgeschriebene Variante von kt gesetzt
        String gSchluessel = s.toUpperCase();
        for (int i = 0; i < tkt.length(); i++) {
            //Wandelt den Buchstaben an der Stelle i in eine Zahl um und speichert diese in h
            int h = this.getAscii(tkt.charAt(i));
            //sTemporer wird auf den asciff wert vom Buchstaben an Stelle gesetzt
            //-65 damit A=0 und %26 damit der wert in einer spaeteren Rechnung funktioniert (damit nicht groeßer als 26)
            int stemporer = (gSchluessel.charAt(i % gSchluessel.length()) - 65) % 26;
            //Addirt h und den schlüssel und sorgt dafuer, das das ergebnis ein Großbuchstabe ist
            //-13, da wir teoretisch auch durch -65 rechnen um den asciff von A gleich 0 zu setzten. Da wir im naechste Schritt modula zu 26 rechnen reicht -13 aus(65%26=13)
            //%26, um zu verhindern, dass unsere Zahl aus dem Alphabet hinausgeht.
            //+65 damit unsere Zahl wieder den Großbuchstaben i Asciff entspricht
            speicher = String.valueOf(this.getChar(((h + stemporer - 13) % 26) + 65));
            //Past groß und kleinschreibung an, abheangig von kt
            if (kt.charAt(i) < 96) {
                gt += speicher;
            } else {
                gt += speicher.toLowerCase();
            }
        }
    }

    /**
     * setzt kt auf eine, mit Vigenere entschluesselte Version von gt
     * x´ste Buchstabe von gt wird mit dem x´sten Buchstaben von s subtrahiert
     */
    public void entschluesseln() {
        String speicher;
        //Klartext wird gelehrt
        kt = "";
        //tkt wird auf eine großgeschriebene Variante von kt gesetzt
        String tgt = gt.toUpperCase();
        //gSchluessel wird auf eine großgeschriebene Variante von kt gesetzt
        String gSchluessel = s.toUpperCase();
        for (int i = 0; i < tgt.length(); i++) {
            //Wandelt den Buchstaben an der Stelle i in eine Zahl um und speichert diese in h
            int h = this.getAscii(tgt.charAt(i));
            //sTemporer wird auf den asciff wert vom Buchstaben an Stelle gesetzt
            //-65 damit A=0 und %26 damit der wert in einer spaeteren Rechnung funktioniert (damit nicht groeßer als 26)
            int stemporer = (gSchluessel.charAt(i % gSchluessel.length()) - 65) % 26;
            //Addirt h und stemporer und sorgt dafuer, das das ergebnis ein Großbuchstabe ist
            //-13, da wir teoretisch auch durch -65 rechnen um den asciff von A gleich 0 zu setzten. Um zu verhindern, das unsere Zahl negativ wirde rechnen wir nur -13 (kleinste zahl 65 - größte zahl 26 -13>0
            //%26, um zu verhindern, dass unsere Zahl aus dem Alphabet hinausgeht.
            //+65 damit unsere Zahl wieder den Großbuchstaben i Asciff entspricht
            speicher = String.valueOf(this.getChar(((h - stemporer - 13) % 26) + 65));
            //Past groß und kleinschreibung an, abheangig von gt
            if (gt.charAt(i) < 96) {
                kt += speicher;
            } else {
                kt += speicher.toLowerCase();
            }
        }
    }
}