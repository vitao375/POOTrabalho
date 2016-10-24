/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enum;

/**
 *
 * @author vitao375
 */
public enum Sistemas {
    IGNICAO(1), ALIMENTACAO(2), SINALIZACAO(3), OUTRO(4);
    private final int tipo;
    private Sistemas(int tipo){
        this.tipo = tipo;
    }
    public int getSistemas(){
        return tipo;
    }

    /**
     *
     * @return
     */
    public Sistemas verifica(int valor){
        for (Sistemas sistema : Sistemas.values()) {
            
            if(sistema.getSistemas() == valor)
            return sistema;
        }
        return null;
    }
}
