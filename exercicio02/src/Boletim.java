/*um programa que ajude a determinar se um aluno foi aprovado na disciplina. A regra da escola é:

O estudante é aprovado se média final é maior ou igual a 7.0.
Se a média for entre 5.0 e 6.9, está de recuperação.
Se for abaixo de 5.0, está reprovado.*/

import java.util.Scanner;

public class Boletim {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a nota 1 do aluno: ");
        double nota1 = scan.nextDouble();
        System.out.println("Digite a nota 2 do aluno: ");
        double nota2 = scan.nextDouble();
        System.out.println("Digite a nota 3 do aluno: ");
        double nota3 = scan.nextDouble();

        double media = (nota1+nota2+nota3)/3;
        verificarMedia(media);

    }

    public static void verificarMedia(double media){
        if(media >= 7){
            System.out.println("O aluno teve média "+media+" e foi APROVADO");
        }
        else if(media < 7 && media >= 5){
            System.out.println("O aluno teve média "+media+" e está de RECUPERAÇÃO");
        }
        else {
            System.out.println("O aluno teve média "+media+" e foi REPROVADO");
        }
    }
}
