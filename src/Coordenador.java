import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Coordenador extends Funcionarios{
//    String [] professoresSupervisionados = new String[5];
    List<String> professoresSupervisionados = new ArrayList<>();

    public Coordenador(String nome, int cpf, int numRegistro, String orgaoLotacao, double salario) {
        super(nome, cpf, numRegistro, orgaoLotacao, salario);
    }
    public void adicionaProfessor(){
        String novoProfessor = " ";
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < this.professoresSupervisionados.size() && i < 5; i++){
            System.out.println("DIGITE O NOME DO PROFESSOR PARA INCLUIR NA LISTA: ");
            novoProfessor = entrada.next();
            this.professoresSupervisionados.add(novoProfessor);
        }
        System.out.println("LISTA DE PROFESSORES SUPERVISIONADOS: " + this.professoresSupervisionados);

    }

    public void reembolsoDespesas() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("DIGITE O VALOR A SER REEMBOLSADO: ");
        double valorDespesas = entrada.nextDouble();
        System.out.println("VOCÊ RECEBERÁ R$ " + valorDespesas + " EM REEMBOLSO.");
        System.out.println("NO TOTAL, SEU PRÓXIMO PAGAMENTO SERÁ DE R$" + (getSalario() + valorDespesas));
    }
    @Override
    public double aumentoSalario() {
        double aumentoSalario = getSalario() * 0.05;
        setSalario(getSalario() + aumentoSalario);
        System.out.println("O novo valor do salário é de R$ " +getSalario());
        return getSalario();
    }
    @Override
    public void mostrarInfos() {
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " +getCpf());
        System.out.println("Número de registro:" + getNumRegistro());
        System.out.println("Órgão de Lotação: " + getOrgaoLotacao());
        System.out.println("Salário: " + getSalario());
        System.out.println("Professores Supervisionados: " + professoresSupervisionados);
    }
}
