import java.util.Scanner;

public class NumerosConsecutivos4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n1 = input.nextInt();

        System.out.print("Digite outro número: ");
        int n2 = input.nextInt();

        int consecutivo1 = n1 + 1;
        int consecutivo2 = n2 + 1;

        System.out.println("O número consecutivo de " + n1 + " é " + consecutivo1);
        System.out.println("O número consecutivo de " + n2 + " é " + consecutivo2);

        input.close();
    }
}

// refazerrrrr  tá erradooooooooo