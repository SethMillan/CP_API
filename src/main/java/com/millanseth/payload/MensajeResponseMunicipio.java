package com.millanseth.payload;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
@Data
@ToString
@Builder

public class MensajeResponseMunicipio implements Serializable {
    private Boolean error;
    private String mensaje;
    private Object municipio;
}
