import java.util.Scanner;

public class potencia2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a base da potencia: ");
        double base = input.nextDouble();

        System.out.print("Digite o expoente da potencia: ");
        double expoente = input.nextDouble();

        double resultado = Math.pow(base, expoente);

        System.out.println("A potencia de " + base + " elevado a " + expoente + " é igual a " + resultado);

        input.close();
    }
}
