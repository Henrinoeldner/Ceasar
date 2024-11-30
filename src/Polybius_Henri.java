//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Polybius_Henri extends Kryptomat{
    private String[][] alphabetQuadrat={{" "," "," "," "," "," "},{" ","Aa","Bb","Cc","Dd","Ee"},{" ","Ff","Gg","Hh","IJij","Kk"},{" ","Ll","Mm","Nn","Oo","Pp"},{" ","Qq","Rr","Ss","Tt","Uu"},{" ","Vv","Ww","Xx","Yy","Zz"}};
    public Polybius_Henri(){
        gt="";
        kt="";
        s="0";
    }
    public void verschluesseln(){
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
                    if( alphabetQuadrat[y][x].contains(""+kt.charAt(i))){
                        //tx und ty werden auf die position vom Buchstaben gesetzt
                        tx=x;
                        ty=y;
                    };
                }

            }
            //Wandelt tx und ty in eine zweistellige Zahl um
            gt+= (tx+ty*10);
        }
    }


    public void entschluesseln(){

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
            kt+=alphabetQuadrat[(int)(speicher/10)][speicher%10].charAt(0);



        }
    }
    private void bfmS(){}
}