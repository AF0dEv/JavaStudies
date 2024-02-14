/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import Exceptions.NomeInvalidoException;
import Exceptions.ValorNumericoInvalidoException;
import java.util.Objects;

/**
 *
 * @author afons
 */
public class Paiis {

    private String lingua;
    private Integer nrPopulacao;
    private String rei;
    private String primeiroMinistro;
    private Integer pib;
    private final String Nome;
    private final String Continente;

    public Paiis(String Nome, String Continente) {
        this.Nome = Nome;
        this.Continente = Continente;
    }

    public String getLingua() {
        return lingua;
    }

    public void setLingua(String lingua) {
        this.lingua = lingua;
    }

    public Integer getNrPopulacao() {
        return nrPopulacao;
    }

    public void setNrPopulacao(Integer nrPopulacao) throws ValorNumericoInvalidoException {
        if (nrPopulacao <= 0) {
            throw new ValorNumericoInvalidoException("O número nao pode ser inferior a 0");
        }
        this.nrPopulacao = nrPopulacao;
    }

    public String getRei() {
        return rei;
    }

    public void setRei(String rei) {
        this.rei = rei;
    }

    public String getPrimeiroMinistro() {
        return primeiroMinistro;
    }

    public void setPrimeiroMinistro(String primeiroMinistro) throws NomeInvalidoException {
        if (primeiroMinistro == "") {
            throw new NomeInvalidoException("O nome não pode estar vazio");
        }

        this.primeiroMinistro = primeiroMinistro;
    }

    public Integer getPib() {
        return pib;
    }

    public void setPib(Integer pib) throws ValorNumericoInvalidoException {
        if (pib <= 0) {
            throw new ValorNumericoInvalidoException("O número nao pode ser inferior a 0");
        }
        this.pib = pib;

    }

    public Integer getRendimento(Integer pib, Integer nrPopulacao) {
        return pib / nrPopulacao;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.lingua);
        hash = 59 * hash + Objects.hashCode(this.nrPopulacao);
        hash = 59 * hash + Objects.hashCode(this.rei);
        hash = 59 * hash + Objects.hashCode(this.primeiroMinistro);
        hash = 59 * hash + Objects.hashCode(this.pib);
        hash = 59 * hash + Objects.hashCode(this.Nome);
        hash = 59 * hash + Objects.hashCode(this.Continente);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Paiis other = (Paiis) obj;
        if (!Objects.equals(this.lingua, other.lingua)) {
            return false;
        }
        if (!Objects.equals(this.rei, other.rei)) {
            return false;
        }
        if (!Objects.equals(this.primeiroMinistro, other.primeiroMinistro)) {
            return false;
        }
        if (!Objects.equals(this.Nome, other.Nome)) {
            return false;
        }
        if (!Objects.equals(this.Continente, other.Continente)) {
            return false;
        }
        if (!Objects.equals(this.nrPopulacao, other.nrPopulacao)) {
            return false;
        }
        return Objects.equals(this.pib, other.pib);
    }

    @Override
    public String toString() {
        return "Paiis{" + "lingua=" + lingua + ", nrPopulacao=" + nrPopulacao + ", rei=" + rei + ", primeiroMinistro=" + primeiroMinistro + ", pib=" + pib + ", Nome=" + Nome + ", Continente=" + Continente + '}';
    }

}
