import java.util.Scanner;


public class verwaltung {
    private Scanner scanner;

    private Kryptomat verschluesseler;
    public static void main(String[] args) {

        new verwaltung();
        System.out.println("Herzlich willkommen zuZeichenketten verschluesselerer!");

    }
    public verwaltung(){
        scanner = new Scanner(System.in);
        while (true) {
            System.out.println("== HAUPTMENÜ ==");
            System.out.println("Bitte weahle mit welcher methode du versclüsseln moechtst");
            System.out.println("[1]Ceasar");
            System.out.println("[2]Vigenere");
            System.out.println("[3]Beenden");
            int verschluesselungprinzip = scanner.nextInt();
            if(verschluesselungprinzip==1) {
                verschluesseler = new Ceasar();
            }else if(verschluesselungprinzip==2){
                verschluesseler= new Vigenere();
            }else if (verschluesselungprinzip>2){
                break;
            }
                System.out.println("Was moechtst du machen? Gib die Enstprechende Zahl an und drueck Enter. ");
                System.out.println("[1] Ein Wort neues Wort verschlüsseln (Benötigt ein KlarText und ein Schluessel)");
                System.out.println("[2] Ein wort neues Wort entschlüsseln(benoetigt ein GeheimText und ein Schlussel)");

                int option = scanner.nextInt();
                if (option == 1) {
                    System.out.println("Bitte gib den zu verschlüsselden text an. Druecke dann Enter");
                    String optionString = scanner.next();
                    verschluesseler.setKt(optionString);
                    System.out.print("Bitte gib den schlüssel an");
                    if (verschluesselungprinzip==1){System.out.print("(Eine Zahl oder ein Buchstaben)");}
                    else if (verschluesselungprinzip==2) {System.out.print("(Ein Wort)");}
                    System.out.println("Druecke dann Enter.");
                    optionString = scanner.next();
                    verschluesseler.setS(optionString);
                    verschluesseler.verschluesseln();
                    System.out.println("Dein verschluesselte wort ist: " + verschluesseler.getGt());
                }
                if (option == 2) {
                    System.out.println("Bitte gib den verschlüsselten text an. ");
                    String optionString = scanner.next();
                    verschluesseler.setGt(optionString);
                    System.out.print("Bitte den Schlüssel an. Druecke dann Enter.");
                    if (verschluesselungprinzip==1){System.out.print("(Eine Zahl oder ein Buchstaben)");}
                    else if (verschluesselungprinzip==2) {System.out.print("(Ein Wort)");}
                    System.out.println("Druecke dann Enter.");
                    optionString = scanner.next();
                    verschluesseler.setS(optionString);
                    verschluesseler.entschluesseln();
                    System.out.println("Der Klartext ist " + verschluesseler.getKt());
                }
        }
    }
}
