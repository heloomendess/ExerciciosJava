import java.util.Scanner;

public class mediaAritmetica8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double n1 = input.nextDouble();

        System.out.print("Digite o segundo número: ");
        double n2 = input.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double n3 = input.nextDouble();

        System.out.print("Digite o quarto número: ");
        double n4 = input.nextDouble();

        double mediaAritmetica = (n1 + n2 + n3 + n4) / 4;

        System.out.println("A média dos quatro valores é: " + mediaAritmetica);

        input.close();
    }
}
