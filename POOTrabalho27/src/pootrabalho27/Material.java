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
public enum Material {
    
    PLASTICO(1),METAL(2),CARBONO(3),OUTRO(4); 
    private final int tipo;
    private Material(int tipo){
        this.tipo=tipo;
    }
    public int getMaterial(){
        return tipo;
    }
    public Material verifica(int material){
        for (Material a : Material.values()) {
            if(a.getMaterial()==material){
                return a;
            }
        }
        return null;
    }


}
