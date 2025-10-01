import java.util.Scanner;

public class NotasMedias {
    public static void main(String[] args) {
        double nota1;
        double nota2;
        double nota3;
        double nota4;
        double media;

        System.out.println("Me informe a primeira nota: ");
        Scanner sc1 = new Scanner(System.in);
        nota1 = sc1.nextDouble();   

        System.out.println("Me informe a segunda nota: ");
        Scanner sc2 = new Scanner(System.in);
        nota2 = sc2.nextDouble();

        System.out.println("Me infrome a terceira nota: ");
        Scanner sc3 = new Scanner(System.in);
        nota3 = sc3.nextDouble();

        System.out.println("Me informe a quarta nota: ");
        Scanner sc4 = new Scanner(System.in);
        nota4 = sc4.nextDouble();

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A média das notas é: " + media);

        sc1.close();
        sc2.close();
        sc3.close();
        sc4.close();

        
    }
}
