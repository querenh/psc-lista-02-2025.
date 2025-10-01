import java.util.Scanner;

public class SomaSubMulDiv_ListaII {
    public static void main(String[] args) {

        int a;
        int b; 
        int soma;
        int subtracao;
        int multiplicacao;
        double divisao;

        System.out.println("Me informe o primeiro número: ");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();

        System.out.println("Me informe o segundo número: ");
        b = scanner.nextInt();

        soma = a + b;
        subtracao = a - b;
        multiplicacao = a * b;
        divisao = (double) a / b;

        System.out.println("A soma entre os números é:" + soma );
        System.out.println("A subtração entre os números é:" + subtracao);
        System.out.println("A multiplicação entre os números é:" + multiplicacao);
        System.out.println("A divisão entre os números é:" + divisao);

        scanner.close();

    }
}