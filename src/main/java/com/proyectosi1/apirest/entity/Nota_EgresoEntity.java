package com.proyectosi1.apirest.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table (name = "NOTA_EGRESO")
public class Nota_EgresoEntity {
    @Id
    private Integer id;


    private String descripcion;
    private String fecha;
    private Integer cantidad_total;

}
