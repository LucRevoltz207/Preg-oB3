package entity;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Investidor {
    private Integer idInvestidor;
    private String nome;

    private String CPF;
    private String telefone;

    public Investidor(String nome, String CPF, String telefone, Integer idInvestidor) {
        this.nome = nome;
        this.CPF = CPF;
        this.telefone = telefone;
        this.idInvestidor = idInvestidor;
    }
    public Investidor(){}

    public Integer getIdInvestidor() {
        return idInvestidor;
    }

    public void setIdInvestidor(Integer idInvestidor) {
        this.idInvestidor = idInvestidor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Dados investidor: " +
                "\nNome: " + nome +
                "\nCPF: " + CPF +
                "\nTelefone:" + telefone+
                "\n";
    }
    public static void registraNoArquivo(Investidor investidor) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("Criartxt\\dados.txt", true));
            writer.write(investidor.toString());
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}