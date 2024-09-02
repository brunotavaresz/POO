package aula05;

import java.time.OffsetDateTime;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        if(valid(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano  = ano;
        } else {
            System.out.println("Insira uma data válida!");
        }
    }

    public int getDia(int dia) {
        return dia;
    }
    public int getMes(int mes) {
        return mes;
    }
    public int getAno(int ano) {
        return ano;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    public void set(int dia, int mes, int ano){
        if(valid(dia,mes,ano)){
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }
        else{
            System.out.println("Insira uma data válida!");
        }
    }

    public String toString() {
        return String.format("%04d"+"-"+"%02d"+"-"+"%02d", ano, mes, dia);
    }

    public void increment() {
        dia += 1;
        if(!validDay(dia, mes, ano)) {
            mes += 1;
            dia = 1;
        }
        if(!validMonth(mes)) {
            ano += 1;
            mes = 1;
        }
    }

    public void decrement() {
        dia -= 1;
        if(!validDay(dia, mes, ano)) {
            mes -= 1;
            dia = diasmes(mes, ano);
        }
        if(!validMonth(mes)) {
            ano -= 1;
            mes = 12;
        }
    }

    public boolean validDay(int dia, int mes, int ano) {
        if(dia > 0 && dia <= diasmes(mes, ano)) {
            return true;
        } else {
            return false;
        }
    }
    
    public static boolean validMonth(int mes) {
        if(mes >= 1 && mes <= 12) {
            return true;
        } else {
            return false;
        }
    }

    public static int diasmes(int mes, int ano) {
        switch (mes) {
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if (leapYear(ano)) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return 31;
        }
    }

    public static boolean leapYear(int ano) {
        if ((ano%4==0 && ano%100!=0) || ano%400==0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean valid(int dia, int mes, int ano) {
        if (validMonth(mes) && validDay(dia, mes, ano) && ano >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public static Data today() {
		OffsetDateTime dt = OffsetDateTime.now();
		int d = dt.getDayOfMonth();
		int m = dt.getMonthValue();
		int a = dt.getYear();
		
		return new Data(d, m, a);
	}
}
