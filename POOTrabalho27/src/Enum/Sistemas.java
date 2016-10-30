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
    //atributos do ENUM
    IGNICAO(0), ALIMENTACAO(1), SINALIZACAO(2), OUTRO(3);
    
    //variavel para saber o tipo
    private final int tipo;
    
    //construtor privado que recebe o número do tipo e atribui a variavel tipo
    private Sistemas(int tipo){
        this.tipo = tipo;
    }
    
    /**
     * Retorna o indice do sistema
     * @return tipo
     */
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
