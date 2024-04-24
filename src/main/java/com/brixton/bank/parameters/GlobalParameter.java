package com.brixton.bank.parameters;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class GlobalParameter {

    private Object value;
    private String key;

    public GlobalParameter(String key, Object value) {
        this.value = value;
        this.key = key;
    }
}
