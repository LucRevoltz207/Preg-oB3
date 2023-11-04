package entity;

import java.util.Scanner;

public class Menus {
    public static void main(String[] args) {
        MenuCorretora();
    }
    public static void MenuCorretora(){
        Scanner s = new Scanner(System.in);
        System.out.println("O que deseja fazer?\n[1] Alterar valor de Ativo\n[2] Registrar Ação \n[3] Excluir Ação\n[4] Ver Ações\n[5] Encerrar Sessão");
        int opc = s.nextByte();
        switch (opc){
            case 1: CMudarValorAtivo();
            case 2: CRegistrarAcao();
            case 3: CExcluiAcao();
            case 4: IVerAcoes();
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
    public static void CRegistrarAcao(){
Acao a = new Acao();
a.addAcao();
    }
    public static void ICompraAcao(){}
    public static void IVendeAcao(){}
   public static void IVerAcoes(){/*
       ArvoreBinariaAcoes arvore = new ArvoreBinariaAcoes();
        System.out.println("Ações na árvore (representação toString):");
        System.out.println(arvore.toStringAcoes());*/
    }
    public static void CMudarValorAtivo(){}
    public static void CExcluiAcao(){}
    public static void Encerrar(){
System.exit(0);
    }
}
