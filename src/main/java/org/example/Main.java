package org.example;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {

    public static String horaDoDia(){
        LocalTime horaAtual = LocalTime.now(ZoneId.of("America/Sao_Paulo"));
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("HH:mm:ss");
        int now = Integer.parseInt(fmt.format(horaAtual).replace(":", ""));
        if(now < 120000 && now >= 000000){
            return fmt.format(horaAtual) + " Bom Dia!";
        }else if (now >= 120000 && now < 180000){
            return fmt.format(horaAtual) + " Boa Tarde!";
        }

        return fmt.format(horaAtual) + " Boa noite!";
    }
    public static String operacoes(int a, int b){
        int soma = a + b;
        int sub = a - b;
        int mult = a * b;
        int div = a / b;
        return "Soma: " + soma + "\nSubtração: " + sub + "\nMultiplicação: " + mult + "\nDivisão: " + div;

    }
    public static void main(String[] args) {


        System.out.println(operacoes(4,5));
        System.out.println(horaDoDia());
    }
}