package entity;

import entity.Acao;
import entity.Corretoras;
import entity.Investidores;

import java.util.ArrayList;
import java.util.List;

public class Movimentacao {

    private Integer idMovimentacao;
    private Double VariacaoValor;
    private Integer QtdeMovimentacoes;
    private Integer QtdeAcoes;
    private Investidores investidores;
    private Corretoras idCorretoras;
    private Acao idAcao;
    private static List<Movimentacao> listaMovimentacoes = new ArrayList<>();

    public Movimentacao(Integer idMovimentacao, Double variacaoValor, Integer qtdeMovimentacoes, Integer qtdeAcoes, Investidores investidores, Corretoras idCorretoras, Acao idAcao) {
        this.idMovimentacao = idMovimentacao;
        VariacaoValor = variacaoValor;
        QtdeMovimentacoes = qtdeMovimentacoes;
        QtdeAcoes = qtdeAcoes;
        this.investidores = investidores;
        this.idCorretoras = idCorretoras;
        this.idAcao = idAcao;
    }
    public static void adicionarMovimentacao(Movimentacao movimentacao) {
        listaMovimentacoes.add(movimentacao);
    }
    public static List<Movimentacao> getListaMovimentacoes() {
        return listaMovimentacoes;
    }

    public Integer getIdMovimentacao() {
        return idMovimentacao;
    }

    public void setIdMovimentacao(Integer idMovimentacao) {
        this.idMovimentacao = idMovimentacao;
    }

    public Double getVariacaoValor() {
        return VariacaoValor;
    }

    public void setVariacaoValor(Double variacaoValor) {
        VariacaoValor = variacaoValor;
    }

    public Integer getQtdeMovimentacoes() {
        return QtdeMovimentacoes;
    }

    public void setQtdeMovimentacoes(Integer qtdeMovimentacoes) {
        QtdeMovimentacoes = qtdeMovimentacoes;
    }

    public Integer getQtdeAcoes() {
        return QtdeAcoes;
    }

    public void setQtdeAcoes(Integer qtdeAcoes) {
        QtdeAcoes = qtdeAcoes;
    }

    public Investidores getInvestidores() {
        return investidores;
    }

    public void setInvestidores(Investidores investidores) {
        this.investidores = investidores;
    }

    public Corretoras getIdCorretoras() {
        return idCorretoras;
    }

    public void setIdCorretoras(Corretoras idCorretoras) {
        this.idCorretoras = idCorretoras;
    }

    public Acao getIdAcao() {
        return idAcao;
    }

    public void setIdAcao(Acao idAcao) {
        this.idAcao = idAcao;
    }

    @Override
    public String toString() {
        return "Movimentacao{" +
                "idMovimentacao=" + idMovimentacao +
                ", VariacaoValor=" + VariacaoValor +
                ", QtdeMovimentacoes=" + QtdeMovimentacoes +
                ", QtdeAcoes=" + QtdeAcoes +
                ", investidores=" + investidores +
                ", idCorretoras=" + idCorretoras +
                ", idAcao=" + idAcao +
                '}';
    }
}
