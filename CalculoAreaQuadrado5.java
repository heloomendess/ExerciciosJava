import java.util.Scanner;

public class CalculoAreaQuadrado5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor L do quadrado: ");
        double lado = input.nextDouble();

        double area = lado * lado;

        System.out.println("A área do quadrado com valor " + lado + " tem uma área de " + area);

        input.close();
 }    
}
