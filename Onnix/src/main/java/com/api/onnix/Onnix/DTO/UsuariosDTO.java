package com.api.onnix.Onnix.DTO;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Date;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UsuariosDTO {

    private Long id;
    private String nombre;
    private String email;
    private String clave;
    private String estado;
    private RolesDTO roles;

}
