package entity;

import java.io.IOException;
import java.util.Scanner;

public class Cadastros {
    public static void main(String[] args) {
        CadastroMain();
    }

    public static void CadastroMain() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Primeiro cadastro");
        System.out.println("Você é um(a): [1] Pessoa [2] Empresa");
        int opc = scan.nextByte();
        //Verifica se o usuario é uma pessoa ou Empresa, para que se diferencie as perguntar e seja mais espeecifico
        if (opc == 1) {

            CadastroPessoa();
            //chama o metodo que cadastra pessoa
        } else if (opc==2) {
            CadastroCorretora();}
                else {
            System.out.println("Opção invalida");
            CadastroMain();
        }


            //chama o metodo que cadastra corretoras
        }


    public static void CadastroPessoa(){
        Investidores i = new Investidores();
        Scanner value = new Scanner(System.in);


        System.out.print("Nome: ");
        i.setNome(value.nextLine());
        System.out.print("Defina um nome de usuário :");
        i.setNomeUsuario(value.nextLine());
        System.out.print("Defina uma senha: ");
        i.setSenha(value.nextLine());
        System.out.println("\nPrecisamos de mais informações para o seu cadastro ser concluido com segurança\n");
        System.out.print("Digite o CPF (somente números): ");
        i.setCPF(value.nextLine());
        System.out.print("Digite seu telefone (somente numeros): ");
        i.setTelefone(value.nextLine());
        System.out.print("Digite seu melhor email: ");
        i.setEmail(value.nextLine());


        System.out.println("Cadastro Concluido!");
        System.out.println(i);
        System.out.println("Digite qualquer tecla para avançar");
        value.next();


        try {
            Menus.MenuInvestidor();//Chama a função que da ao usuario a possibilidade de alterar sua carteira
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void CadastroCorretora(){
        Corretoras c = new Corretoras();

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
        System.out.println("Digite qualquer tecla para avançar");
        value.next();

        try {
            Menus.MenuCorretora();//chama a função para que as corretoras possam fazer alterações nas ações
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}