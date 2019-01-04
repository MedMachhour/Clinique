package com.bdcomplexe.patientmedcin.entities;


import org.springframework.data.couchbase.core.mapping.Document;

import javax.xml.bind.annotation.XmlRootElement;

@Document
public class Medcin {
    private String _id ;
    private String _rev = null;
    private String nom;
    private String prenom;
    private String specialite;

    public Medcin(String nom, String prenom, String specialite) {
        this.nom = nom;
        this.prenom = prenom;
        this.specialite = specialite;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String get_rev() {
        return _rev;
    }

    public void set_rev(String _rev) {
        this._rev = _rev;
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

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("'\n'").append("_id='").append(_id).append(",'\n'");
        sb.append("_rev='").append(_rev).append(",'\n'");
        sb.append("nom='").append(nom).append(",'\n'");
        sb.append("prenom='").append(prenom).append(",'\n'");
        sb.append("specialite='").append(specialite).append("'\n'");
        sb.append('}');
        return sb.toString();
    }
}
