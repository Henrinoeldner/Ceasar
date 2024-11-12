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
            System.out.println("[1] Ceaser verschlüsselung");
            System.out.println("[2] verschlüsselte wort ausgeben");
            System.out.println("[3] Entschlüsseltes wort ausgeben");

            int option = scanner.nextInt();
            if (option==1){
                System.out.println("Bitte gib den zu verschlüsselden text an");
                String optionString = scanner.next();
                ceasar.setKt(optionString);
                System.out.println("Bitte gib den zu Schlüssel an");
                option=scanner.nextInt();
                ceasar.setS(option);
            }
            if (option==2){
                ceasar.verschluesseln();
                System.out.println("Der verschlüsselte satzt ist " +ceasar.getGt());

            }
        }
    }
}
