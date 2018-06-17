/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progettoingegneriasw;
/**
 *
 * @author ionbaltaga
 */
public class Articolo {
    private String nome, descrizione, sport, materiale;

    public Articolo (String nome, String descrizione, String sport, String materiale){
        this.nome=nome;
        this.descrizione=descrizione;
        this.sport=sport;
        this.materiale=materiale;
    }

    public String getNome() {
        return nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public String getSport() {
        return sport;
    }

    public String getMateriale() {
        return materiale;
    }
    
    public void setNome(String nome) {
        this.nome=nome;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione=descrizione;
    }
    
    public void setSport(String sport) {
        this.sport=sport;
    }
    
    public void setMateriale(String materiale) {
        this.materiale=materiale;
    }

    
    @Override
    public String toString() {
        return "Articolo{" + "nome=" + nome + ", descrizione=" + descrizione + ", sport=" + sport + ", materiale=" + materiale + '}';
    }
    
}
