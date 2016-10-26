/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista;

import ClassesPeca.PecaAuto;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Arcano
 */
public class ListaPeca implements IListaPeca {

    static List<PecaAuto> lista = new ArrayList<>();

    /**
     * Método no qual inclui um novo cadastro de peça na lista PecaAuto.
     * @param p objeto do tipo PecaAuto
     */
    @Override
    public void incluir(PecaAuto p) {
        try {
            lista.add(p);
        } catch (Exception e) {
            System.out.println(" Erro " + e);
        }

    }
    
    /**
     * Método que irá percorrer a lista PecaAuto e excluirá o objeto cadastrado
     * que for desejado pelo usuário.
     * @param nome 
     */
    @Override
    public void excluir(String nome) {
        PecaAuto peca = this.consultaPeca(nome);
        try {
            this.lista.remove(peca);

        } catch (Exception e) {
            System.out.println("Erro " + e);
        }

    }

    /**
     * Método no qual faz a edição de um objeto contido na lista PecaAuto, fazendo
     * alterações nos campos desejados pelo usuário.
     * @param nome
     * @param p 
     */
    @Override
    public void editar(String nome, PecaAuto p) {

        try {
            for (PecaAuto peca : lista) {
                if (peca.getNome().equalsIgnoreCase(nome)) {
                    int indice = this.lista.indexOf(peca);
                    this.lista.set(indice, p);
                }

            }
        } catch (Exception e) {
            System.out.println("Erro " + e);
        }

    }

    /**
     * Método no qual irá fazer a consulta por Peça, percorrendo a lista PecaAuto
     * @param nome
     * @return a lista pecaAuto caso conter determinados elementos OU retorna null
     * caso não existir elementos contidos na mesma.
     */
    @Override
    public PecaAuto consultaPeca(String nome) {
        try {
            for (PecaAuto pecaAuto : lista) {
                if (pecaAuto.getNome().equalsIgnoreCase(nome)) {
                    return pecaAuto;
                }

            }
        } catch (Exception e) {
            System.out.println("Erro " + e);
        }
        return null;

    }

    /**
     * Método no qual irá fazer a consulta pelo Fabricante, percorrendo a lista PecaAuto
     * @param fabricantePeca
     * @return Os objetos contidos nessa lista OU null caso não conter elementos
     * contidos nela.
     */
    @Override
    public PecaAuto consultarFabricante(String fabricantePeca) {
        try {
            for (PecaAuto pecaAuto : lista) {
                if (pecaAuto.getFabricantePeca().equalsIgnoreCase(fabricantePeca)) {
                    return pecaAuto;
                }

            }
        } catch (Exception e) {
            System.out.println("Erro " + e);
        }
        return null;

    }
    
    /**
     * Método no qual retorna a lista PecaAuto
     * @return lista PecaAuto
     */
    public List<PecaAuto> getLista(){
        return lista;
    }
}
