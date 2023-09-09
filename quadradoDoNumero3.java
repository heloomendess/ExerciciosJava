import java.util.Scanner;

public class quadradoDoNumero3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double n1 = input.nextDouble();

        System.out.print("Digite o segundo número: ");
        double n2 = input.nextDouble();

        double quadrado1 = n1 * n2;
        double quadrado2 = n2 * n1; 

        double somaQuadrados = quadrado1 + quadrado2;

        System.out.println("A soma dos quadrados é: " + somaQuadrados);

        input.close();
    }
}
