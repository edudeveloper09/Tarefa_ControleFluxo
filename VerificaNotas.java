import java.util.Scanner;

public class VerificaNotas {


    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.println("Olá vamos verificar a nota do aluno Edu! ");

        System.out.println("Digite a primeira nota: ");
        int nota1 = s.nextInt();
        System.out.println("Digite a segunda nota: ");
        int nota2 = s.nextInt();
        System.out.println("Digite a terceira nota: ");
        int nota3 = s.nextInt();
        System.out.println("Digite a quarta nota: ");
        int nota4 = s.nextInt();

        int soma = nota1 + nota2 +nota3 + nota4;
        double resultado = (double)soma / 4;

        if (resultado <= 4) {
            System.out.println("O Edu está reprovado!");
        } else if (resultado <= 6) {
            System.out.println("O Edu está de recuperação!");
        } else {
            System.out.println("O Edu está aprovado!");
        }
    }
}
