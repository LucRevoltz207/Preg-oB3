package entity;


import java.util.LinkedList;


public class Investidores {

    private Integer id_investidor;

    private String Nome;

    private String CPF;

    private String NomeUsuario;

    private String Senha;

    private String Telefone;

    private String Email;
    private Carteira Carteira;


    public Investidores(Integer id_investidor, String nome, String CPF, String nomeUsuario, String senha, String telefone, String email, Carteira carteira) {
        this.id_investidor = id_investidor;
        Nome = nome;
        this.CPF = CPF;
        NomeUsuario = nomeUsuario;
        Senha = senha;
        Telefone = telefone;
        Email = email;
        Carteira = carteira;

    }

LinkedList Investidores = new LinkedList<>();


    public Investidores() {

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

    public entity.Carteira getCarteira() {
        return Carteira;
    }

    public void setCarteira(entity.Carteira carteira) {
        Carteira = carteira;
    }

    public LinkedList getInvestidores() {
        return Investidores;
    }

    public void setInvestidores(LinkedList investidores) {
        Investidores = investidores;
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

    public Investidores(Integer id_investidor, String nome, String CPF, String nomeUsuario, String senha, String telefone, String email, entity.Carteira carteira, LinkedList investidores) {
        this.id_investidor = id_investidor;
        Nome = nome;
        this.CPF = CPF;
        NomeUsuario = nomeUsuario;
        Senha = senha;
        Telefone = telefone;
        Email = email;
        Carteira = carteira;
        Investidores = investidores;
    }
}
