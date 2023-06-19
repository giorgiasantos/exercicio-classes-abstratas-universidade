import java.util.Scanner;

public abstract class Funcionarios {
    private String nome;
    private int cpf;
    private int numRegistro;
    private String orgaoLotacao;
    private double salario;
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getNumRegistro() {
        return numRegistro;
    }

    public void setNumRegistro(int numRegistro) {
        this.numRegistro = numRegistro;
    }

    public String getOrgaoLotacao() {
        return orgaoLotacao;
    }

    public void setOrgaoLotacao(String orgaoLotacao) {
        this.orgaoLotacao = orgaoLotacao;
    }

    public double aumentoSalario() {
        double aumentoSalario = salario * 0.1;
        salario = salario + aumentoSalario;
        System.out.println("O novo valor do salário é de R$ " +salario);
        return salario;
    }
    public void mostrarInfos() {
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " +getCpf());
        System.out.println("Número de registro:" + getNumRegistro());
        System.out.println("Órgão de Lotação: " + getOrgaoLotacao());
        System.out.println("Salário: " + getSalario());
    }
    public Funcionarios(String nome, int cpf, int numRegistro, String orgaoLotacao, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.numRegistro = numRegistro;
        this.orgaoLotacao = orgaoLotacao;
        this.salario = salario;
    }
    public Funcionarios(String nome, int cpf, int numRegistro, String orgaoLotacao) {
        this.nome = nome;
        this.cpf = cpf;
        this.numRegistro = numRegistro;
        this.orgaoLotacao = orgaoLotacao;
    }
}
