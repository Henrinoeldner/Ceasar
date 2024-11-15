import java.util.Scanner;


public class verwaltung {
    private Scanner scanner;
    private Ceasar ceasar;
    public static void main(String[] args) {

        new verwaltung();
        System.out.println("Herzlich willkommen zuZeichenketten Tester!");

    }
    public verwaltung(){
        scanner = new Scanner(System.in);
        ceasar= new Ceasar();
        while (true) {
            System.out.println("== HAUPTMENÜ ==");
            System.out.println("[1] Ein Wort verschlüsseln (Benötigt ein KlarText und ein Schluessel)");
            System.out.println("[2] Ein wort entschlüsseln(benoetigt ein GeheimText und ein Schlussel)");

            int option = scanner.nextInt();
            if (option==1){
                System.out.println("Bitte gib den zu verschlüsselden text an");
                String optionString = scanner.next();
                ceasar.setKt(optionString);
                System.out.println("Bitte gib den zu Schlüssel an");
                option=scanner.nextInt();
                ceasar.setS(option);
                ceasar.verschluesseln();
                System.out.println("Dein verschluesselte wort ist: "+ceasar.getGt());
            }
            if (option==2){
                System.out.println("Bitte gib den verschlüsselten text an");
                String optionString = scanner.next();
                ceasar.setGt(optionString);
                System.out.println("Bitte gib den zu Schlüssel an");
                option=scanner.nextInt();
                ceasar.setS(option);
                ceasar.entschluesseln();
                System.out.println("Der Klartext ist " +ceasar.getKt());

            }
            if (option==3){

            }
        }
    }
}
