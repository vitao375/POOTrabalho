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

    List<PecaAuto> lista = new ArrayList<>();

    @Override
    public void incluir(PecaAuto p) {
        try {
            lista.add(p);
        } catch (Exception e) {
            System.out.println(" Erro " + e);
        }

    }

    @Override
    public void excluir(String nome) {
        PecaAuto peca = this.consultaPeca(nome);
        try {
            this.lista.remove(peca);

        } catch (Exception e) {
            System.out.println("Erro " + e);
        }

    }

    @Override
    public void editar(String nome, PecaAuto p) {

        try {
            for (PecaAuto peca : lista) {
                if (peca.getNome() == nome) {
                    int indice = this.lista.indexOf(peca);
                    this.lista.set(indice, p);
                }

            }
        } catch (Exception e) {
            System.out.println("Erro " + e);
        }

    }

    @Override
    public PecaAuto consultaPeca(String nome) {
        try {
            for (PecaAuto pecaAuto : lista) {
                if (pecaAuto.getNome() == nome) {
                    return pecaAuto;
                }

            }
        } catch (Exception e) {
            System.out.println("Erro " + e);
        }
        return null;

    }

    @Override
    public PecaAuto consultarFabricante(String fabricantePeca) {
        try {
            for (PecaAuto pecaAuto : lista) {
                if (pecaAuto.getFabricanteP() == fabricantePeca) {
                    return pecaAuto;
                }

            }
        } catch (Exception e) {
            System.out.println("Erro " + e);
        }
        return null;

    }
    
    public List<PecaAuto> getLista(){
        return lista;
    }
}
