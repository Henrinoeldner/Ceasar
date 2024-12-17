public class Dual extends Kryptomat {
    private int[][]Quadrat;
    public Dual(){
        gt="";
        kt="";
        s="0";
    }

    public void verschluesseln() {
    Quadrat=new int[kt.length()][7];
    int speicher;
    for (int i=0;i<kt.length();i++){
        speicher=0;
       for (int b=0;b<7;b++){
            if (speicher+Math.pow(2,6-b)<=getAscii(kt.charAt(i))){
                Quadrat[i][b]=1;
                speicher+=Math.pow(2,6-b);
                gt+=1;
            }else{
                Quadrat[i][b]=0;
                gt+=0;
            }
       }
    }


    }

    public void entschluesseln() {

    }

}
