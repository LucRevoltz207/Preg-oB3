package entity;


import jakarta.persistence.*;

@Entity (name = "Investidores")
@Table (name = "Investidores")



public class Investidores {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id

    private Integer id_investidor;
    @Column
    private String Nome;
    @Column
    private String CPF;
    @Column
    private String NomeUsuario;
    @Column
    private String Senha;
    @Column
    private String Telefone;
    @Column
    private String Email;

    public Investidores(Integer id_investidor, String nome, String CPF, String nomeUsuario, String senha, String telefone, String email) {
        this.id_investidor = id_investidor;
        Nome = nome;
        this.CPF = CPF;
        NomeUsuario = nomeUsuario;
        Senha = senha;
        Telefone = telefone;
        Email = email;
    }

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

    @Override
    public String toString() {
        return "Seus dados foram definidos assim:\n" +
                "\nNome " + Nome +
                "\nCPF: " + CPF +
                "\nNome de usuário: " + NomeUsuario +
                "\nTelefone:  " + Telefone +
                "\nEmail: " + Email ;
    }
}
