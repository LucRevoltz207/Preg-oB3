package entity;

public class Investidores {

    private Integer id_investidor;
    private String Nome;
    private Integer CPF;
    private String NomeUsuario;
    private String Senha;
    private Integer Telefone;
    private String Email;

    public Investidores(Integer id_investidor, String nome, Integer CPF, String nomeUsuario, String senha, Integer telefone, String email) {
        this.id_investidor = id_investidor;
        Nome = nome;
        this.CPF = CPF;
        NomeUsuario = nomeUsuario;
        Senha = senha;
        Telefone = telefone;
        Email = email;
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

    public Integer getCPF() {
        return CPF;
    }

    public void setCPF(Integer CPF) {
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

    public Integer getTelefone() {
        return Telefone;
    }

    public void setTelefone(Integer telefone) {
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
        return "Investidores{" +
                "id_investidor=" + id_investidor +
                ", Nome='" + Nome + '\'' +
                ", CPF=" + CPF +
                ", NomeUsuario='" + NomeUsuario + '\'' +
                ", Senha='" + Senha + '\'' +
                ", Telefone=" + Telefone +
                ", Email='" + Email + '\'' +
                '}';
    }
}
