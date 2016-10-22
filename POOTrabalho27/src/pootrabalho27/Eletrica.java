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
public class Eletrica extends PecaAuto{
   private double amperagem;
   private  double voltagem;
   private Sistemas sistema;

    public Eletrica(String tipoDaPeca, String modeloCarro, Double valor, 
                     int quantidade, String nome, String fabricanteP,
                     double amperagem, double voltagem, Sistemas sistema) {
        super(tipoDaPeca, modeloCarro, valor, quantidade, nome, fabricanteP);
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
