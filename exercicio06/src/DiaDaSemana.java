/*Crie um programa que receba um dia da semana e
exiba uma mensagem indicando se é um dia útil ou não.*/

import java.util.Scanner;

public class DiaDaSemana {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o dia da semana: ");
        String dia = scan.nextLine();
        verificarDia(dia);
    }

    public static void verificarDia(String dia){
        if("segunda".equalsIgnoreCase(dia) || "terça".equalsIgnoreCase(dia) ||
                "quarta".equalsIgnoreCase(dia) || "quinta".equalsIgnoreCase(dia) ||
                "sexta".equalsIgnoreCase(dia)){
            System.out.println(dia + " é um dia útil");
        }
        else if( "sábado".equalsIgnoreCase(dia) || "domingo".equalsIgnoreCase(dia)){
            System.out.println(dia + " não é um dia útil");
        }
        else {
            System.out.println("Opção inválida");
        }
    }
}
