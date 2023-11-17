package entity;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Carteira  {
    private double saldo;

    public Carteira(double saldo) {
        this.saldo = saldo;

    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Carteira{" +
                "saldo=" + saldo +" ";

    }

//    public static void CriarCarteira() throws IOException{
//        double saldo;
//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("Digite o valor que deseja depositar na sua carteira");
//        saldo= scan.nextDouble();
//        System.out.println("Saldo da carteira:"+ saldo);
//        System.out.println();
//        Menus.MenuInvestidor();
//
//    }

}
