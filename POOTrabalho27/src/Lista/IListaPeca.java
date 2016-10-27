/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista;

import ClassesPeca.PecaAuto;

/**
 *
 * @author Arcano
 */
public interface IListaPeca {

    /**
     * Método no qual inclui um novo cadastro de peça na lista PecaAuto.
     * @param p
     */
    public void incluir(PecaAuto p);

    /**
     *Método no qual faz a edição de um objeto contido na lista PecaAuto, fazendo
     * alterações nos campos desejados pelo usuário.
     * @param nome
     * @param p
     */
    public void editar(String nome, PecaAuto p);

    /**
     *Método que irá percorrer a lista PecaAuto e excluirá o objeto cadastrado
     * que for desejado pelu usuário
     * @param nome
     */
    public void excluir(String nome);

    /**
     *Método no qual irá fazer a consulta por Peça, percorrendo a lista PecaAuto
     * @param nome
     * @return a lista pecaAuto caso conter determinados elementos OU retorna null
     * caso não existir elementos contidos na mesma.
     */
    public PecaAuto consultaPeca(String nome);

    /**
     *Método no qual irá fazer a consulta pelo Fabricante, percorrendo a lista PecaAuto
     * @param nome
     * @return Os objetos contidos nessa lista OU null caso não conter elementos
     * contidos nela.
     */
    public PecaAuto consultarFabricante(String nome);
    
    
    
    public PecaAuto consultarNomeA(String nome);
    
    
    public PecaAuto consultarFabricanteA(String nome);

}
