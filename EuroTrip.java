import java.util.Scanner;

public class EuroTrip {
    public static void main(String[] args) {
        int quantidaDePessoas;
        double valorPassagemArea;
        double valorTotalDasViagens;

        //Quantidade de pessoas que farão a viagem
        System.out.println("Quantas pessoas irão fazer a viagem? ");
        Scanner scQdPessoas = new Scanner(System.in);
        quantidaDePessoas = scQdPessoas.nextInt();

        // Valores das passagens
        System.out.println("Qual o valor das passagens aéreas? ");
        Scanner scValorPassagem = new Scanner(System.in);
        valorPassagemArea = scValorPassagem.nextDouble();

        //Valor total da viagem em reais
        valorTotalDasViagens = quantidaDePessoas * valorPassagemArea;
        System.out.println("O valor total gasto na viagem com passagens aéreas é de: " + valorTotalDasViagens);
        scQdPessoas.close();
        scValorPassagem.close();

        



    }
}
