package org.example;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {

    public static String valorFinalEmp(Integer valor, Integer parcelas){
        if(parcelas >= 1 && parcelas <= 3){
            double taxa = 0.9;
            double valorFinal = valor / taxa;
            double parcelasTotal = valorFinal / parcelas;
            return "O valor final do emprestimo será de : " + String.format("%.2f", valorFinal) + " em " + parcelas + " parcelas de " + String.format("%.2f", parcelasTotal);
        } else if(parcelas > 3 && parcelas <= 6){
            double taxa = 0.7;
            double valorFinal = valor / taxa;
            double parcelasTotal = valorFinal / parcelas;
            return "O valor final do emprestimo será de : " + String.format("%.2f", valorFinal) + " em " + parcelas + " parcelas de " + String.format("%.2f", parcelasTotal);
        } else if (parcelas > 6 && parcelas <=12) {
            double taxa = 0.3;
            double valorFinal = valor / taxa;
            double parcelasTotal = valorFinal / parcelas;
            return "O valor final do emprestimo será de : " + String.format("%.2f", valorFinal) + " em " + parcelas + " parcelas de " + String.format("%.2f", parcelasTotal);
        }
        return "Insira um numero de parcelas entre 1 e 12 parcelas";
    }

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
        System.out.println(valorFinalEmp(900,2));
        System.out.println(valorFinalEmp(900,6));
        System.out.println(valorFinalEmp(900,12));
        System.out.println(valorFinalEmp(900,-1));
    }
}