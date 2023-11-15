package entity;

import entity.Acao;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menus {
    public static void Encerrar() throws IOException {

        System.out.println("Encerrando pregão");
//        investidor.registraNoArquivo(investidor);
        System.exit(0);
    }
    public static void MenuCorretora() throws IOException {
        Scanner s = new Scanner(System.in);

        System.out.println("O que deseja fazer?\n[1] Ver Ações\n[2] Encerrar Sessão");
        int opc = s.nextByte();
        switch (opc){
            case 1: Acao.criarAcoes();break;
            case 2: Encerrar();break;
        }

    }
    public static void MenuInvestidor() throws IOException {
        Scanner s = new Scanner(System.in);

        System.out.println("O que deseja fazer?\n[1] Ver Ações\n[2] Comprar ações\n[3] Vender ações\n[4] Encerrar Sessão");
        int opc = s.nextByte();
        switch (opc){
            case 1: Acao.criarAcoes();break;
            case 2: Acao.comprarAcoes();break;
            case 3: Acao.venderAcoes();break;
            case 4: Encerrar();
        }

    }

}
