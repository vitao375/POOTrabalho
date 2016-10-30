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
public enum Material {//variavel para saber o tipo
    //Atributos do ENUM
    PLASTICO(0),METAL(1),CARBONO(2),OUTRO(3);
    
    private final int tipo;
    //construtor privado que recebe o número do tipo e atribui a variavel tipo
    private Material(int tipo){
        this.tipo=tipo;
    }
    /**
     * retorna o int do material
     * @return tipo 
     */
    public int getMaterial(){
        return tipo;
    }
    
    /**
     * Método que realiza a verificação do tipo de componente de material.
     * @param material
     * @return a lista atribuida a.
     */
    public static Material verifica(int material){
        for (Material a : Material.values()) {
            if(a.getMaterial()== material){
                return a;
            }
        }
        return null;
    }


}
