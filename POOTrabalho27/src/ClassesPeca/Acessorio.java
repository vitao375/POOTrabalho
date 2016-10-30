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

    /**
     * Construtor da classe Acessorio contendo os atributos dela
     * @param fabricantePeca
     * @param modeloCarro
     * @param valor
     * @param quantidade
     * @param nome
     * @param cor
     * @param material 
     */
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
    /**
     * Retorna os dados da classe
     * @return dados 
     */
    @Override
    public String toString() {
        String dados=super.toString();
        dados+= "Cor " + cor; 
        dados+= "Material " + material;
         
        
    return dados;
    
    }
    /**
     * Método para escrita em CSV que retorna uma String com os dados
     * @return dados
     */
    @Override
    public String writeFile() {
        String dados="";
        dados= "Acessorio"+";"+fabricantePeca+";"+modeloCarro+";"+valor+";"+quantidade+";"+
                nome+";"+cor+";"+material.getMaterial()+";\n";
        return dados;
    }
    
    
    
}
