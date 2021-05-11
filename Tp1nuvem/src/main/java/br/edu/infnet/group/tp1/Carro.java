/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.infnet.group.tp1;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author Gui
 */
public class Carro {
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

}
