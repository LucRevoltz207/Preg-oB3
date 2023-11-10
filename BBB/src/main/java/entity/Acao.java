package entity;

public class Acao {

    private Integer idAcao;
    private String Ticker;
    private String NomeAcao;
    private Double VariacaoValor;

    public Acao(Integer idAcao, String ticker, String nomeAcao, Double variacaoValor) {
        this.idAcao = idAcao;
        Ticker = ticker;
        NomeAcao = nomeAcao;
        VariacaoValor = variacaoValor;
    }

    public Integer getIdAcao() {
        return idAcao;
    }

    public void setIdAcao(Integer idAcao) {
        this.idAcao = idAcao;
    }

    public String getTicker() {
        return Ticker;
    }

    public void setTicker(String ticker) {
        Ticker = ticker;
    }

    public String getNomeAcao() {
        return NomeAcao;
    }

    public void setNomeAcao(String nomeAcao) {
        NomeAcao = nomeAcao;
    }

    public Double getVariacaoValor() {
        return VariacaoValor;
    }

    public void setVariacaoValor(Double variacaoValor) {
        VariacaoValor = variacaoValor;
    }

    @Override
    public String toString() {
        return "Acao{" +
                "idAcao=" + idAcao +
                ", Ticker='" + Ticker + '\'' +
                ", NomeAcao='" + NomeAcao + '\'' +
                ", VariacaoValor=" + VariacaoValor +
                '}';
    }
}
