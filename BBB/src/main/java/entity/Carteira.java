package entity;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Carteira  {
    private double saldo;
    private ArrayList<Acao> acoesInvestidor = new ArrayList<>();



    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }




    public static void CriarCarteira() throws IOException{
        double saldo;
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor que deseja depositar na sua carteira");
        saldo= scan.nextDouble();
        System.out.println("Saldo da carteira:"+ saldo);
        System.out.println();
        Menus.MenuInvestidor();

    }
    public void adicionarAcao(Acao acao) {

    }

    public ArrayList<Acao> getAcoesInvestidor() {
        return acoesInvestidor;
    }

    public void setAcoesInvestidor(ArrayList<Acao> acoesInvestidor) {
        this.acoesInvestidor = acoesInvestidor;
    }

    public Carteira(double saldo, ArrayList<Acao> acoesInvestidor) {
        this.saldo = saldo;
        this.acoesInvestidor = acoesInvestidor;
    }
}
