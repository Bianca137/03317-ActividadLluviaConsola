/* 
 * Copyright 2019 Bianca Antonela Glavan - biancaantonela.glavan.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Bianca Antonela Glavan - biancaantonela.glavan.alum@iescamp.es
 */
public class Main {

    public static final Random RND = new Random();
public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");
    public static void main(String[] args) {

        int dias = 7;
        final int LLUVIA_MIN = 0;
        final int LLUVIA_MAX = 500;
        int lluvia = 0;
        double lluviaAcumuladaSemana = 0.0;
        String diaSemana = "";
        int cantidadMax = 0;
        int cantidadMin = 500;

        int diaMax = 0;
        int diaMin = 0;

//dia de mas lluvia
//dia de menos lluvia
        for (int i = 0; i < dias; i++) {

            lluvia = RND.nextInt(LLUVIA_MAX - LLUVIA_MIN + 1) + LLUVIA_MIN;

            switch (i + 1) {

                case 1:
                    diaSemana = "Lunes";
                    break;

                case 2:
                    diaSemana = "Martes";
                    break;
                case 3:
                    diaSemana = "miercoles";
                    break;

                case 4:
                    diaSemana = "Jueves";
                    break;
                case 5:
                    diaSemana = "Viernes";
                    break;

                case 6:
                    diaSemana = "Sabado";
                    break;
                case 7:
                    diaSemana = "Domingo";
                    break;

            }

            System.out.printf(" %s lluvia ...: %d%n ", diaSemana, lluvia);

            if (lluvia > cantidadMax) {
                cantidadMax = lluvia;

                diaMax = i;
                // System.out.println("Lluvia max: " + cantidadMax);
                // System.out.println("Dia lluvia max: " + cantidadMax );
            }

            if (lluvia < cantidadMin) {
                cantidadMin = lluvia;
                diaMin = i;
            }
            lluviaAcumuladaSemana += lluvia;
        }

        switch (diaMin + 1) {
            case 1:
                diaSemana = "lunes";
                break;
            case 2:
                diaSemana = "martes";
                break;
            case 3:
                diaSemana = "miércoles";
                break;
            case 4:
                diaSemana = "jueves";
                break;
            case 5:
                diaSemana = "viernes";
                break;
            case 6:
                diaSemana = "sábado";
                break;
            case 7:
                diaSemana = "domingo";
        }

        System.out.printf("Menor lluvia ....: %3d l/m2 - %s%n", cantidadMin, diaSemana);

        switch (diaMax + 1) {
            case 1:
                diaSemana = "lunes";
                break;
            case 2:
                diaSemana = "martes";
                break;
            case 3:
                diaSemana = "miércoles";
                break;
            case 4:
                diaSemana = "jueves";
                break;
            case 5:
                diaSemana = "viernes";
                break;
            case 6:
                diaSemana = "sábado";
                break;
            case 7:
                diaSemana = "domingo";
        }

        System.out.printf("Mayor lluvia ....: %3d l/m2 - %s%n", cantidadMax, diaSemana);

    //Total   
        System.out.println("Lluvia total " + lluviaAcumuladaSemana);
 //Media
        System.out.printf(Locale.ENGLISH, "Promedio semana .: %.2f l/m2%n", lluviaAcumuladaSemana / dias);

    }

}
