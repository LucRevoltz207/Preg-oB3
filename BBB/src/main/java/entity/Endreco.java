package entity;

public class Endreco {
    private Integer Numero_Residencial;
    private String Complemento;
    private String Bairro;
    private String Logradouro;

    public static class Cidade {
        private Integer Cidade;
        private String NomeCidade;

        public Cidade(Integer cidade, String nomeCidade) {
            Cidade = cidade;
            NomeCidade = nomeCidade;
        }

        public Integer getCidade() {
            return Cidade;
        }

        public void setCidade(Integer cidade) {
            Cidade = cidade;
        }

        public String getNomeCidade() {
            return NomeCidade;
        }

        public void setNomeCidade(String nomeCidade) {
            NomeCidade = nomeCidade;
        }
    }
    public static class Estado {
        private Integer idEstado;
        private String NomeEstado;
        public Estado(Integer idEstado, String nomeEstado) {
            this.idEstado = idEstado;
            NomeEstado = nomeEstado;
        }

        public Integer getIdEstado() {
            return idEstado;
        }

        public void setIdEstado(Integer idEstado) {
            this.idEstado = idEstado;
        }

        public String getNomeEstado() {
            return NomeEstado;
        }

        public void setNomeEstado(String nomeEstado) {
            NomeEstado = nomeEstado;
        }
    }

    public static class Pais {

        private Integer idPais;
        private String NomePais;
        public Pais(Integer idPais, String nomePais) {
            this.idPais = idPais;
            NomePais = nomePais;
        }

        public Integer getIdPais() {
            return idPais;
        }

        public void setIdPais(Integer idPais) {
            this.idPais = idPais;
        }

        public String getNomePais() {
            return NomePais;
        }

        public void setNomePais(String nomePais) {
            NomePais = nomePais;
        }
    }
}
