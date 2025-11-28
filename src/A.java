import java.util.Scanner;

public class A {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("\n--- RESULTADO ---");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);

        scanner.close();
    }
}
