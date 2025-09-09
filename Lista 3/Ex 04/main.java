
public class main {
    public static void main(String[] args) {
        int soma = 0;

        for (int i = 1; i <= 100; i++) {
            soma += i;
            System.out.println("Número: " + i + " | Soma: " + soma);

            if (soma > 250) {
                break;
            }
        }

    }
}
