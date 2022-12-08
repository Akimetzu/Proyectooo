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
public class Alumno {
    private int idalumno;
    private String nombre;
    private String apellido;
    private String ciclo;
}
