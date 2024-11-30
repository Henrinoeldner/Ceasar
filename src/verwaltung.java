import java.util.Scanner;


public class verwaltung {
    private Scanner scanner;

    private Kryptomat verschluesseler;
    public static void main(String[] args) {

        new verwaltung();
        System.out.println("Herzlich willkommen zu Zeichenketten verschluesselerer!");

    }
    public verwaltung(){
        scanner = new Scanner(System.in);
        while (true) {
            System.out.println("== HAUPTMENÜ ==");
            System.out.println("Bitte weahle mit welcher methode du verschluesseln moechtest");
            System.out.println("[1]Ceasar");
            System.out.println("[2]Vigenere");
            System.out.println("[3]Vigenere(die von Herr Horn gewuenschte version");
            System.out.println("[4]Polybius(Henris version(Die Bessere :] ))");
            System.out.println("[5]Beenden");
            int verschluesselungprinzip = scanner.nextInt();
            if(verschluesselungprinzip==1) {
                verschluesseler = new Ceasar();
            }else if(verschluesselungprinzip==2){
                verschluesseler= new Vigenere();
            }else if(verschluesselungprinzip==3){
                verschluesseler= new Polybius();
            } else if (verschluesselungprinzip==4) {
                verschluesseler=new Polybius_Henri();
            } else if (verschluesselungprinzip>4){
                break;
            }
                System.out.println("Was moechtst du machen? Gib die enstsprechende Zahl an und drueck Enter. ");
                System.out.println("[1] Ein neues Wort verschluesseln (Benoetigt ein KlarText und ein Schluessel)");
                System.out.println("[2] Ein neues Wort entschluesseln(benoetigt ein GeheimText und ein Schlussel)");


                int option = scanner.nextInt();
                if (option == 1) {
                    System.out.println("Bitte gib den zu verschluesselden text an. Druecke dann Enter");
                    String optionString =scanner.next();
                    optionString+=scanner.nextLine();
                    verschluesseler.setKt(optionString);
                    System.out.print("Bitte gib den schluessel an");
                    if (verschluesselungprinzip==1){System.out.print("(Eine Zahl oder ein Buchstaben)");}
                    else if (verschluesselungprinzip==2) {System.out.print("(Ein Wort)");}
                    else{System.out.print("(In diesen Fall nicht benoetigt und wird nicht benutzt, gib also einfach deine Liebling zahl an)");}
                    System.out.println("Druecke dann Enter.");
                    optionString = scanner.next();
                    verschluesseler.setS(optionString);
                    verschluesseler.verschluesseln();
                    System.out.println("Dein verschluesseltes Wort ist: " + verschluesseler.getGt());
                }
                if (option == 2) {
                    System.out.println("Bitte gib den verschlüsselten text an. ");
                    String optionString = scanner.next();
                    verschluesseler.setGt(optionString);
                    System.out.print("Bitte gib den Schlüssel an. ");
                    if (verschluesselungprinzip==1){System.out.print("(Eine Zahl oder ein Buchstaben)");}
                    else if (verschluesselungprinzip==2) {System.out.print("(Ein Wort)");}
                    else{System.out.print("(In diesen Fall nicht benoetigt und wird nicht benutzt, gib also einfach deine Liebling zahl an)");}
                    System.out.println("Druecke dann Enter.");
                    optionString = scanner.next();
                    verschluesseler.setS(optionString);
                    verschluesseler.entschluesseln();
                    System.out.println("Der Klartext ist " + verschluesseler.getKt());
                }
        }
    }
}
