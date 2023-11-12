package entity;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Carteira  {
    private double saldo;
    ArrayList<Acao> acoesinvestidor = new ArrayList<>();


    public Carteira(double saldo, ArrayList<Acao> acoes) {
        this.saldo = saldo;
        this.acoesinvestidor = acoes;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ArrayList<Acao> getAcoes() {
        return acoesinvestidor;
    }

    public void setAcoes(ArrayList<Acao> acoes) {
        this.acoesinvestidor = acoes;
    }

    @Override
    public String toString() {
        return "Carteira{" +
                "saldo=" + saldo +
                ", acoes=" + acoesinvestidor +
                '}';
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

}
