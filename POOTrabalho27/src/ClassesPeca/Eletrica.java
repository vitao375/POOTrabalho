/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesPeca;

import Enum.Sistemas;

/**
 *
 * @author vitao375
 */
public class Eletrica extends PecaAuto{
   private double amperagem;
   private  double voltagem;
   private Sistemas sistema;

   /**
    * Construtor da classe Eletrica que contem os principais atributos dela
    * @param fabricanteP
    * @param modeloCarro
    * @param valor
    * @param quantidade
    * @param nome
    * @param amperagem
    * @param voltagem
    * @param sistema 
    */
    public Eletrica(String fabricanteP,String modeloCarro, Double valor, 
                     int quantidade, String nome,Double amperagem, Double voltagem, Sistemas sistema) {
        super(fabricanteP, modeloCarro, valor, quantidade, nome);
        this.amperagem = amperagem;
        this.voltagem = voltagem;
        this.sistema = sistema;
              
    }

    /**
     * @return the amperagem
     */
    public double getAmperagem() {
        return amperagem;
    }

    /**
     * @param amperagem the amperagem to set
     */
    public void setAmperagem(double amperagem) {
        this.amperagem = amperagem;
    }

    /**
     * @return the voltagem
     */
    public double getVoltagem() {
        return voltagem;
    }

    /**
     * @param voltagem the voltagem to set
     */
    public void setVoltagem(double voltagem) {
        this.voltagem = voltagem;
    }

    /**
     * @return the sistema
     */
    public Sistemas getSistema() {
        return sistema;
    }

    /**
     * @param sistema the sistema to set
     */
    public void setSistema(Sistemas sistema) {
        this.sistema = sistema;
    }
    
    @Override
    public String toString() {
        String dados=super.toString();
        dados+= "Amperagem " + amperagem; 
        dados+= "Voltagem " + voltagem;
        dados+= "Sitema " + sistema; 
        
    return dados;
    
    }
    
    
    
    
    
}
