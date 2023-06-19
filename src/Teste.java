import javax.security.sasl.SaslClient;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        // CONSTRUÇÃO DE OBJETOS
        Professor professor = new Professor("João Silveira", 1119098, 567, "UFPE", 7000.0);
        professor.nivelGrad = "PHD";
        professor.discMinistrada = "História da Arte I";
        professor.qtdeTurmas = 2;
        professor.qtdeAlunos = 65;
        professor.qtdeEstagiarios = 3;

        // ADICIONANDO NOVAS TURMAS
        //professor.adicionaTurma();
        professor.mostrarInfos();

        Coordenador coordenador = new Coordenador("Maria", 987651, 432, "UFPE", 10500.0);
        coordenador.professoresSupervisionados.add("João Silveira");
        // ADICIONANDO NOVOS PROFESSORES NA LISTA DE SUPERVISÃO DO COORDENADOR
        //coordenador.adicionaProfessor();

        Administrativo adm = new Administrativo("Cleiton Pereira", 98765, 876, "UFPE", 4500.0);
        adm.senioridade = "Pleno";
        adm.funcaoAdministrativa = "Financeiro";
        // ADICIONANDO PEDIDO DE REEMBOLSO
        //adm.reembolsoDespesas();

        Estagiario estagiario = new Estagiario("Roberta Cunha", 98756, 765, "UFPE");
        estagiario.vinculoProfessor = "João Silveira";
        estagiario.valorBolsa = 700.0;
        estagiario.mostrarInfos();
        // ADICIONANDO PEDIDO DE REEMBOLSO
        //estagiario.reembolsoDespesas();

    }
}
