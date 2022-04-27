import java.util.Scanner;

public class Loggin {
    public static void main(String[] args) {
        String nome, senha;
        Scanner scan = new Scanner(System.in);
        System.out.println("digite o nome do usuário");
        nome = scan.next();
        System.out.println("digite a senha");
        senha = scan.next();
        if (!nome.equalsIgnoreCase(senha)) {
            System.out.println("acesso liberado");

        }else {
            do {
                System.out.println("a senha deve ser diferente do nome, tente novamente \ndigite o nome");
                nome = scan.next();
                System.out.println("digite a senha");
                senha = scan.next();
            }while(senha.equalsIgnoreCase(nome));
        }
        System.out.println("acesso liberado");

    }
}
