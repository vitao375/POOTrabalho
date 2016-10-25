package Enum;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author vitao375
 */
public enum Tipo {
    MOTOR(0),DIRECAO(1), TRANSMISSAO(2), SUSPENSAO(3), FREIO(4), OUTRO(5); 
    private final int tipo;
    private Tipo(int tipo){
        this.tipo=tipo;
    }
    public int getTipo(){
        return tipo;
    }
    public static Tipo verifica(int tipo){
        for (Tipo a : Tipo.values()) {
            if(a.getTipo()==tipo){
                return a;
            }
        }
        return null;
    }
}
