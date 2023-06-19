import java.util.Scanner;

public class Estagiario extends Professor{
    double valorBolsa;
    String vinculoProfessor;

    public Estagiario(String nome, int cpf, int numRegistro, String orgaoLotacao) {
        super(nome, cpf, numRegistro, orgaoLotacao);
    }

    @Override
    public void reembolsoDespesas() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("DIGITE O VALOR A SER REEMBOLSADO: ");
        double valorDespesas = entrada.nextDouble();
        System.out.println("VOCÊ RECEBERÁ R$ " + valorDespesas + " EM REEMBOLSO.");
        System.out.println("NO TOTAL, SEU PRÓXIMO PAGAMENTO SERÁ DE R$" + (valorBolsa + valorDespesas));
    }

    @Override
    public double aumentoSalario() {
        double aumentoBolsa = valorBolsa * 0.1;
        valorBolsa  = valorBolsa + aumentoBolsa;
        System.out.println("O novo valor da bolsa é de R$ " +valorBolsa);
        return valorBolsa;
    }
    @Override
    public void mostrarInfos() {
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " +getCpf());
        System.out.println("Número de registro:" + getNumRegistro());
        System.out.println("Órgão de Lotação: " + getOrgaoLotacao());
        System.out.println("Bolsa: " + valorBolsa);
        System.out.println("Professor vinculado:" + vinculoProfessor);

    }

}
