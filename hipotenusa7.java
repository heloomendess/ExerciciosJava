import java.util.Scanner;

public class hipotenusa7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        double A = input.nextDouble();

        System.out.print("Digite o valor de B: ");
        double B = input.nextDouble();

        double hipotenusa = Math.sqrt(Math.pow(A, 2) + Math.pow(B, 2));

        System.out.println("A hipotenusa do triangulo retangulo é: " + hipotenusa);

        input.close();
    }
}
