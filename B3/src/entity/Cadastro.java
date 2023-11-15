package entity;

import java.io.IOException;
import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {
        CadastroMain();
    }

    public static void CadastroMain() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bem- vind@ ao pregão!! ");
        System.out.println("Cadastro");
        System.out.println("Você é um(a): [1] Investidor [2] Corretora ");
        int opc = scan.nextInt();
        //Verifica se o usuario é uma pessoa ou Empresa, para que se diferencie as perguntar e seja mais espeecifico
        if (opc == 1) {
            CadastroInvestidor();
            //chama o metodo que cadastra pessoa
        } else if (opc == 2) {
            CadastroCorretora();
        } else {
            System.out.println("Opção invalida");
            CadastroMain();
        }
    }
    public static void CadastroCorretora() {
        Corretora c = new Corretora();
        System.out.print("Nome: ");
        Scanner value = new Scanner(System.in);
        c.setNome(value.nextLine());
        System.out.print("CNPJ: ");
        c.setCNPJ(value.nextLine());
        System.out.print("Telefone: ");
        c.setTelefone(value.nextLine());
        System.out.print("Razão social: ");
        c.setRazaoSocial(value.nextLine());
        System.out.println("\nCorretora cadastrada!");
        System.out.println(c);
        System.out.println("Digite 1 para avançar || digite 2 para encerrar");

        int opc2 = value.nextByte();
        if (opc2 == 1) {
            try {
                Menus.MenuCorretora();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (opc2 == 2) {
            try {
                Menus.Encerrar(); //encerra pregao
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("Opção invalida");
            Cadastro.CadastroMain(); //volta para o cadastro
        }

    }
    public static void CadastroInvestidor(){
        Investidor i = new Investidor();
        System.out.print("Nome: ");
        Scanner value = new Scanner(System.in);
        i.setNome(value.nextLine());
        System.out.print("CPF: ");
        i.setCPF(value.nextLine());
        System.out.print("Telefone: ");
        i.setTelefone(value.nextLine());

        System.out.print("\nInvestidor cadastrado!");
        System.out.println();
        System.out.println();
        System.out.println(i);

        System.out.println("Digite 1 para avançar || digite 2 para encerrar");

        int opc2 = value.nextByte();
        if (opc2 == 1) {
            try {
                Carteira.CriarCarteira();//chama o metodo  criar carteira
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (opc2 == 2) {
            try {
                Menus.Encerrar(); //encerra pregao
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("Opção invalida");
            Cadastro.CadastroMain(); //volta para o cadastro
        }

    }
}


