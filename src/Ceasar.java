//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Ceasar {
    private String gt;
    private String kt;
    private int s;

    public Ceasar(){
        gt="";
        kt="";
        s=0;
    }
    public void verschluesseln(){
        gt="";
        for(int i=0;i<kt.length();i++){
            int h = this.getAscif(kt.charAt(i));
            gt= gt + this.getChar(h+(s%25));
        }
    }
    public void entschluesseln(){
        kt="";
        for(int i=0;i<gt.length();i++) {
            int h = this.getAscif(gt.charAt(i));
            kt +=  this.getChar(h-(s%25));
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