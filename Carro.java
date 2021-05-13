/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.infnet.dev.exemplo2.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author Gui
 */
public class Carro {
    @JsonIgnoreProperties(ignoreUnknown = false)
    
    @JsonProperty("Valor")
    private String valor;
    @JsonProperty("Marca")
    private String marca;
    @JsonProperty("Modelo")
    private String modelo;
    @JsonProperty("AnoModelo")
    private int ano;
    @JsonProperty("Combustivel")
    private String combustivel;
    @JsonProperty("CodigoFipe")
    private int codigofipe;
    @JsonProperty("MesReferencia")
    private String mesreferencia;
    @JsonProperty("TipoVeiculo")
    private int tipoveiculo;
    @JsonProperty("SiglaCombustivel")
    private String siglaveiculo;

    public Carro(){}
    @JsonProperty("Valor")
    public String getValor() {
        return valor;
    }
    @JsonProperty("Valor")
    public void setValor(String valor) {
        this.valor = valor;
    }
    @JsonProperty("Marca")
    public String getMarca() {
        return marca;
    }
    @JsonProperty("Marca")
    public void setMarca(String marca) {
        this.marca = marca;
    }
    @JsonProperty("Modelo")
    public String getModelo() {
        return modelo;
    }
    @JsonProperty("Modelo")
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    @JsonProperty("AnoModelo")
    public int getAno() {
        return ano;
    }
    @JsonProperty("AnoModelo")
    public void setAno(int ano) {
        this.ano = ano;
    }
    @JsonProperty("Combustivel")
    public String getCombustivel() {
        return combustivel;
    }
    @JsonProperty("Combustivel")
    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }
    @JsonProperty("CodigoFipe")
    public int getCodigofipe() {
        return codigofipe;
    }
    @JsonProperty("CodigoFipe")
    public void setCodigofipe(int codigofipe) {
        this.codigofipe = codigofipe;
    }
    @JsonProperty("MesReferencia")
    public String getMesreferencia() {
        return mesreferencia;
    }
    @JsonProperty("MesReferencia")
    public void setMesreferencia(String mesreferencia) {
        this.mesreferencia = mesreferencia;
    }
    @JsonProperty("TipoVeiculo")
    public int getTipoveiculo() {
        return tipoveiculo;
    }
    @JsonProperty("TipoVeiculo")
    public void setTipoveiculo(int tipoveiculo) {
        this.tipoveiculo = tipoveiculo;
    }
    @JsonProperty("SiglaCombustivel")
    public String getSiglaveiculo() {
        return siglaveiculo;
    }
    @JsonProperty("SiglaCombustivel")
    public void setSiglaveiculo(String siglaveiculo) {
        this.siglaveiculo = siglaveiculo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Carro{valor=").append(valor);
        sb.append(", marca=").append(marca);
        sb.append(", modelo=").append(modelo);
        sb.append(", ano=").append(ano);
        sb.append(", combustivel=").append(combustivel);
        sb.append(", codigofipe=").append(codigofipe);
        sb.append(", mesreferencia=").append(mesreferencia);
        sb.append(", tipoveiculo=").append(tipoveiculo);
        sb.append(", siglaveiculo=").append(siglaveiculo);
        sb.append('}');
        return sb.toString();
    }

    
}

