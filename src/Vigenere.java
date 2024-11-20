//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Vigenere {
    private String gt;
    private String kt;
    private String s;

    public Vigenere(){
        gt="";
        kt="";
        s="a";
    }
    public void verschluesseln(){
        //geheimtext wird gelehrt
        gt="";
        //tkt wirde auf eine großgeschriebene Variante von kt gesetzt
        String tkt= kt.toUpperCase();
        //gSchluessel wirde auf eine großgeschriebene Variante von kt gesetzt
        String gSchluessel= s.toUpperCase();
        for(int i=0;i<tkt.length();i++){
            //Wandelt den Buchstaben an der Stelle i in eine Zahl um und speichert diese in h
            int h = this.getAscif(tkt.charAt(i));
            //sTemporer wird auf den asciff wert vom Buchstaben an Stelle gestzt
            //-65 damirt A=0 und %26 damit der wert in einer spaeteren Rechnung funktioniert (damit nicht groeßer als 26)
            int stemporer=( gSchluessel.charAt(i%gSchluessel.length())-65)%26;
            //Addirt h und den schlüssel und sorgt dafuer, das das ergebnis ein Großbuchstbe ist
            //-13, da wir teoretisch auch durch -65 rechnen um den asciff von A gleich 0 zu setzten. Da wir im nachste Schritt modula zu 26 rechnen reicht -13 aus(65%26=13)
            //%26, um zu verhindern, dass unsere Zahl aus dem Alphabet hinausgeht.
            //+65 damit unsere Zahl wieder den Großbuchstaben i Asciff entspricht
            gt= gt + this.getChar(((h+stemporer-13)%26)+65) ;
        }
    }
    public void entschluesseln(){
        //Klartext wird gelehrt
        kt="";
        //tkt wirde auf eine großgeschriebene Variante von kt gesetzt
        String tgt= gt.toUpperCase();
        //gSchluessel wirde auf eine großgeschriebene Variante von kt gesetzt
        String gSchluessel= s.toUpperCase();
        for(int i=0;i<tgt.length();i++) {
            //Wandelt den Buchstaben an der Stelle i in eine Zahl um und speichert diese in h
            int h = this.getAscif(tgt.charAt(i));
            //sTemporer wird auf den asciff wert vom Buchstaben an Stelle gestzt
            //-65 damirt A=0 und %26 damit der wert in einer spaeteren Rechnung funktioniert (damit nicht groeßer als 26)
            int stemporer=(gSchluessel.charAt(i%gSchluessel.length())-65)%26;
            //Addirt h und stemporer und sorgt dafuer, das das ergebnis ein Großbuchstbe ist
            //-13, da wir teoretisch auch durch -65 rechnen um den asciff von A gleich 0 zu setzten. Um zu verhindern, das unsere Zahl negativ wirde rechnen wir nur -13 (kleinste zahl 65 - größte zahl 26 -13>0
            //%26, um zu verhindern, dass unsere Zahl aus dem Alphabet hinausgeht.
            //+65 damit unsere Zahl wieder den Großbuchstaben i Asciff entspricht
            kt +=  this.getChar(((h-stemporer-13)%26)+65);
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
    public String getS(){return s;}
    public void setS(String pschluessel) {s=pschluessel;}
    }