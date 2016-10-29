/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista;

import ClassesPeca.Acessorio;
import ClassesPeca.Eletrica;
import ClassesPeca.Mecanica;
import ClassesPeca.PecaAuto;
import Enum.Material;
import Enum.Sistemas;
import Enum.Tipo;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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
     *
     * @param p objeto do tipo PecaAuto
     */
    @Override
    public void incluir(PecaAuto p) {

        if (lista.add(p)) {

        } else {
            throw new IllegalArgumentException("Não foi possivél salvar.");
        }
    }

    /**
     * Método que irá percorrer a lista PecaAuto e excluirá o objeto cadastrado
     * que for desejado pelo usuário.
     *
     * @param nome
     */
    @Override
    public void excluir(String nome) {
        PecaAuto peca = this.consultaPeca(nome);

        if (this.lista.remove(peca) || peca != null) {
        } else {
            throw new IllegalArgumentException("Não foi possivél Excluir.");
        }

    }

    /**
     * Método no qual faz a edição de um objeto contido na lista PecaAuto,
     * fazendo alterações nos campos desejados pelo usuário.
     *
     * @param nome
     * @param p
     */
    @Override
    public void editar(String nome, PecaAuto p) {

        for (PecaAuto peca : lista) {
            if (peca.getNome().equalsIgnoreCase(nome)) {
                int indice = this.lista.indexOf(peca);
                this.lista.set(indice, p);
            } else {
                throw new IllegalArgumentException("Não foi possivél editar");
            }
        }

    }

    /**
     * Método no qual irá fazer a consulta por Peça, percorrendo a lista
     * PecaAuto
     *
     * @param nome
     * @return a lista pecaAuto caso conter determinados elementos OU retorna
     * null caso não existir elementos contidos na mesma.
     */
    @Override
    public PecaAuto consultaPeca(String nome) {

        for (PecaAuto pecaAuto : lista) {
            if (pecaAuto.getNome().equalsIgnoreCase(nome)) {
                return pecaAuto;
            }

        }
        return null;

    }

    /**
     * Método no qual irá fazer a consulta pelo Fabricante, percorrendo a lista
     * PecaAuto
     *
     * @param fabricantePeca
     * @return Os objetos contidos nessa lista OU null caso não conter elementos
     * contidos nela.
     */
    @Override
    public PecaAuto consultarFabricante(String fabricantePeca) {

        for (PecaAuto pecaAuto : lista) {
            if (pecaAuto.getFabricantePeca().equalsIgnoreCase(fabricantePeca)) {
                return pecaAuto;
            }

        }

        return null;

    }

    @Override
    public PecaAuto consultarNomeA(String a) {

        for (PecaAuto pecaAuto : lista) {
            if (pecaAuto instanceof Acessorio) {
                if (pecaAuto.getNome().equalsIgnoreCase(a)) {
                    return pecaAuto;
                }
            }
        }

        return null;

    }

    @Override
    public PecaAuto consultarFabricanteA(String a) {

        for (PecaAuto pecaAuto : lista) {
            if (pecaAuto instanceof Acessorio) {
                if (pecaAuto.getFabricantePeca().equalsIgnoreCase(a)) {
                    return pecaAuto;
                }
            }
        }

        return null;

    }

    public void escreverArquivo() throws IOException{
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(System.getProperty("user.dir")
                    + System.getProperty("file.separator") + "Peca" + ".csv"));

            for (PecaAuto pecaAuto : lista) {
                bw.write(pecaAuto.writeFile());
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            throw new IOException();
        }
    }

    public void lerArquivo() throws IOException {
        String linha = "";
        int cont = 0;
        BufferedReader br = new BufferedReader(new FileReader(System.getProperty("user.dir")
                + System.getProperty("file.separator") + "Peca" + ".csv"));
        lista.clear();
        while (br.ready()) {
            linha = br.readLine();
            ler(linha);
        }
        br.close();
    }

    /**
     * Método no qual retorna a lista PecaAuto
     *
     * @return lista PecaAuto
     */
    public List<PecaAuto> getLista() {
        return lista;
    }

    private void ler(String linha) {
        String[] dados = null;
        dados = linha.split(";");
        
        switch (dados[0]) {
            case "Acessorio":
                String fabricante = dados[1];
                String modeloCarro = dados[2];
                Double valor = Double.valueOf(dados[3]);
                int quantidade = Integer.parseInt(dados[4]);
                String nome = dados[5];
                String cor = dados[6];
                int material = Integer.parseInt(dados[7]);

                Acessorio acessorio = new Acessorio(fabricante, modeloCarro, valor,
                        quantidade, nome, cor, Material.verifica(material));
                lista.add(acessorio);

                break;
            case "Eletrica":
                String fabricant = dados[1];
                String modeloCarro1 = dados[2];
                Double valor1 = Double.valueOf(dados[3]);
                int quantidade1 = Integer.parseInt(dados[4]);
                String nome1 = dados[5];
                Double amperagem = Double.valueOf(dados[6]);
                Double voltagem = Double.valueOf(dados[7]);
                int sistema = Integer.parseInt(dados[8]);

                Eletrica eletrica = new Eletrica(fabricant, modeloCarro1, valor1,
                        quantidade1, nome1, amperagem, voltagem, Sistemas.verifica(sistema));
                lista.add(eletrica);

                break;
            case "Mecanica":
                String fabricante2 = dados[1];
                String modeloCarro2 = dados[2];
                Double valor2 = Double.valueOf(dados[3]);
                int quantidade2 = Integer.parseInt(dados[4]);
                String nome2 = dados[5];
                int tipo = Integer.parseInt(dados[6]);

                Mecanica mecanica = new Mecanica(fabricante2, modeloCarro2, valor2, quantidade2, nome2, Tipo.verifica(tipo));
                break;

        }
    }
}
