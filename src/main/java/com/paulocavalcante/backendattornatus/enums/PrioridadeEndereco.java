package com.paulocavalcante.backendattornatus.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum PrioridadeEndereco {
    PRINCIPAL("0"),
    OUTROS("1");

    private String prioridadeEndereco;


}
