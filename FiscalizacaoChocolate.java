import java.util.Scanner;

public class FiscalizacaoChocolate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Título do sistema
        System.out.println("--- SISTEMA DE FISCALIZAÇÃO PÁSCOA 2026 ---");

        // =========================
        // 1ª Situação: Teor de cacau
        // =========================
        System.out.print("Digite o percentual de cacau da amostra: ");
        double teorCacau = scanner.nextDouble();

        // Verifica a classificação com base no percentual de cacau
        if (teorCacau < 25) {
            System.out.println("Status: ALERTA: Produto 'Fake'. Classificar como 'Sabor Chocolate'.");
        } else if (teorCacau >= 25 && teorCacau < 35) {
            System.out.println("Status: Chocolate Comum (Padrão Nacional Atual).");
        } else {
            System.out.println("Status: Chocolate de Alta Qualidade (Padrão Internacional/UE).");
        }

        System.out.println();

        // ==========================================
        // 2ª Situação: Categoria e quantidade açúcar
        // ==========================================
        System.out.print("Digite o tipo de chocolate (AO_LEITE/AMARGO): ");
        String tipoChocolate = scanner.next();

        System.out.print("Digite as gramas de açúcar por porção: ");
        int acucar = scanner.nextInt();

        // Verifica se é AO_LEITE e se o açúcar está acima de 15g
        if (tipoChocolate.equalsIgnoreCase("AO_LEITE") && acucar > 15) {
            System.out.println("Status: Classificação: Doce de leite com cacau (Excesso de açúcar).");
        } else {
            System.out.println("Status: Classificação: Chocolate balanceado.");
        }

        System.out.println();

        // =======================================
        // 3ª Situação: Precificação de exportação
        // =======================================
        System.out.print("Digite o preço do ovo de Páscoa: ");
        double preco = scanner.nextDouble();

        System.out.print("Digite a nota de pureza (0 a 10): ");
        double notaPureza = scanner.nextDouble();

        // Rejeita se o preço for maior que 100 OU se a pureza for menor que 5
        if (preco > 100.00 || notaPureza < 5) {
            System.out.println("Status: REJEITADO PARA EXPORTAÇÃO: Custo-benefício fora dos padrões.");
        } else {
            System.out.println("Status: APROVADO: Produto competitivo para o mercado externo.");
        }

        scanner.close();
    }
}