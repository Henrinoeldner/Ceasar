//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Ceasar {
    private String gt;
    private String kt;
    private int s;

    //imkonstuktor werden gt, kt und s auf null beziunghweise auf ein lehren String gesetzt
    public Ceasar(){
        gt="";
        kt="";
        s=0;
    }
    //verschluesseln() verschlüsselt den Klartext(kt) durch addition mit dem schlüssel(s)
    public void verschluesseln(){
        //geheimtext wird gelehrt
        gt="";
        //tkt wirde auf eine großgeschriebene wariante von kt gestzt
        String tkt= kt.toUpperCase();
        for(int i=0;i<tkt.length();i++){
            //Wandelt den Buchstaben an der Stelle i in eine Zahl um und speichert diese in h
            int h = this.getAscif(tkt.charAt(i));
            //Addirt h und den schlüssel und sorgt dafuer, das das ergebnis ein Großbuchstbe ist
            //s%26, da für uns zahlen die groeßer sid als 26 nicht relewant sind, sondern nur der rest. Verhindert das sie Zahl, mit der wir weiter rechnen zu groß wird
            //-13, da wir teoretisch auch durch -65 rechnen um den asciff von A gleich 0 zu setzten. Da wir im nachste Schritt modula zu 26 rechnen reicht -13 aus(65%26=13)
            //%26, um zu verhindern, dass unsere Zahl aus dem Alphabet hinausgeht.
            //+65 damit unsere Zahl wieder den Großbuchstaben i Asciff entspricht
            gt= gt + this.getChar(((h+(s%26)-13)%26) +65);
        }
    }
    public void entschluesseln(){
        //der Klartext(kt) wird gelehrt
        kt="";
        //tgt wird auf Eine Großgeschreibene variante von gt gestzt
        String tgt= gt.toUpperCase();
        for(int i=0;i<tgt.length();i++) {
            // h wird auf den asciff wert von dem Buchstaben von tgt an stelle i gesetzt
            int h = this.getAscif(tgt.charAt(i));
            //Addirt h und den schlüssel und sorgt dafuer, das das ergebnis ein Großbuchstbe ist
            //s%26, da für uns zahlen die groeßer sid als 26 nicht relewant sind, sondern nur der rest. Verhindert das sie Zahl, mit der wir weiter rechnen zu groß wird
            //-13, da wir teoretisch auch durch -65 rechnen um den asciff von A gleich 0 zu setzten. Um zu verhindern das unsere Zahl negativ wirde rechnen wir nur -13 (kleinste zahl 65 - größte zahl 26 -13>0
            //%26, um zu verhindern, dass unsere Zahl aus dem Alphabet hinausgeht.
            //+65 damit unsere Zahl wieder den Großbuchstaben i Asciff entspricht
            kt +=  this.getChar(((h-(s%26)-13)%26) +65);
        }


    }
    private char getChar(int pWert){
        return (char) pWert;
    }
    private int getAscif(char pWert){
        return (int) pWert;
    }
    public String getGt(){
        return gt;
    }
    public void setGt(String pGt){
        gt=pGt;
    }
    public String getKt(){
        return kt;
    }
    public void setKt(String pKt){
        kt=pKt;
    }
    public int getS(){return s;}
    public void setS(int pschluessel){s=pschluessel;}




}