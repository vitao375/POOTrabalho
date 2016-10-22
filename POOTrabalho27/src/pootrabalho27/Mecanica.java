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
public class Mecanica extends PecaAuto{
    private Tipo tipo;

    public Mecanica(String tipoDaPeca, String modeloCarro, Double valor, int quantidade, String nome, String fabricanteP, Tipo tipo) {
        super(tipoDaPeca, modeloCarro, valor, quantidade, nome, fabricanteP);
        this.tipo = tipo;
        
        
    }

    /**
     * @return the tipo
     */
    public Tipo getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public String toString() {
        String dados=super.toString();
        dados+= "Tipo " + tipo; 
    return dados;
    
    }
       
}
