/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cientifica.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author José
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Detalle {
    private int iddetalle;
    private String precio;
    private String fechainicio;
    private String fechafinal;
    private String modalidad;
}
