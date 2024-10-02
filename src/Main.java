//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual nome do produto/serviço: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o custo do "+nome+": R$ ");
        double cost = scanner.nextDouble();

        switch (!(cost != 0 ) ? 1 : 0) {
            case 1: // Custo diferente de 0
                System.out.println("Custo não pode ser zero. Encerrando o programa.");
                scanner.close();
                return; // Finaliza o programa
            case 0: // Custo igual a 0
                break; // Continua o programa
        }

        System.out.print("Digite o valor do frete: R$ ");
        double frete = scanner.nextDouble();

        System.out.print("Digite o valor do seguro: R$ ");
        double seguro = scanner.nextDouble();

        System.out.print("Digite a alíquota do ICMS (em %): ");
        double aliquotaIcms = scanner.nextDouble();

        System.out.print("Digite a alíquota do ISS (em %): ");
        double aliquotaIss = scanner.nextDouble();

        // Criando um objeto Produto
        Imposto imposto = new Imposto(cost, frete, seguro, aliquotaIcms, aliquotaIss);

        // Cálculo e exibição do preço final
        double precoFinal = imposto.calcularPrecoFinal();
        System.out.printf("O preço final do produto/serviço é: R$ %.2f%n", precoFinal);

        // Fechar o scanner
        scanner.close();


    }

}