//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public abstract class Kryptomat {
    protected String gt;
    protected String kt;

    public Kryptomat(){
    }
    //verschluesseln() verschlüsselt den Klartext(kt) durch addition mit dem schlüssel(s)
    public abstract void verschluesseln();

    public abstract void entschluesseln();

    protected char getChar(int pWert){
        return (char) pWert;
    }
    protected int getAscif(char pWert){
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
}