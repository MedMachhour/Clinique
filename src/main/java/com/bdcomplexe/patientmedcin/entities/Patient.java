package com.bdcomplexe.patientmedcin.entities;

import com.couchbase.client.java.repository.annotation.Field;
import org.springframework.data.couchbase.core.mapping.Document;

import javax.xml.bind.annotation.XmlRootElement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Document
public class Patient {
    @Field
    private String nom ;
    @Field
    private String prenom ;
    @Field
    private LocalDate datenaissance ;
    @Field
    public List<Maladie> maladies ;


    public Patient(String nom, String prenom, LocalDate datenaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.datenaissance = datenaissance;
    }



    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public LocalDate getDatenaissance() {
        return datenaissance;
    }

    public void setDatenaissance(LocalDate datenaissance) {
        this.datenaissance = datenaissance;
    }

    public List<Maladie> getMaladies() {
        return maladies;
    }

    public void setMaladies(List<Maladie> maladies) {
        this.maladies = maladies;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("'\n'").append("nom='").append(nom).append(",'\n'");
        sb.append("prenom='").append(prenom).append(",'\n'");
        sb.append("datenaissance=").append(datenaissance).append(",'\n'");
        sb.append("medcins=").append(maladies).append("'\n'");
        sb.append('}');
        return sb.toString();
    }
}
