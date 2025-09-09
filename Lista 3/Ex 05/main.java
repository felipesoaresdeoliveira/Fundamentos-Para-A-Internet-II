import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String texto = scanner.nextLine();
        texto.toLowerCase();
        String vogais = "aeiou";

        System.out.println("Texto sem vogais: ");
        for (int i = 0; i < texto.length(); i++) {
            char a = texto.charAt(i);

            if (!vogais.contains(String.valueOf(a))) {
                System.out.print(a);
            }
        }

    }

}
