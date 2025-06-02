package com.example.arduinoweb.controller;

import com.example.arduinoweb.connection.ControlePorta;
import com.example.arduinoweb.model.Led;
import com.example.arduinoweb.repository.LedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/led")
public class LedController {

    private ControlePorta controle = new ControlePorta("COM4", 9600); // Altere COM3 se necessário

    @GetMapping("/ligar")
    public String ligarLed() {
        controle.enviaDados('1');  // Liga o LED na porta serial

        Led led = new Led();
        led.setLigado(true);
        ledRepository.save(led);

        return "LED ligado e estado salvo no banco!";
    }


    @GetMapping("/desligar")
    public String desligarLed() {
        controle.enviaDados('2');  // Desliga o LED na porta serial

        Led led = new Led();
        led.setLigado(false);
        ledRepository.save(led);

        return "LED desligado e estado salvo no banco!";
    }

    @GetMapping("/fechar")
    public String fechar() {
        controle.close();
        return "Porta serial fechada!";
    }

    @Autowired
    private LedRepository ledRepository;

}