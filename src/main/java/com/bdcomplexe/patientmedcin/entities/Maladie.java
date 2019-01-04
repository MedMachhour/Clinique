package com.bdcomplexe.patientmedcin.entities;

import com.couchbase.client.java.repository.annotation.Field;
import org.springframework.data.couchbase.core.mapping.Document;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Arrays;
import java.util.List;

@Document
public class Maladie {
    @Field
    private long nom;
    @Field
    private List<String> symptomes;
    @Field
    private List<Medcin> medcins ;

    public Maladie(long nom, List<String> symptomes) {
        this.nom = nom;
        this.symptomes = symptomes;
    }



    public long getNom() {
        return nom;
    }

    public void setNom(long nom) {
        this.nom = nom;
    }

    public List<String> getSymptomes() {
        return symptomes;
    }

    public void setSymptomes(List<String> symptomes) {
        this.symptomes = symptomes;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("'\n'").append("nom=").append(nom).append(",'\n'");
        sb.append("symptomes=").append(symptomes.toString()).append("'\n'");
        sb.append('}');
        return sb.toString();
    }
}
