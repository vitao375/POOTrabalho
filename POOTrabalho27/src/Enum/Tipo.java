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
    //atributos do ENUM
    MOTOR(0),DIRECAO(1), TRANSMISSAO(2), SUSPENSAO(3), FREIO(4), OUTRO(5); 
    
    //variavel para saber o tipo
    private final int tipo;
    
    //construtor privado que recebe o número do tipo e atribui a variavel tipo
    private Tipo(int tipo){
        this.tipo=tipo;
    }
    /**
     * retorna o int do Tipo
     * @return tipo 
     */
    public int getTipo(){
        return tipo;
    }
    
    /**
     * Método que realiza a verificação do tipo de peça que compõe um carro
     * @param tipo
     * @return a lista contendo a
     */
    public static Tipo verifica(int tipo){
        for (Tipo a : Tipo.values()) {
            if(a.getTipo()==tipo){
                return a;
            }
        }
        return null;
    }
}
