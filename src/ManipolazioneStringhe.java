import java.util.Scanner;

public class ManipolazioneStringhe {

    public static String maiuscolo (String stringa1){
    String s1;
    String mai;
    s1 = stringa1;
    mai = s1.toUpperCase();
    return mai;
    }

    public static String minuscolo (String stringa1){
    String s1;
    String min;
    s1 = stringa1;
    min = s1.toLowerCase();
    return min;
    }

    public static char primocarattere (String stringa1){
    String s1;
    char primocar;
    int a;
    s1 = stringa1;
    primocar =  s1.charAt(0);
    return primocar;
    }   



    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci una stringa:");
        String stringa = scanner.nextLine();
        String maiuscolo = maiuscolo(stringa);
        String minuscolo = minuscolo(stringa);
        char primocarattere = primocarattere(stringa);
        System.out.println("Stringa maiuscola\n" +maiuscolo);
        System.out.println("Stringa minuscola\n" +minuscolo);
        System.out.println("Primo carattere\n" +primocarattere);
        scanner.close();
    }
}
