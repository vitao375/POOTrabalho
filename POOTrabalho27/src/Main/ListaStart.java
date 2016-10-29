/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Frames.FrameView;
import Lista.ListaPeca;

/**
 *
 * @author vitao375 Classe com objetivo de iniciar um atributo que será
 * compartilhado por todas as frames atributo ListaPeca lista;
 */
public class ListaStart {

    /**
     *
     */
    

    public static void iniciar() {
        new FrameView(new ListaPeca()).setVisible(true);
    }
}
