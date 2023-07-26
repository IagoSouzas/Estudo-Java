package org.example.EstudoSobreJava.FundamentosDoJava;

public class OperadorIncremento {
    public static void main(String[] args) {
       int totalDownloads = 10;

       // tipos de incremento e decremento

       //totalDownloads += 1;
        //totalDownloads -= 1;

       //totalDownloads--;
        //totalDownloads++;

       /*Incrementação pós fixada.

        int novoTotalDownloads = totalDownloads++;*/

        int novoTotalDownloads = ++totalDownloads;

        System.out.println("Total de downloads: " + totalDownloads);
        System.out.println("Novo total de downloads: " + novoTotalDownloads);
    }
}