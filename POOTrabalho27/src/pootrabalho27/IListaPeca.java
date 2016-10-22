/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pootrabalho27;

/**
 *
 * @author Arcano
 */
public interface IListaPeca {

    /**
     *
     * @param p
     */
    public void incluir(PecaAuto p);

    /**
     *
     * @param nome
     * @param p
     */
    public void editar(String nome, PecaAuto p);

    /**
     *
     * @param nome
     */
    public void excluir(String nome);

    /**
     *
     * @param nome
     * @return
     */
    public PecaAuto consultaPeca(String nome);

    /**
     *
     * @param nome
     * @return
     */
    public PecaAuto consultarFabricante(String nome);

}
