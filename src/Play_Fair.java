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
        int ty=0;//Speichert, in welcher Zeile sich der Buchstabe befindet
        int tx=0;//Speichert, in welcher Spalte sich der Buchstabe befindet

        //geht kt Buchstabe fuer Buchstabe durch
        for (int i=0;i<kt.length();i++){
        tx=0;
        ty=1;
            //geht die Zeilen durch
            for(int y=1;y<6;y++){
                //geht die Spalten durch
                for(int x=0;x<6;x++){
                    //schaut, ob sich in der Zelle der gesuchte Buchstabe befindet.
                    //""+Kt.charAt(i) um den Char in eine sequence umzuwandeln.
                    //if( alphabetQuadrat[y][x].contains(""+kt.charAt(i))){
                        //tx und ty werden auf die position vom Buchstaben gesetzt
                        tx=x;
                        ty=y;
                    //};
                }

            }
            //Wandelt tx und ty in eine zweistellige Zahl um
            gt+= (tx+ty*10);
        }
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
        int asciibuchstabe=64;
        s=s.toUpperCase();
        if (s.contains(""+'J')){
            s=s.replace('J','I');
        }
        for (int i=0;i<s.length()-1;i++){
            if(!s.substring(i+1).contains(""+s.charAt(i))){
                alphabetQuadrat[i/5][i%5]=getAscii(s.charAt(i));
            }else{i++;}
        }
        alphabetQuadrat[(s.length()-1)/5][(s.length()-1)%5]=getAscii(s.charAt(s.length()-1));
        for(int y =s.length()/5;y<5;y++){
            for (int x=s.length()%5;x<5;x++){
                while (s.contains(""+getChar(asciibuchstabe))){
                   asciibuchstabe++;
                }
                if (asciibuchstabe==74){
                    asciibuchstabe++;
                }
                alphabetQuadrat[y][x]=asciibuchstabe;
                asciibuchstabe++;

            }
        }
    }
}