package com.example.arduinoweb.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Led {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private boolean ligado;

    public Led() {
        this.ligado = false;  // Inicialmente desligado
    }

    public boolean isLigado() {
        return ligado;
    }

    public void ligar() {
        ligado = true;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void desligar() {
        ligado = false;
    }

    public Long getId() {
        return id;
    }
}