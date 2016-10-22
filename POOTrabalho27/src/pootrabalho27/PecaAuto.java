/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pootrabalho27;

/**
 *
 * @author vitao375
 */
public abstract class PecaAuto {
    protected String tipoDaPeca;
    protected String modeloCarro;
    protected Double valor;
    protected int quantidade;
    protected String nome;
    protected String fabricanteP;

    public PecaAuto(String tipoDaPeca, String modeloCarro, Double valor, int quantidade, String nome, String fabricanteP) {
        
        this.tipoDaPeca = tipoDaPeca;
        this.modeloCarro = modeloCarro;
        this.valor = valor;
        this.quantidade = quantidade;
        this.nome = nome;
        this.fabricanteP = fabricanteP;
          
    }

    /**
     * @return the tipoDaPeca
     */
    public String getTipoDaPeca() {
        return tipoDaPeca;
    }

    /**
     * @param tipoDaPeca the tipoDaPeca to set
     */
    public void setTipoDaPeca(String tipoDaPeca) {
        this.tipoDaPeca = tipoDaPeca;
    }

    /**
     * @return the modeloCarro
     */
    public String getModeloCarro() {
        return modeloCarro;
    }

    /**
     * @param modeloCarro the modeloCarro to set
     */
    public void setModeloCarro(String modeloCarro) {
        this.modeloCarro = modeloCarro;
    }

    /**
     * @return the valor
     */
    public Double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(Double valor) {
        this.valor = valor;
    }

    /**
     * @return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
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
     * @return the fabricanteP
     */
    public String getFabricanteP() {
        return fabricanteP;
    }

    /**
     * @param fabricanteP the fabricanteP to set
     */
    public void setFabricanteP(String fabricanteP) {
        this.fabricanteP = fabricanteP;
    }

    @Override
    public String toString() {
        String dados="";
        dados+= "Tipo Da Peça " + tipoDaPeca; 
        dados+= "Modelo do Carro " + modeloCarro;
        dados+= "Valor " + valor; 
        dados+="Quantidade "+quantidade;
        dados+= "Nome " + nome;
        dados+="Fabricante Da Peça " + fabricanteP;
    return dados;
    
    }
    
    
    
}
