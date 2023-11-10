package entity;

import java.io.IOException;
import java.util.Scanner;

public class Menus {
    public static void main(String[] args) throws IOException {
        MenuCorretora();
    }
    public static void MenuCorretora() throws IOException {
        Scanner s = new Scanner(System.in);

        System.out.println("O que deseja fazer?\n[1] Alterar valor de Ativo\n[2] Registrar Ação \n[3] Excluir Ação\n[4] Ver Ações\n[5] Encerrar Sessão");
        int opc = s.nextByte();
        switch (opc){
            case 1: CMudarValorAtivo();
            case 2: CRegistrarAcao();
            case 3: CExcluiAcao();
            case 4: CVerAcoes();
            case 5: Encerrar();
        }

    }
    public static void MenuInvestidor(){
        Scanner s = new Scanner(System.in);
        System.out.println("O que deseja fazer?\n[1] Comprar Ações\n[2] Vender Ações \n[3] Ver minhas ações\n[4] Encerrar Sessão");
        int opc = s.nextByte();
        switch (opc){
            case 1: ICompraAcao();
            case 2: IVendeAcao();
            case 3: IVerAcoes();
            case 4: Encerrar();
        }
    }
    public static void CRegistrarAcao() throws IOException {
        Acao.addAcao();
    }
    public static void ICompraAcao(){}
    public static void IVendeAcao(){}
   public static void IVerAcoes(){
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
    public static void Encerrar(){
        System.out.println("Encerrando pregão");
System.exit(0);
    }
}
