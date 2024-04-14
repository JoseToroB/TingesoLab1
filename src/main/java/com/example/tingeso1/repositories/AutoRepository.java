<<<<<<< HEAD
package com.example.tingeso1.repositories;

import com.example.tingeso1.entities.AutoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.*;

public interface AutoRepository extends JpaRepository<AutoEntity, Integer> {
    public AutoEntity findByPatente(String patente);
    public JList<AutoEntity> findAllByTipo(String tipo);
    public JList<AutoEntity> findAllByCombustible(String combustible);

}
=======
package com.example.tingeso1.repositories;

import com.example.tingeso1.entities.AutoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.*;

public interface AutoRepository extends JpaRepository<AutoEntity, Integer> {
    public AutoEntity findByPatente(String patente);
    public JList<AutoEntity> findAllByTipo(String tipo);
    public JList<AutoEntity> findAllByCombustible(String combustible);

}
>>>>>>> 158784ed1feeb531370c51ba19473f9a82c85a7b
