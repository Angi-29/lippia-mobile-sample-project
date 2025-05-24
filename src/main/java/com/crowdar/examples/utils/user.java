package com.crowdar.examples.utils;

public class user {
    public static String variableEntorno(String key){
        String value = System.getenv(key);
        if(value == null){
            throw new RuntimeException("No se encontro variable de entorno con "+key);
        }
        return  value;
    }

    public static void main(String[] args) {
        System.out.println("MELIPASS "+variableEntorno("hola"));
        System.out.println("MELIPASS "+variableEntorno("hola"));
    }
}
