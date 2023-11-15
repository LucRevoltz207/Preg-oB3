package entity;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;


public class Carteira  {
    private double saldo;
    private List <Acao> acao;


    public Carteira(double saldo, List<Acao> acao) {
        this.saldo = saldo;
        this.acao = acao;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public List<Acao> getAcao() {
        return acao;
    }

    public void setAcao(List<Acao> acao) {
        this.acao = acao;
    }

    @Override
    public String toString() {
        return "Carteira{" +
                "saldo=" + saldo +
                ", acoes=" + acao +
                '}';
    }

    public static void CriarCarteira() throws IOException{
        double saldo;
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor que deseja depositar na sua carteira");
        saldo= scan.nextDouble();
        System.out.println();
        System.out.println("Saldo da carteira: R$ "+ saldo);
        System.out.println();
        Menus.MenuInvestidor();

    }

}
