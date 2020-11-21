/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

/**
 *
 * @author johnn
 */
public class Medicos {

    /**
     * @return the pesquisa
     */
    public String getPesquisa() {
        return pesquisa;
    }

    /**
     * @param pesquisa the pesquisa to set
     */
    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }

    /**
     * @return the idmedicos
     */
    public int getIdmedicos() {
        return idmedicos;
    }

    /**
     * @param idmedicos the idmedicos to set
     */
    public void setIdmedicos(int idmedicos) {
        this.idmedicos = idmedicos;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the CRM
     */
    public String getCRM() {
        return CRM;
    }

    /**
     * @param CRM the CRM to set
     */
    public void setCRM(String CRM) {
        this.CRM = CRM;
    }

    /**
     * @return the pacientes_total
     */
    public int getPacientes_total() {
        return pacientes_total;
    }

    /**
     * @param pacientes_total the pacientes_total to set
     */
    public void setPacientes_total(int pacientes_total) {
        this.pacientes_total = pacientes_total;
    }

    /**
     * @return the pacientes_1Turno
     */
    public int getPacientes_1Turno() {
        return pacientes_1Turno;
    }

    /**
     * @param pacientes_1Turno the pacientes_1Turno to set
     */
    public void setPacientes_1Turno(int pacientes_1Turno) {
        this.pacientes_1Turno = pacientes_1Turno;
    }

    /**
     * @return the pacientes_2Turno
     */
    public int getPacientes_2Turno() {
        return pacientes_2Turno;
    }

    /**
     * @param pacientes_2Turno the pacientes_2Turno to set
     */
    public void setPacientes_2Turno(int pacientes_2Turno) {
        this.pacientes_2Turno = pacientes_2Turno;
    }

    /**
     * @return the pacientes_3Turno
     */
    public int getPacientes_3Turno() {
        return pacientes_3Turno;
    }

    /**
     * @param pacientes_3Turno the pacientes_3Turno to set
     */
    public void setPacientes_3Turno(int pacientes_3Turno) {
        this.pacientes_3Turno = pacientes_3Turno;
    }

    /**
     * @return the pacientes_4Turno
     */
    public int getPacientes_4Turno() {
        return pacientes_4Turno;
    }

    /**
     * @param pacientes_4Turno the pacientes_4Turno to set
     */
    public void setPacientes_4Turno(int pacientes_4Turno) {
        this.pacientes_4Turno = pacientes_4Turno;
    }
    private int idmedicos;
    private String nome;
    private String CRM;
    private int pacientes_total;
    private int pacientes_1Turno;
    private int pacientes_2Turno;
    private int pacientes_3Turno;
    private int pacientes_4Turno;
    private String pesquisa;
    
}
