package entity;

import jakarta.persistence.criteria.CriteriaBuilder;

import java.io.IOException;
import java.util.Scanner;

public class Cadastros {
    public static void main(String[] args) {
        CadastroMain();
    }

    //difere entre investidor (a) e corretora
    public static void CadastroMain() {
        Scanner scan = new Scanner(System.in);

        System.out.println("\nBem-vind@ ao pregão!\n\n");
        System.out.println("Iniciar sessão ");

        System.out.println("Você é um(a): [1] Investidor(a) [2] Corretora ");
        int opc = scan.nextByte();

        //Verifica se o usuario é um(a) investidor(a) ou uma corretora
        if (opc == 1) {
            CadastroPessoa();
            //chama o metodo que cadastra investidor
        } else if (opc == 2) {
            CadastroCorretora();
            //chama o metodo que cadastra corretora
        } else {
            System.out.println("Opção invalida");
            CadastroMain();
            //chama o metodo que retorna ao cadastro
        }
    }

        //cadastrar investidor
    public static void CadastroPessoa(){
        Investidores i = new Investidores();
        Scanner value = new Scanner(System.in);

        System.out.println("Digite seus dados a seguir");

        System.out.print("\nNome: ");
        i.setNome(value.nextLine());

        System.out.print("Nome de usuário: ");
        i.setNomeUsuario(value.nextLine());

        System.out.print("Senha: ");
        i.setSenha(value.nextLine());

        System.out.print("CPF: ");
        i.setCPF(value.nextLine());

        System.out.print("Telefone: ");
        i.setTelefone(value.nextLine());

        System.out.print("E-mail: ");
        i.setEmail(value.nextLine());

        Investidores.addSaldo(); //chama o metodo para adicionar saldo a carteira

        System.out.println("Cadastro Concluido!\n");
        System.out.println(i);

        try {
            Menus.MenuInvestidor();//Chama a função que da ao usuario a possibilidade de alterar sua carteira
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public static void CadastroCorretora(){
        Corretoras c = new Corretoras();
        Scanner value = new Scanner(System.in);

        System.out.println("Digite os dados da corretora a seguir");

        System.out.print("Nome: ");
        c.setNome(value.nextLine());

        System.out.print("CNPJ: ");
        c.setCNPJ(value.nextLine());

        System.out.print("Telefone: ");
        c.setTelefone(value.nextLine());

        System.out.print("Razão social: ");
        c.setRazaoSocial(value.nextLine());

        System.out.println("\nCorretora cadastrada!");
        System.out.println(c);

        try {
            Menus.MenuCorretora();//chama a função para que as corretoras possam fazer alterações nas ações
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}