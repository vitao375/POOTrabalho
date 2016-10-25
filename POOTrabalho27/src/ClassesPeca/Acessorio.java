/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesPeca;

import Enum.Material;

/**
 *
 * @author vitao375
 */
public class Acessorio extends PecaAuto{
    private String cor;
    private Material material;

    public Acessorio(String  fabricantePeca, String modeloCarro, Double valor,
            int quantidade, String nome, String cor, Material material) {
        super( fabricantePeca, modeloCarro, valor, quantidade, nome);
        this.cor = cor;
        this.material = material;
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * @return the material
     */
    public Material getMaterial() {
        return material;
    }

    /**
     * @param material the material to set
     */
    public void setMaterial(Material material) {
        this.material = material;
    }
    
    @Override
    public String toString() {
        String dados=super.toString();
        dados+= "Cor " + cor; 
        dados+= "Material " + material;
         
        
    return dados;
    
    }
    
    
    
}
