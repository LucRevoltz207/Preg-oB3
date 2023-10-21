package entity;

public class Corretoras {

    private Integer idCorretoras;
    private Integer CNPJ;
    private String Nome;
    private String RazaoSocial;
    private String Telefone;

    public Corretoras(Integer idCorretoras, Integer CNPJ, String nome, String razaoSocial, String telefone) {
        this.idCorretoras = idCorretoras;
        this.CNPJ = CNPJ;
        Nome = nome;
        RazaoSocial = razaoSocial;
        Telefone = telefone;
    }

    public Integer getIdCorretoras() {
        return idCorretoras;
    }

    public void setIdCorretoras(Integer idCorretoras) {
        this.idCorretoras = idCorretoras;
    }

    public Integer getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(Integer CNPJ) {
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
        return "Corretoras{" +
                "idCorretoras=" + idCorretoras +
                ", CNPJ=" + CNPJ +
                ", Nome='" + Nome + '\'' +
                ", RazaoSocial='" + RazaoSocial + '\'' +
                ", Telefone='" + Telefone + '\'' +
                '}';
    }
}
