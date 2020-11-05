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
public class Paciente {

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @param bairro the bairro to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * @return the rua
     */
    public String getRua() {
        return rua;
    }

    /**
     * @param rua the rua to set
     */
    public void setRua(String rua) {
        this.rua = rua;
    }

    /**
     * @return the nResidencia
     */
    public String getnResidencia() {
        return nResidencia;
    }

    /**
     * @param nResidencia the nResidencia to set
     */
    public void setnResidencia(String nResidencia) {
        this.nResidencia = nResidencia;
    }

    /**
     * @return the CPF
     */
    public String getCPF() {
        return CPF;
    }

    /**
     * @param CPF the CPF to set
     */
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    /**
     * @return the CNS
     */
    public String getCNS() {
        return CNS;
    }

    /**
     * @param CNS the CNS to set
     */
    public void setCNS(String CNS) {
        this.CNS = CNS;
    }
    
    private int id;
    private String  nome;
    private int turno;
    private String medico;
    private String cidade;
    private String bairro;
    private String rua;
    private String nResidencia;
    private String CPF;
    private String CNS;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }
    
    
    
    
    
    
    
}
