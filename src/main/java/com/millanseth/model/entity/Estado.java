package com.millanseth.model.entity;


import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "estados")
public class Estado implements Serializable {
    @Id
    @Column(name="estado_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEdo;
    @Column(name="estado")
    private String Estado;
}
