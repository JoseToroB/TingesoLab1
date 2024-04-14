package com.example.tingeso1.entities;
//R1: Listado donde se muestren (para cada vehículo) todos los valores
//involucrados en el cálculo de la fórmula.
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.swing.*;

@Entity
@Table (name = "reporteA")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class ReporteAEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int id;
    private int idAuto;
    private String patente;
    private JList<ReparacionEntity> reparaciones; //printear fecha y costo de la reparacion
    private int costoTotalReparaciones; //printear suma total de reparaciones
    private int descuentos;
    private int recargos;
}
