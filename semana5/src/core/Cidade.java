/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import java.util.ArrayList;

/**
 *
 * @author afons
 */
public class Cidade extends Paiis {

    private String nome;
    private String presCamara;
    private final boolean CostaMaritima;
    private final ArrayList<String> Rios;

    public Cidade(String nome, String presCamara, boolean CostaMaritima, ArrayList<String> Rios, String lingua, Integer nrPopulacao, String rei, String primeiroMinistro, Integer pib, String Nome, String Continente, Integer areaGeografica) {
        super(lingua, nrPopulacao, rei, primeiroMinistro, pib, Nome, Continente, areaGeografica);
        this.nome = nome;
        this.presCamara = presCamara;
        this.CostaMaritima = CostaMaritima;
        this.Rios = Rios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPresCamara() {
        return presCamara;
    }

    public void setPresCamara(String presCamara) {
        this.presCamara = presCamara;
    }

}
