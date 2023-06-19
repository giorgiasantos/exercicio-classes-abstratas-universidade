import java.util.Scanner;

public class Administrativo extends Funcionarios{
    String funcaoAdministrativa;
    String senioridade;

    public Administrativo(String nome, int cpf, int numRegistro, String orgaoLotacao, double salario) {
        super(nome, cpf, numRegistro, orgaoLotacao, salario);
    }

    @Override
    public double aumentoSalario() {
        double aumentoSalario = getSalario() * 0.1;
        setSalario(getSalario() + aumentoSalario);
        System.out.println("O novo valor do salário é de R$ " +getSalario());
        return getSalario();
    }

    public void reembolsoDespesas() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("DIGITE O VALOR A SER REEMBOLSADO: ");
        double valorDespesas = entrada.nextDouble();
        System.out.println("VOCÊ RECEBERÁ R$ " + valorDespesas + " EM REEMBOLSO.");
        System.out.println("NO TOTAL, SEU PRÓXIMO PAGAMENTO SERÁ DE R$" + (getSalario() + valorDespesas));
    }

    @Override
    public void mostrarInfos() {
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " +getCpf());
        System.out.println("Número de registro:" + getNumRegistro());
        System.out.println("Órgão de Lotação: " + getOrgaoLotacao());
        System.out.println("Salário: " + getSalario());
        System.out.println("Função administrativa: " + funcaoAdministrativa);
        System.out.println("Senioridade: " + senioridade);
    }


}
