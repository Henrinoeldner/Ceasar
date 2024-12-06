//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Play_Fair extends Kryptomat{
    private int[][] alphabetQuadrat;
    public Play_Fair(){
        gt="";
        kt="";
        s="0";
    }
    public void verschluesseln(){
        bfmS();
        kt=kt.toUpperCase();

        //Sortg dafuer, dass doppelte Buchstaben im wort dur X getrennt werden
        for(int i=0;i<kt.length()-1;i+=2){
            if (kt.charAt(i)==kt.charAt(i+1)){
                if(kt.charAt(i)=='X') {
                    kt = kt.substring(0, i + 1) + "YY" + kt.substring(i + 1);
                }else{
                    kt = kt.substring(0, i + 1) + "XX" + kt.substring(i + 1);
                }
            }

        }
        if (kt.length()%2==1){
            if (kt.charAt(kt.length()-1)=='X'){
                kt+='Y';
            }else{
                kt+='X';
            }
        }
        int[] firstBuchstabe;
        int[] secondBuchstabe;
        for (int i=0;i<kt.length();i+=2){
            firstBuchstabe=findplaceinArray(kt.charAt(i));
            secondBuchstabe=findplaceinArray(kt.charAt(i+1));
            //wenn in selber Zeile
            if(firstBuchstabe[0]==secondBuchstabe[0]){
            gt+=getChar(alphabetQuadrat[firstBuchstabe[0]][(firstBuchstabe[1]+1)%5]) ;
            gt+=getChar(alphabetQuadrat[secondBuchstabe[0]][(secondBuchstabe[1]+1)%5]);
            }//wenn in selber Spalte
            else if (firstBuchstabe[1]==secondBuchstabe[1]){
                gt+=getChar( alphabetQuadrat[(firstBuchstabe[0]+1)%5][firstBuchstabe[1]]);
                gt+=getChar(alphabetQuadrat[(secondBuchstabe[0]+1)%5][secondBuchstabe[1]]) ;


            }else{
                gt+=getChar(alphabetQuadrat[firstBuchstabe[0]][secondBuchstabe[1]]) ;
                gt+=getChar(alphabetQuadrat[secondBuchstabe[0]][firstBuchstabe[1]]) ;

            }
        }
    }

    public int[] findplaceinArray(int pBuchstabe) {
        int[] placeinArray = new int[2];
            for (int y = 0; y < 5; y++) {
                for (int x = 0; x < 5; x++) {
                    if (alphabetQuadrat[y][x] == pBuchstabe) {
                        placeinArray[0] = y;
                        placeinArray[1] = x;
                    }
                }
            }
        return placeinArray;
    }


    public void entschluesseln(){
        bfmS();
        //geht gt mit zweier Schritten durch
        int[] firstBuchstabe;
        int[] secondBuchstabe;
        for(int i=0;i<gt.length();i+=2){
            firstBuchstabe=findplaceinArray(gt.charAt(i));
            secondBuchstabe=findplaceinArray(gt.charAt(i+1));
            //wenn in selber Zeile
            if(firstBuchstabe[0]==secondBuchstabe[0]){
                kt+=getChar(alphabetQuadrat[firstBuchstabe[0]][(firstBuchstabe[1]-1)%5]) ;
                kt+=getChar(alphabetQuadrat[secondBuchstabe[0]][(secondBuchstabe[1]-1)%5]);
            }//wenn in selber Spalte
            else if (firstBuchstabe[1]==secondBuchstabe[1]){
                kt+=getChar( alphabetQuadrat[(firstBuchstabe[0]-1)%5][firstBuchstabe[1]]);
                kt+=getChar(alphabetQuadrat[(secondBuchstabe[0]-1)%5][secondBuchstabe[1]]) ;


            }else{
                kt+=getChar(alphabetQuadrat[firstBuchstabe[0]][secondBuchstabe[1]]) ;
                kt+=getChar(alphabetQuadrat[secondBuchstabe[0]][firstBuchstabe[1]]) ;

            }


        }
    }
    private void bfmS(){

        alphabetQuadrat=new int[5][5];
        int asciibuchstabe=65;
        int platzimarray=0;
        s=s.toUpperCase();
        if (s.contains(""+'J')){
            s=s.replace('J','I');
        }
        for (int i=0;i<s.length()-1;i++){
            if(!s.substring(i+1).contains(""+s.charAt(i))){
                alphabetQuadrat[platzimarray/5][platzimarray%5]=getAscii(s.charAt(i));
                platzimarray++;
            }
        }
        alphabetQuadrat[platzimarray/5][platzimarray%5]=getAscii(s.charAt(s.length()-1));
        platzimarray++;
        for(int y =platzimarray/5;y<5;y++){
            for (int x=platzimarray%5;x<5;x++){
                while (s.contains(""+getChar(asciibuchstabe))){
                   asciibuchstabe++;
                }
                if (asciibuchstabe==74){
                    asciibuchstabe++;
                }
                alphabetQuadrat[y][x]=asciibuchstabe;
                asciibuchstabe++;

            }
            platzimarray=0;
        }
    }
}