import java.util.Scanner;

public class LitrosGasolina {
    public static void main(String[] args) {
        double precoLitrosGasolina;
        double litrosVendidos;
        double pagamentoTotal;

        System.out.println("Me informe por favor, o preço do litro da gasolina? ");
        Scanner sc1 = new Scanner(System.in);
        precoLitrosGasolina = sc1.nextDouble();

        System.out.println("Me informe por favor, quangtos litros você gostaria de abastecer? ");
        Scanner sc2 = new Scanner(System.in);
        litrosVendidos = sc2.nextDouble();

        pagamentoTotal = precoLitrosGasolina * litrosVendidos;

        System.out.println("O valor total a ser pago pela gasolina abastecida é: " + pagamentoTotal);
        sc1.close();
        sc2.close();
        



    }
    
}
