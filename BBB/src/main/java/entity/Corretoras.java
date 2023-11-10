package entity;
    import jakarta.persistence.*;

@Entity (name = "Corretoras")
@Table


public class Corretoras {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id

    private Integer idCorretoras;
    @Column
    private String CNPJ;
    @Column
    private String Nome;
    @Column
    private String RazaoSocial;
    @Column
    private String Telefone;

    public Corretoras(Integer idCorretoras, String CNPJ, String nome, String razaoSocial, String telefone) {
        this.idCorretoras = idCorretoras;
        this.CNPJ = CNPJ;
        Nome = nome;
        RazaoSocial = razaoSocial;
        Telefone = telefone;
    }

    public Corretoras() {

    }

    public Integer getIdCorretoras() {
        return idCorretoras;
    }

    public void setIdCorretoras(Integer idCorretoras) {
        this.idCorretoras = idCorretoras;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getRazaoSocial() {
        return RazaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        RazaoSocial = razaoSocial;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String telefone) {
        Telefone = telefone;
    }

    @Override
    public String toString() {
        return "Dados da Empresa:\n"+
                "Nome Empresa: "+ Nome +
                "\nCNPJ: " + CNPJ +
                "\nRazao Social: " + RazaoSocial +
                "\nTelefone: " + Telefone;
    }
}
