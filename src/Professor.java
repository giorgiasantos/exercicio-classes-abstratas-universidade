import java.util.ArrayList;
import java.util.Scanner;

public class Professor extends Funcionarios{
    Scanner entrada = new Scanner(System.in);
    String nivelGrad;
    String discMinistrada;

    int qtdeAlunos;
    int qtdeTurmas;
    int qtdeEstagiarios;
    Turma turma;

    public int getQtdeEstagiarios() {
        if(qtdeEstagiarios <= 2) {

        }else {
            System.out.println("Quantidade inválida. Você pode ter até 2 estagiários. Altere o valor.");
        }
        return qtdeEstagiarios;
    }

    public Professor(String nome, int cpf, int numRegistro, String orgaoLotacao, double salario) {
        super(nome, cpf, numRegistro, orgaoLotacao, salario);

    }
    public Professor(String nome, int cpf, int numRegistro, String orgaoLotacao) {
        super(nome, cpf, numRegistro, orgaoLotacao);
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
        System.out.println("Nível de graduação: " +nivelGrad);
        System.out.println("Disciplinas Ministradas: " + discMinistrada);
        System.out.println("Quantidade de alunos: " + qtdeAlunos);
        System.out.println("Quantidade de turmas: " + qtdeTurmas);
        System.out.println("Quantidade de estagiários: " + getQtdeEstagiarios());
    }

    public void adicionaTurma() {
        Scanner entrada = new Scanner(System.in);
        int novasTurmas = 0;
        System.out.println("QUANTAS TURMAS DESEJA ADICIONAR AO TOTAL? ");
        novasTurmas = entrada.nextInt();
        this.qtdeTurmas += novasTurmas;
        System.out.println("O novo total de turmas é "+qtdeTurmas);

    }
}
