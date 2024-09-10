package co.edu.uniquindio.unieventos.model.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@AllArgsConstructor
@Getter
@Setter
public class Usuario {

    private String id;
    private String cedula;
    private String nombre;
    private String telefono;
    private String direccion;
}
