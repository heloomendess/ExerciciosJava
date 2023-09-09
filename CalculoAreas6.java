import java.util.Scanner;

public class CalculoAreas6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        double A = input.nextDouble();

        System.out.print("Digite o valor de B: ");
        double B  = input.nextDouble();

        System.out.print("Digite o valor de C: ");
        double C = input.nextDouble();

        // Calculo das áreas e perimetros
        double areaTriangulo = (A * C) / 2;
        double areaCirculo = 3.14159 * C * C;
        double areaTrapezio = ((A + B) * C) / 2;
        double areaQuadrado = B * B;
        double areaRetangulo = A * B;
        double perimetroRetangulo = 2 * (A + B);

        System.out.println("a) A área do triangulo: " + areaTriangulo);
        System.out.println("b) A área do circulo: " + areaCirculo);
        System.out.println("c) A área do trapezio: " + areaTrapezio);
        System.out.println("d) A área do quadrado: " + areaQuadrado);
        System.out.println("e) A área do retangulo: " + areaRetangulo);
        System.out.println("f) O perimetro do retangulo: " + perimetroRetangulo);

        input.close();
    }    
}
