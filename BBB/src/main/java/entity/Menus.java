package entity;

import java.util.Scanner;

public class Menus {
    public static void main(String[] args) {
        MenuCorretora();
    }
    public static void MenuCorretora(){
        Scanner s = new Scanner(System.in);
        System.out.println("O que deseja fazer?\n[1] Alterar valor de Ativo\n[2] Registrar Ação \n[3] Excluir Ação");
        int opc = s.nextByte();
        switch (opc){
            case 1: CMudarValorAtivo();
            case 2: CRegistrarAcao();
            case 3: CExcluiAcao();
        }

    }
    public static void MenuInvestidor(){
        Scanner s = new Scanner(System.in);
        System.out.println("O que deseja fazer?\n[1] Comprar Ações\n[2] Vender Ações \n[3] Ver minhas ações");
        int opc = s.nextByte();
        switch (opc){
            case 1: ICompraAcao();
            case 2: IVendeAcao();
            case 3: IVerAcoes();
        }
    }
    public static void CRegistrarAcao(){

    }
    public static void ICompraAcao(){}
    public static void IVendeAcao(){}
    public static void IVerAcoes(){}
    public static void CMudarValorAtivo(){}
    public static void CExcluiAcao(){}
}
