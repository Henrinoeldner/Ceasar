import java.util.Scanner;


public class verwaltung {
    private Scanner scanner;
    private Ceasar ceasar;
    private Vigenere vigenere;
    public static void main(String[] args) {

        new verwaltung();
        System.out.println("Herzlich willkommen zuZeichenketten Tester!");

    }
    public verwaltung(){
        scanner = new Scanner(System.in);
        ceasar= new Ceasar();
        while (true) {
            System.out.println("== HAUPTMENÜ ==");
            System.out.println("Bitte weahle mit welcher methode du versclüsseln moechtst");
            System.out.println("[1]Ceasar");
            System.out.println("[2]Vigenere");
            System.out.println("[3]Beenden");
            int option = scanner.nextInt();
            if(option==1) {
                ceasar = new Ceasar();
                System.out.println("[1] Ein Wort verschlüsseln (Benötigt ein KlarText und ein Schluessel)");
                System.out.println("[2] Ein wort entschlüsseln(benoetigt ein GeheimText und ein Schlussel)");

                option = scanner.nextInt();
                if (option == 1) {
                    System.out.println("Bitte gib den zu verschlüsselden text an");
                    String optionString = scanner.next();
                    ceasar.setKt(optionString);
                    System.out.println("Bitte gib eine Zahl als Schlüssel an");
                    option = scanner.nextInt();
                    ceasar.setS(option);
                    ceasar.verschluesseln();
                    System.out.println("Dein verschluesselte wort ist: " + ceasar.getGt());
                }
                if (option == 2) {
                    System.out.println("Bitte gib den verschlüsselten text an");
                    String optionString = scanner.next();
                    ceasar.setGt(optionString);
                    System.out.println("Bitte gib die Zahl des Schlüssel an");
                    option = scanner.nextInt();
                    ceasar.setS(option);
                    ceasar.entschluesseln();
                    System.out.println("Der Klartext ist " + ceasar.getKt());

                }
            }else if(option==2){
                vigenere=new Vigenere();
                String schluessel;
                System.out.println("[1] Ein Wort verschlüsseln (Benötigt ein KlarText und ein Schluessel)");
                System.out.println("[2] Ein wort entschlüsseln(benoetigt ein GeheimText und ein Schlussel)");

                option = scanner.nextInt();
                if (option == 1) {
                    System.out.println("Bitte gib den zu verschlüsselden text an");
                    String optionString = scanner.next();
                    vigenere.setKt(optionString);
                    System.out.println("Bitte gib den zu Schlüssel an");
                    schluessel = scanner.next();
                    vigenere.setS(schluessel);
                    vigenere.verschluesseln();
                    System.out.println("Dein verschluesselte wort ist: " + vigenere.getGt());
                }
                if (option == 2) {
                    System.out.println("Bitte gib den verschlüsselten text an");
                    String optionString = scanner.next();
                    vigenere.setGt(optionString);
                    System.out.println("Bitte gib den zu Schlüssel an");
                    schluessel = scanner.next();
                    vigenere.setS(schluessel);
                    vigenere.entschluesseln();
                    System.out.println("Der Klartext ist " + vigenere.getKt());

                }
            }else if (option>2){
                break;
            }
        }
    }
}
