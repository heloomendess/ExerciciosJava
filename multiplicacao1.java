import java.util.Scanner;

public class multiplicacao1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n1 = entrada.nextInt();

        System.out.print("Digite outro número: ");
        int n2 = entrada.nextInt();

        int multiplicacao = n1 * n2;
        System.out.println("Total da multiplicação: " + multiplicacao);

        entrada.close();
    }
}
