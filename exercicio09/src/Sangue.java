/*crie programa que receba a idade e o peso do doador e
informe se ele é compatível para doar sangue. Se não for, o programa
deve indicar qual critério não foi atendido.*/

import java.util.Scanner;

public class Sangue {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a idade do doador: ");
        int idade = scan.nextInt();
        System.out.println("Digite o peso do doador (em kg): ");
        double peso = scan.nextDouble();
        verificarDoador(idade, peso);
    }

    public static void verificarDoador(int idade, double peso){
        if(idade < 18 || idade > 65){
            System.out.println("O doador não é compatível.  \n" +
                    "Motivo: Deve ter entre 18 e 65 anos. ");
        }
        else if (peso < 50){
            System.out.println("O doador não é compatível.  \n" +
                    "Motivo: Deve ter mais de 50 kg. ");
        }
        else {
            System.out.println("O doador é compatível.");
        }
    }
}
