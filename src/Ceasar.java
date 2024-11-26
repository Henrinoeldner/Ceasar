//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Ceasar extends Kryptomat{
    private int sc;

    //im constructor werden gt, kt und s auf null beziunghweise auf ein lehren String gesetzt
    public Ceasar(){
        gt="";
        kt="";
        s="0";
        sc=(int)s.charAt(0);
    }
    //verschluesseln() verschlüsselt den Klartext(kt) durch addition mit dem schlüssel(s)
    public void verschluesseln(){
        sc=(int)s.charAt(0);
        String speicher;
        //geheimtext wird gelehrt
        gt="";
        //tkt wird auf eine großgeschriebene variante von kt gesetzt
        String tkt= kt.toUpperCase();
        for(int i=0;i<tkt.length();i++){
            //Wandelt den Buchstaben an der Stelle i in eine Zahl um und speichert diese in h
            int h = this.getAscif(tkt.charAt(i));
            //Addirt h und den schlüssel und sorgt dafuer, das das ergebnis ein Großbuchstabe ist
            //s%26, da für uns zahlen die groeßer sid als 26 nicht relevant sind, sondern nur der rest. Verhindert das sie Zahl, mit der wir weiter rechnen zu groß wird
            //-13, da wir teoretisch auch durch -65 rechnen um den asciff von A gleich 0 zu setzten. Da wir im naechste Schritt modula zu 26 rechnen reicht -13 aus(65%26=13)
            //%26, um zu verhindern, dass unsere Zahl aus dem Alphabet hinausgeht.
            //+65 damit unsere Zahl wieder den Großbuchstaben i Asciff entspricht
            speicher= String.valueOf(this.getChar(((h+(sc%26)-13)%26) +65));
            //Past groß und kleinschreibung an, abheangig von kt
            if (kt.charAt(i)<96){
                gt+=speicher;
            }else{
                gt+=speicher.toLowerCase();
            }

        }
    }
    public void entschluesseln(){
        sc=(int)s.charAt(0);
        String speicher;
        //der Klartext(kt) wird gelehrt
        kt="";
        //tgt wird auf Eine großgeschriebene variante von gt gesetzt
        String tgt= gt.toUpperCase();
        for(int i=0;i<tgt.length();i++) {
            // h wird auf den asciff wert von dem Buchstaben von tgt an stelle i gesetzt
            int h = this.getAscif(tgt.charAt(i));
            //Addirt h und den schlüssel und sorgt dafuer, das das ergebnis ein Großbuchstabe ist
            //s%26, da für uns zahlen die groeßer sid als 26 nicht relewant sind, sondern nur der rest. Verhindert das sie Zahl, mit der wir weiter rechnen zu groß wird
            //-13, da wir teoretisch auch durch -65 rechnen um den asciff von A gleich 0 zu setzten. Um zu verhindern, dass unsere Zahl negativ wirde rechnen wir nur -13 (kleinste zahl 65 - größte zahl 26 -13>0
            //%26, um zu verhindern, dass unsere Zahl aus dem Alphabet hinausgeht.
            //+65 damit unsere Zahl wieder den Großbuchstaben i Asciff entspricht
            speicher= String.valueOf(this.getChar(((h-(sc%26)-13)%26) +65));
            //Past groß und kleinschreibung an, abheangig von gt
            if (gt.charAt(i)<96){
                kt+=speicher;
            }else{
                kt+=speicher.toLowerCase();
            }
        }
    }





}