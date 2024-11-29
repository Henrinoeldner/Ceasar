//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Polybius extends Kryptomat{
    private int[][] alphabetQuadrat;
    public Polybius(){
        gt="";
        kt="";
        s="0";
    }
    public void verschluesseln() {
        bfmS();
        kt=kt.toUpperCase();
        int ty=0;
        int tx=0;
        for (int i=0;i<kt.length();i++){
            for(int y=0;y<5;y++){
                for(int x=0;x<5;x++){
                    if( alphabetQuadrat[y][x]==kt.charAt(i)){
                        tx=x;
                        ty=y;
                    };
                }

            }
            gt+= tx+ty*10+11;
        }

    }
    public void entschluesseln(){
        bfmS();
        for(int i=0;i<gt.length();i+=2){
            String supgt = gt.substring(i,i+2);
            int speicher =Integer.valueOf(supgt)-11;
            kt+=getChar( alphabetQuadrat[(int)(speicher/10)][speicher%10]);
        }
    }
    private void bfmS(){
        alphabetQuadrat=new int[5][5];
        int asciibuchstabe=65;
      for(int y =0;y<5;y++){
          for (int x=0;x<5;x++){
              alphabetQuadrat[y][x]=asciibuchstabe;
              asciibuchstabe++;
              if (asciibuchstabe==74){
                  asciibuchstabe++;
              }
          }
      }

    }
}