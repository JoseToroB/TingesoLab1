package com.example.tingeso1.services;

import com.example.tingeso1.entities.AutoEntity;
import com.example.tingeso1.repositories.AutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.*;

@Service
public class AutoService {
    @Autowired
    AutoRepository autoRepository;

    public AutoEntity getAutoByPatente(String patente) {
        return autoRepository.findByPatente(patente);
    }

    public void guardarAuto(AutoEntity auto) {
        autoRepository.save(auto);
    }

    public void eliminarAuto(AutoEntity auto) {
        autoRepository.delete(auto);
    }


}
