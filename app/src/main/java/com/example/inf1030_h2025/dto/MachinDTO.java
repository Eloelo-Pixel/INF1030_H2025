package com.example.inf1030_h2025.dto;

import androidx.databinding.BaseObservable;

import com.example.inf1030_h2025.BR;

public class MachinDTO extends BaseObservable {
    private String nom;
    private String prenom;
    private String adresse;
    private String date;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
        notifyPropertyChanged(BR.nom);
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
        notifyPropertyChanged(BR.prenom);

    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
        notifyPropertyChanged(BR.adresse);

    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
        notifyPropertyChanged(BR.date);

    }
}
