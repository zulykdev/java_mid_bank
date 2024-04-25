package com.brixton.bank.util;

import java.util.Map;
import java.util.Optional;

public class BusinessUtils {

    public static <K, V> Optional<V> obtenerValorComoOptional(Map<K, V> map, K clave) {
        // Usar Optional.ofNullable() para envolver el resultado de map.get(clave)
        return Optional.ofNullable(map.get(clave));
    }

}
