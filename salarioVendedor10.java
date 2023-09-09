import java.util.Scanner;

public class salarioVendedor10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o nome do vendedor: ");
        String nome = input.nextLine();

        System.out.print("Digite o salário do vendedor: ");
        double salario = input.nextDouble();

        System.out.print("Digite o total de vendas do mês: ");
        double vendas = input.nextDouble();

        double comissao = 0.15 * vendas; //15% das vendas

        double total = salario + comissao; 

        System.out.println("Nome do vendedor: " + nome);
        System.out.println("Total a receber: R$" + total);

        input.close();


    }
}
