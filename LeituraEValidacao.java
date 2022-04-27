import java.util.Scanner;

public class LeituraEValidacao {
    public static void main(String[] args) {
        String nome;
        int idade;
        float salario;
        char sexo;
        char estadoCivil;


        Scanner scan = new Scanner(System.in);
        System.out.println("digite o nome maior que 3 caracteres");
        nome = scan.next();
        if (nome.length() < 4) {
            do {
                System.out.println("nome inválido, digite outro nome com mais de 3 caracteres");
                nome = scan.next();
            } while (nome.length() < 4);

            System.out.println("Nome Válido");

        } else {
            System.out.println("Nome Válido");

        }
        System.out.println("Entre com a idade de 0 a 150");
        idade = scan.nextInt();

        if (idade < 0 || idade > 150) {
            do {
                System.out.println("Idade inválida digite novamente entre 0 a 150");
                idade = scan.nextInt();

            } while (idade < 0 || idade > 150);
            System.out.println("Idade válida");


        } else {
            System.out.println("Idade válida");
        }
        System.out.println("digite o seu salário");
        salario = scan.nextFloat();

        if (salario <= 0) {
            do {
                System.out.println("O salário deve ser maior que zero, digite novamente");
                salario = scan.nextFloat();

            } while (salario <= 0);

            System.out.println("salário válido");

        } else {
            System.out.println("salário válido");
        }
        System.out.println("digite a inicial do seu sexo");
        sexo = scan.next().charAt(0);

        while (sexo != 'f' && sexo != 'F' && sexo != 'm' && sexo != 'M') {
            System.out.println("sexo invalido digite F para feminino ou M para masculino");
            sexo = scan.next().charAt(0);
        }

        if (sexo == 'f' || sexo == 'F') {
            System.out.println("sexo feminino registrado");


        }
        if (sexo == 'm' || sexo == 'M') {
            System.out.println("sexo masculino registrado");
        }

        System.out.println("Entre com o estado civil (s/d/v/c): ");
        estadoCivil = scan.next().charAt(0);
        while (estadoCivil != 's' && estadoCivil != 'd' && estadoCivil != 'v' && estadoCivil != 'c') {
            System.out.println("O estado civil está incorreto, entre com um valor valido:");
            estadoCivil = scan.next().charAt(0);
        }

        System.out.println("Os dados digitados foram: ");
        System.out.printf("Nome: %s, Idade: %d, Salario: R$ %.2f, Sexo: %c Estado civil: %c", nome, idade, salario, sexo, estadoCivil);
    }
}
