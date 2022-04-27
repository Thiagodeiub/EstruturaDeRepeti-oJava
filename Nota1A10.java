import java.util.Scanner;

public class Nota1A10 {
    public static void main(String[] args) {

        int nota;
        Scanner scan = new Scanner(System.in);
        System.out.println("digite um nota de 1 a 10");
        nota = scan.nextInt();

        if (nota <= 11) {
            System.out.println("nota válida");

        } else {


            do {
                System.out.println("nota inválida, deve ser um numero entre 1 a 10. tente novamente!");


                nota = scan.nextInt();

            } while (nota >= 11);
            System.out.println("nota válida");


        }


    }
}


