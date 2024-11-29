//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public abstract class Kryptomat {
    protected String gt;
    protected String kt;
    protected String s;

    public Kryptomat(){
    }

    /**
     * setzt gt auf eine verschluesselte Version von kt
     */
    public abstract void verschluesseln();


    /**
     * setzt kt auf eine entschluesselte Version von gt
     */
    public abstract void entschluesseln();

    /**
     *
     * @param pWert der Ascii wert des Buchstabens
     * @return char des Parameters
     */
    protected char getChar(int pWert){
        return (char) pWert;
    }

    /**
     *
     * @param pWert ein Char
     * @return den Ascii wert des Buchstaben
     */
    protected int getAscii(char pWert){
        return (int) pWert;
    }

    /**
     * @return gt
     */
    public String getGt(){
        return gt;
    }

    /**
     * @param pGt
     * setzt gt auf Parameter
     */
    public void setGt(String pGt){
        gt=pGt;
    }

    /**
     * @return kt
     */
    public String getKt(){
        return kt;
    }

    /**
     * @param pKt
     * setzt kt auf den Parameter
     */
    public void setKt(String pKt){
        kt=pKt;
    }

    /**
     * @return s
     */
    public String getS(){return s;}

    /**
     * @param pschluessel
     * Setzt s auf den Parameter
     */
    public void setS(String pschluessel){s=pschluessel;}
}