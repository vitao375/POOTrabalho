/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesPeca;

import Enum.Tipo;

/**
 *
 * @author vitao375
 */
public class Mecanica extends PecaAuto{
    private Tipo tipo;

    public Mecanica( String fabricantePeca, String modeloCarro, Double valor, int quantidade, String nome, Tipo tipo) {
        super( fabricantePeca, modeloCarro, valor, quantidade, nome);
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
