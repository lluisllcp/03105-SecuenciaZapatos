/* 
 * Copyright 2019 Lluís CP - aw.lluiscerda@gmail.com.
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

/**
 *
 * @author Lluís CP - aw.lluiscerda@gmail.com
 */
public class Main {
    public static void main(String[] args) {
        
 //constantes
        final String ANIMAL_1 = "Vaca";
        final String ANIMAL_2 = "Oveja";
        final String ANIMAL_3 = "Burro";
        final String ANIMAL_4 = "Gallina";
        final int NUMANIMALES_1 = 3;
        final int NUMANIMALES_2 = 14;
        final int NUMANIMALES_3 = 2;
        final int NUMANIMALES_4 = 18;

        //constantes & operaciones
        final int NUMPATAS_1 = NUMANIMALES_1 * 4;
        final int NUMPATAS_2 = NUMANIMALES_2 * 4;
        final int NUMPATAS_3 = NUMANIMALES_3 * 4;
        final int NUMPATAS_4 = NUMANIMALES_4 * 2;

        //variables & operaciones
        int totalpatas = NUMPATAS_1 + NUMPATAS_2 + NUMPATAS_3 + NUMPATAS_4;
        int totalpares = totalpatas / 2;

        System.out.println("Secuencia de patas");
        System.out.println("==================");
        System.out.printf("Animal......: %s%n", ANIMAL_1);
        System.out.printf("Cantidad....: %d%n", NUMANIMALES_1);
        System.out.printf("Patas.......: %d%n", NUMPATAS_1);

        System.out.println("---");

        System.out.printf("Animal......: %s%n", ANIMAL_2);
        System.out.printf("Cantidad....: %d%n", NUMANIMALES_2);
        System.out.printf("Patas.......: %d%n", NUMPATAS_2);

        System.out.println("---");

        System.out.printf("Animal......: %s%n", ANIMAL_3);
        System.out.printf("Cantidad....: %d%n", NUMANIMALES_3);
        System.out.printf("Patas.......: %d%n", NUMPATAS_3);

        System.out.println("---");

        System.out.printf("Animal......: %s%n", ANIMAL_4);
        System.out.printf("Cantidad....: %d%n", NUMANIMALES_4);
        System.out.printf("Patas.......: %d%n", NUMPATAS_4);

        System.out.println("---");

        System.out.printf("Total de patas...: %d%n", totalpatas);
        System.out.printf("Total de pares...: %d%n", totalpares);

    }

}