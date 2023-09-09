import java.util.Scanner;

public class SalarioFuncionario9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número de cadastro do funcionário: ");
        int cadastro = input.nextInt();

        System.out.print("Digite o número de horas trabalhadas: ");
        double horas = input.nextDouble();

        System.out.print("Digite o valor por hora: ");
        double valor = input.nextDouble();

        double salario = horas * valor; 

        System.out.println("Número de cadastro do funcionário: " + cadastro);
        System.out.println("Salário do funcionário: R$ " + salario);

        input.close();
    }
}
