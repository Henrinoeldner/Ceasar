//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Polybius_Henri extends Kryptomat{
    private String[][] alphabetQuadrat={{" "," "," "," "," "," "},{" ","Aa","Bb","Cc","Dd","Ee"},{" ","Ff","Gg","Hh","IHij","Kk"},{" ","Ll","Mm","Nn","Oo","Pp"},{" ","Qq","Rr","Ss","Tt","Uu"},{" ","Vv","Ww","Xx","Yy","Zz"}};
    public Polybius_Henri(){
        gt="";
        kt="";
        s="0";
    }
    public void verschluesseln(){
        int ty=0;
        int tx=0;
        for (int i=0;i<kt.length();i++){
            for(int y=1;y<6;y++){
                for(int x=1;x<6;x++){
                    if( alphabetQuadrat[y][x].contains(""+kt.charAt(i))){
                        tx=x;
                        ty=y;
                    };
                }

            }
            gt+= (tx+ty*10);
        }
    }
    public void entschluesseln(){
        for(int i=0;i<gt.length();i+=2){
           String supgt = gt.substring(i,i+2);
            int speicher =Integer.valueOf(supgt);
            kt+=alphabetQuadrat[(int)(speicher/10)][speicher%10].charAt(0);



        }
    }
    private void bfmS(){}
}