/*Crie um programa que receba o código de acesso e o nível de permissão e
exiba uma mensagem indicando se o acesso foi permitido ou negado, além do motivo, se for o caso.*/

import java.util.Scanner;

public class NivelAcesso {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o código de acesso: ");
        int cod = scan.nextInt();
        System.out.println("Digite o nível de permissão: ");
        int nivel = scan.nextInt();
        validarAcesso(cod, nivel);
    }

    public static void validarAcesso(int cod, int nivel){
        if(cod != 2023){
            System.out.println("Acesso negado! Código inválido.");
        }
        else{
            if(nivel == 1 || nivel == 2 || nivel == 3){
                System.out.println("Acesso permitido. Bem-vindo ao sistema!");
            }
            else{
                System.out.println("Acesso negado! Nível inválido.");
            }
        }
    }
}
