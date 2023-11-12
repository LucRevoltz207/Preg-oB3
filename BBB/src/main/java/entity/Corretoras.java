package entity;
    import jakarta.persistence.*;




public class Corretoras {
    private Integer idCorretoras;

    private String CNPJ;

    private String Nome;

    private String RazaoSocial;

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
        return "Dados da Corretora:\n"+
                "Nome Corretora: "+ Nome +
                "\nCNPJ: " + CNPJ +
                "\nRazao Social: " + RazaoSocial +
                "\nTelefone: " + Telefone;
    }
}
