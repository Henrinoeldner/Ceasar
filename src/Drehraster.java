public class Drehraster extends Kryptomat{
    private char[][]Quadrat;
    public void verschluesseln(){
        int is;
        int wo=0;
        is=Integer.valueOf(""+s.charAt(0));
        Quadrat=new char[kt.length()/is][is];
        for (int y=0;y<kt.length()/is;y++){
            for (int x=0;x<is;x++){
                Quadrat[y][x]=kt.charAt(wo);
                wo++;
            }
        }
    }
    public void entschluesseln(){

    }
}
