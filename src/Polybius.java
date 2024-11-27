//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Polybius extends Kryptomat{
    private String[][] alphabetQuadrat={{" "," "," "," "," "," "},{" ","a","b","c","d","e"},{" ","f","g","h","ij","k"},{" ","l","m","n","o","p"},{" ","q","r","s","t","u"},{" ","v","w","x","y","z"}};
    public Polybius(){
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

    }
    private void bfmS(){}
}