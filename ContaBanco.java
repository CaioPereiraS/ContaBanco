import java.util.Scanner;
public class ContaBanco{

    Scanner $scaner = new Scanner(System.in);

    private int $numConta;
    private String $agencia;
    private String $nomeCliente;
    private double $saldo;

    public ContaBanco(){

        System.out.println("Olá bem Vindo ao Sistema de Conta Bancária");
        System.out.println(" Por favor digite o número da conta: ");

        this.$numConta = $scaner.nextInt();
        System.out.println(" Por favor digite o nome do cliente: ");
        this.$nomeCliente = $scaner.next();
        System.out.println(" Por favor digite o nome da agência: ");
        this.$agencia = $scaner.next();
        System.out.println(" Por favor digite o saldo inicial: ");
        this.$saldo = $scaner.nextDouble();

        System.out.println("Conta criada com sucesso!");
        System.out.println("Olá "+ this.$nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é "+this.$agencia+", conta "+this.$numConta+" e seu saldo "+this.$saldo+" já está disponível para saque.");
    }

    public static void main(String[] args) {
        ContaBanco $conta = new ContaBanco();
    }
}