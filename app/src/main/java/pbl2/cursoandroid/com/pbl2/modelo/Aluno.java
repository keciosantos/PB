package pbl2.cursoandroid.com.pbl2.modelo;

import java.io.Serializable;

/**
 * Created by keciosantos on 11/12/17.
 */

public class Aluno implements Serializable {
    private Integer id;
    private String nome;
    private String ano;
    private int semestre;
    private double participacao;
    private double presenca;
    private double comprometimento;
    private Integer idTurma;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public Integer getIdTurma() {
        return idTurma;
    }

    public void setIdTurma(Integer idTurma) {
        this.idTurma = idTurma;
    }

    public String toString(){
        return id+"-"+nome;
    }

    public double getParticipacao() {
        return participacao;
    }

    public void setParticipacao(double participacao) {
        this.participacao = participacao;
    }

    public double getPresenca() {
        return presenca;
    }

    public void setPresenca(double presenca) {
        this.presenca = presenca;
    }

    public double getComprometimento() {
        return comprometimento;
    }

    public void setComprometimento(double comprometimento) {
        this.comprometimento = comprometimento;
    }
}
