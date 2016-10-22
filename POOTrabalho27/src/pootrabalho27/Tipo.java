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
public enum Tipo {
    MOTOR(1),DIRECAO(2), TRANSMISSAO(3), SUSPENSAO(4), FREIO(5), OUTRO(6); 
    private final int tipo;
    private Tipo(int tipo){
        this.tipo=tipo;
    }
    public int getTipo(){
        return tipo;
    }
    public Tipo verifica(int tipo){
        for (Tipo a : Tipo.values()) {
            if(a.getTipo()==tipo){
                return a;
            }
        }
        return null;
    }
}
