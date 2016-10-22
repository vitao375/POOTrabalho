/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pootrabalho27;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Arcano
 */
public class ListaPeca implements IListaPeca {

    List<PecaAuto> lista =  new ArrayList<>();
    
    
    @Override
    public void incluir(PecaAuto p) {
    lista.add(p);
   
        
    }

    @Override
    public void editar(PecaAuto p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluir(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PecaAuto consulta(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PecaAuto consultarValor(Double valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
