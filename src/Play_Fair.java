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
        for(int i=0;i<kt.length()-1;i+=2){
            if (kt.charAt(i)==kt.charAt(i+1)){
                if(kt.charAt(i)=='X') {
                    kt = kt.substring(0, i + 1) + 'Y' + kt.substring(i + 1);
                }else{
                    kt = kt.substring(0, i + 1) + 'X' + kt.substring(i + 1);
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
            firstBuchstabe=findplaceinArray(i);

        }
    }

    public int[] findplaceinArray(int pBuchstabe) {
        int[] placeinArray = new int[2];
        for (int i = 0; i < kt.length(); i++) {
            for (int y = 0; y < 5; y++) {
                for (int x = 0; x < 5; x++) {
                    if (alphabetQuadrat[y][x] == kt.charAt(i)) {
                        placeinArray[0] = x;
                        placeinArray[i] = y;
                    }
                }
            }
        }
        return placeinArray;
    }


    public void entschluesseln(){
        bfmS();
        //geht gt mit zweier Schritten durch
        for(int i=0;i<gt.length();i+=2){
            String supgt;
            //Erschaft ein Supstring aus zwei Buchstaben;
            if(i+2<gt.length()) {
                supgt = gt.substring(i, i + 2);
            }else
            {supgt = gt.substring(i);}
           //Wandelt den subString aupgt in eine Zahl um;
            int speicher =Integer.valueOf(supgt);

            //fuegt den, zu der Zahl in speicher passenden Buchstaben nach der Polybius Tabelle kt hinzu;
            //kt+=alphabetQuadrat[(int)(speicher/10)][speicher%10].charAt(0);



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