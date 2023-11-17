package entity;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menus {
    public static void main(String[] args) throws IOException {
        MenuCorretora();
    }
    public static void MenuCorretora() throws IOException {
        Scanner s = new Scanner(System.in);

        System.out.println("O que deseja fazer?\n[1] Alterar valor de Ativo\n[2] Registrar Ação \n[3] Excluir Ação\n[4] Ver Ações\n[5] Menu investidor\n[6] Encerrar Sessão");
        int opc = s.nextByte();
        switch (opc){
            case 1: CMudarValorAtivo();break;
            case 2: CRegistrarAcao();break;
            case 3: CExcluiAcao();break;
            case 4: CVerAcoes();break;
            case 5: MenuInvestidor();break;
            case 6: Encerrar();break;
        }

    }
    public static void MenuInvestidor() throws IOException {

        Scanner s = new Scanner(System.in);
        System.out.println("O que deseja fazer?\n[1] Comprar Ações\n[2] Vender Ações \n[3] Ver minhas ações\n[4] Ver ações disponiveis\n[5] Encerrar Sessão\n[6] Adicionar saldo");
        int opc = s.nextByte();
        switch (opc){
            case 1: ICompraAcao();break;
            case 2: IVendeAcao();break;
            case 3: IAcoesCompradas();break;
            case 4: IVerAcoes();break;
            case 5: Encerrar();break;
            case 6: IAddSaldo();break;
        }
    }

    public static void IAddSaldo(){

    }
    public static void IAcoesCompradas(){
        System.out.println(Acao.acoesinvestidor);
        try {
            MenuInvestidor();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void CRegistrarAcao() throws IOException {
        Acao.addAcao();
    }
    public static void ICompraAcao(){
        try {
            Acao.comprarAcoes(Acao.listaAcoes, Acao.acoesinvestidor, new Investidores());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void IVendeAcao(){
        Acao.venderAcoes(Acao.listaAcoes, Acao.acoesinvestidor);
    }
   public static void IVerAcoes() throws IOException {
       Acao.IexibirTodasAcoes();
    }
    public static void CVerAcoes(){
        Acao.CexibirTodasAcoes();
    }
    public static void CMudarValorAtivo() throws IOException {
        Acao.mudarValorAtivo();
    }
    public static void CExcluiAcao(){
        Acao.excluirAcao();
    }
    public static void Encerrar() throws IOException {
        List<Acao> listaAcoes = new ArrayList<>();

        System.out.println("Encerrando pregão");
        Relatorio.criatxt(listaAcoes);
        System.exit(0);
    }
}
