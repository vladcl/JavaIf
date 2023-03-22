
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leitorMedia = new Scanner(System.in);

        System.out.println("Digite a média do aluno: ");
        int media = leitorMedia.nextInt();

        if(media > 0 && media <= 10) {
            if (media >= 7) {
                if (media == 10) {
                    System.out.println("Parabéns, o aluno foi aprovado com nota máxima!");
                } else {
                    System.out.println("Parabéns, o aluno foi aprovado com média " + media + "!");
                }
            } else {
                System.out.println("Este aluno está reprovado.");
            }
        }else {
            System.out.println("Valor de média inválido.");
        }
    }
}