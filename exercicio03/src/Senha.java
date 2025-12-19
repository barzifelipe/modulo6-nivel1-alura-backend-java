/*verifique se o que o usuário digitou está correto ou não.
O programa deve permitir apenas senhas com 8 dígitos.*/

import java.util.Scanner;

public class Senha {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua senha: ");
        String senha = scan.nextLine();

        if(senha.matches("\\d{8}")){
            System.out.println("Senha registrada!");
        }
        else{
            System.out.println("Senha inválida. Inserir 8 dígitos.");
        }
    }
}
