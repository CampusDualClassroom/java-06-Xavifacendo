package com.campusdual.classroom;

import java.sql.SQLOutput;
import java.util.Calendar;

public class Exercise06 {

    public static void main(String[] args) {
        // Creamos una instancia del calendario
        Calendar now = Calendar.getInstance();
        int month = now.get(Calendar.MONTH) + 1;
        int hour = now.get(Calendar.HOUR_OF_DAY);
        checkHour(21);
        checkSeason(6);

    }


    // Si la hora es desde las 0:00 a las 6:59, imprimir por pantalla → It's night
    // Si la hora es desde las 7:00 a las 13:59, imprimir por pantalla → It's morning
    // Si la hora es desde las 14:00 a las 20:59, imprimir por pantalla → It's afternoon
    // Si la hora es desde las 21:00 a las 23:59, imprimir por pantalla → It's night
    public static void checkHour(int hour) {
        {
            switch (hour) {
                case 21:
                    System.out.println("It's night");
                    break;
                case 22:
                    System.out.println("It's night");
                    break;
                case 23:
                    System.out.println("It's night");
                    break;
                case 0:
                    System.out.println("It's night");
                    break;
                case 1:
                    System.out.println("It's night");
                    break;
                case 2:
                    System.out.println("It's night");
                    break;
                case 3:
                    System.out.println("It's night");
                    break;
                case 4:
                    System.out.println("It's night");
                    break;
                case 5:
                    System.out.println("It's night");
                    break;
                case 6:
                    System.out.println("It's night");
                    break;
                case 7:
                    System.out.println("It's morning");
                    break;
                case 8:
                    System.out.println("It's morning");
                    break;
                case 9:
                    System.out.println("It's morning");
                    break;
                case 10:
                    System.out.println("It's morning");
                    break;
                case 11:
                    System.out.println("It's morning");
                    break;
                case 12:
                    System.out.println("It's morning");
                    break;
                case 13:
                    System.out.println("It's morning");
                    break;
                case 14:
                    System.out.println("It's afternoon");
                    break;
                case 15:
                    System.out.println("It's afternoon");
                    break;
                case 16:
                    System.out.println("It's afternoon");
                    break;
                case 17:
                    System.out.println("It's afternoon");
                    break;
                case 18:
                    System.out.println("It's afternoon");
                    break;
                case 19:
                    System.out.println("It's afternoon");
                    break;
                case 20:
                    System.out.println("It's afternoon");
                    break;
                default:
                    throw new IllegalArgumentException("Unexpected value: " + hour);
            }
        }
    }


    // Si es Enero, Febrero o Marzo, imprimir por pantalla → Winter
    // Si es Abril, Mayo o Junio, imprimir por pantalla → Spring
    // Si es Julio, Agosto o Septiembre, imprimir por pantalla → Summer
    // Si es Octubre, Noviembre o Diciembre, imprimir por pantalla → Autumn
    public static void checkSeason(int month) {
        switch (month) {
            case 1:
                System.out.println("Winter");
                break;
            case 2:
                System.out.println("Winter");
                break;
            case 3:
                System.out.println("Winter");
                break;
            case 4:
                System.out.println("Spring");
                break;
            case 5:
                System.out.println("Spring");
                break;
            case 6:
                System.out.println("Spring");
                break;
            case 7:
                System.out.println("Summer");
                break;
            case 8:
                System.out.println("Summer");
                break;
            case 9:
                System.out.println("Summer");
                break;
            case 10:
                System.out.println("Autumn");
                break;
            case 11:
                System.out.println("Autumn");
                break;
            case 12:
                System.out.println("Autumn");
                break;
            default:
                throw new IllegalArgumentException("Unexpected value: " + month);
        }
    }

}
