package entity;


import java.io.IOException;
import java.util.Scanner;


public class Investidores {


    //metodo para adicionar saldo á carteira do usuário
    public static void addSaldo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Saldo para adicionar à carteira: ");
        double valorAdicionado = scanner.nextDouble();

        // Verificar se o valor inserido é não negativo antes de atualizar o saldo
        if (valorAdicionado > 0) {
            saldo += valorAdicionado; // Adicionar o valor inserido ao saldo
            System.out.println("Saldo atualizado: " + saldo);
        }
        else {

            System.out.println("Valor inválido. O saldo não foi atualizado.");
            addSaldo();
        }
    }

    private Integer id_investidor;

    private String Nome;

    private String CPF;

    private String NomeUsuario;

    private String Senha;

    private String Telefone;

    private String Email;
    private Double Cash;
    private static Double saldo = 0.0;

    public Investidores(Double saldo, Integer id_investidor, String nome, String CPF, String nomeUsuario, String senha, String telefone, String email, Double cash) {
        this.id_investidor = id_investidor;
        Nome = nome;
        this.CPF = CPF;
        NomeUsuario = nomeUsuario;
        Senha = senha;
        Telefone = telefone;
        Email = email;
        Cash = cash;
        this.saldo = saldo;
    }


    public Investidores() {}



    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Integer getId_investidor() {
        return id_investidor;
    }

    public void setId_investidor(Integer id_investidor) {
        this.id_investidor = id_investidor;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNomeUsuario() {
        return NomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        NomeUsuario = nomeUsuario;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String senha) {
        Senha = senha;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String telefone) {
        Telefone = telefone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Double getCash() {
        return Cash;
    }

    public void setCash(Double cash) {
        Cash = cash;
    }

    @Override
    public String toString() {
        return "Dados:" +
                "\nNome " + Nome +
                "\nCPF: " + CPF +
                "\nNome de usuário: " + NomeUsuario +
                "\nTelefone:  " + Telefone +
                "\nEmail: " + Email+
                "\nSaldo: R$ " + saldo+
                "\n";
    }
}
