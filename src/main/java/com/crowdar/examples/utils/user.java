package com.crowdar.examples.utils;

import static java.lang.Thread.*;

public class user {
    public static String variableEntorno(String key){
        String value = System.getenv(key);
        if(value == null){
            throw new RuntimeException("No se encontro variable de entorno con "+key);
        }
        return  value;
    }

    public static void sleepcaptcha(int segundo){
        try{
            sleep(segundo*1000);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("[ERROR] sleepcaptcha");
        }
    }

    public static void main(String[] args) {
        System.out.println("MELIPASS "+variableEntorno("MELIPASS"));
        System.out.println("MELIPASS "+variableEntorno("MELIPASS"));
    }
}
