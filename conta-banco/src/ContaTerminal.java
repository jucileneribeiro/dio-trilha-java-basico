import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
    
        Scanner input = new Scanner(System.in);
        double saldo;
        int numConta, agencia;
        String nomeCliente;

        System.out.println("Por favor, insira seu nome");
        nomeCliente = input.nextLine();

        System.out.println("Por favor, digite o número da agência!");
        agencia = input.nextInt();

        System.out.println("Por favor, digite o número da sua conta!");
        numConta = input.nextInt();

        System.out.println("digite o valor de seu saldo!");
        saldo = input.nextDouble();

        System.out.println("Olá " + nomeCliente + "! Obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numConta + " e seu saldo " + saldo + " já está disponível para saque.");

        input.close();

    }
}