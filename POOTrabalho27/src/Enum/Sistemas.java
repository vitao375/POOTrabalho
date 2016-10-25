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
    IGNICAO(0), ALIMENTACAO(1), SINALIZACAO(2), OUTRO(3);
    private final int tipo;
    private Sistemas(int tipo){
        this.tipo = tipo;
    }
    public int getSistemas(){
        return tipo;
    }

    /**
     * Método que faz a verificação do tipo de sistema de peça.
     * @return a lista sistema OU null caso não cestiver nada contido.
     */
    public static Sistemas verifica(int valor){
        for (Sistemas sistema : Sistemas.values()) {
            
            if(sistema.getSistemas() == valor)
            return sistema;
        }
        return null;
    }
}
