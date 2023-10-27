package entity;

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
        if (opc == 1) {

            CadastroPessoa();
        } else {
            CadastroCorretora();
        }
    }

    public static void CadastroPessoa(){
        Investidores i = new Investidores();
        System.out.print("Nome: ");
        Scanner value = new Scanner(System.in);
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
        System.out.println(i.toString());
    }
    public static void CadastroCorretora(){
        Corretoras c = new Corretoras();
        System.out.print("Nome: ");
        Scanner value = new Scanner(System.in);
        c.setNome(value.nextLine());
        System.out.print("CNPJ: ");
        c.setCNPJ(value.nextLine());
        System.out.print("Telefone: ");
        c.setTelefone(value.next());
        System.out.print("Razão social: ");
        c.setRazaoSocial(value.next());
        System.out.println("\nCorretora cadastrada!");
        System.out.println(c.toString());
    }
}