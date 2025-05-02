package com.augustojbe.lojaVirtual.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public enum TipoEndereco {

    COMBRANCA("Cobrança"),
    ENTREGA("Entrega");

    private String descricao;

}
