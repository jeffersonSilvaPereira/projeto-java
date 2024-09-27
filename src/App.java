import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite seu nome:");
        String nome = sc.nextLine();

        sc.close();

        System.out.printf("Olá, %s!", nome);
    }
}
