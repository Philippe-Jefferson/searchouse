package com.searchhouse.searchhouse.entities;


import org.springframework.data.annotation.Id;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "agent")
public class Agent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long IdAgent;

    @NotNull
    public String nom;

    @NotNull
    public String userName;

    @NotNull
    public String psswd;

    @NotNull
    public String prenom;

    @NotNull
    public String mail;

    @NotNull
    public String telephone;

    @NotNull
    public String societe;


    public Agent() {
        super();
    }

    public Agent(@NotNull String nom, @NotNull String userName, @NotNull String psswd, @NotNull String prenom, @NotNull String mail, @NotNull String telephone, @NotNull String societe) {
        this.nom = nom;
        this.userName = userName;
        this.psswd = psswd;
        this.prenom = prenom;
        this.mail = mail;
        this.telephone = telephone;
        this.societe = societe;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPsswd() {
        return psswd;
    }

    public void setPsswd(String psswd) {
        this.psswd = psswd;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getSociete() {
        return societe;
    }

    public void setSociete(String societe) {
        this.societe = societe;
    }
}
