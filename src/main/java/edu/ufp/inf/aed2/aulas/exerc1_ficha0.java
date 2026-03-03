package edu.ufp.inf.aed2.aulas;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Out;
import edu.princeton.cs.algs4.Quick;
import edu.princeton.cs.algs4.StdRandom;
import static java.lang.System.out;

public class exerc1_ficha0 {

    public static void main(String[] args) {
        //ex1_1();
        //ex1_2();
        //ex1_3();
        //uniforme(10);
        //gaussiana(10);
        //bernoulli(10);
        //ex1_5();
        ex1_6();
    }

    public static void ex1_1() {
        In file = new In(".//data//8ints.txt");

        int n = file.readInt();
        int[] lista = new int[n];

        for (int i = 0; i < n; i++) {
            lista[i] = file.readInt();
        }

        out.println("Tamanho da lista: " + n);
        out.println("Inteiros no ficheiro:");

        for (int i = 0; i < n; i++) {
            out.print(lista[i] + " ");
        }

        out.println();
        file.close();
    }

    public static void ex1_2() {

        In file = new In(".//data//30ints.txt");
        int contar = 0;

        while (!file.isEmpty()) {
            int num = file.readInt();
            out.print(num + " ");
            contar++;
        }

        out.println();
        out.println("Tamanho da lista: " + contar);

        file.close();
    }

    public static void ex1_3() {

        In file_in = new In(".//data//8ints.txt");
        Out file_out = new Out(".//data//8ints_out.txt");

        int n = file_in.readInt();
        file_out.println(n);

        int k = 100;

        for (int i = 0; i < n; i++) {
            int num = file_in.readInt();
            file_out.println(num + k);
        }

        file_in.close();
        file_out.close();
    }

    public static void uniforme(int N) {

        int[] a = new int[N];

        for (int i = 0; i < N; i++) {
            a[i] = StdRandom.uniform(100);
        }

        System.out.println("Números uniformemente distribuídos entre 0 e 99:");

        for (int i = 0; i < N; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();
    }

    public static void gaussiana(int N) {

        int[] a = new int[N];

        for (int i = 0; i < N; i++) {
            a[i] = (int) StdRandom.gaussian();
        }

        System.out.println("Números gaussianamente distribuídos com média 0 e desvio padrão 1:");

        for (int i = 0; i < N; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();
    }

    public static void bernoulli(int N){

        boolean[] a = new boolean[N];

        for (int i = 0; i < N; i++) {
            a[i] = StdRandom.bernoulli(0.5);
        }

        System.out.println("Números booleanos distribuídos com probabilidade 0.5:");

        for (int i = 0; i < N; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();
    }

    public static void ex1_5(){

        int N = 10;
        Integer[] a = new Integer[N];

        // gerar números uniformes
        for (int i = 0; i < N; i++) {
            a[i] = StdRandom.uniform(100);
        }

        // imprimir array original
        System.out.println("Array original:");
        for (int i = 0; i < N; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();

        // ordenar com quicksort
        Quick.sort(a);

        // imprimir array ordenado
        System.out.println("Array ordenado:");
        for (int i = 0; i < N; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();
    }

    public static void ex1_6(){

        String[] files = {
                ".//data//1Kints.txt",
                ".//data//2Kints.txt",
                ".//data//4Kints.txt",
                ".//data//8Kints.txt"
        };

        double somaTotal = 0;
        int totalNumeros = 0;

        for (int f = 0; f < files.length; f++) {

            In file = new In(files[f]);

            double soma = 0;
            int count = 0;

            while (!file.isEmpty()) {
                int num = file.readInt();
                soma += num;
                count++;
            }

            double media = soma / count;

            System.out.println("Ficheiro: " + files[f]);
            System.out.println("Media: " + media);

            somaTotal += soma;
            totalNumeros += count;

            file.close();
        }

        double mediaTotal = somaTotal / totalNumeros;

        System.out.println("Media total de todos os inteiros: " + mediaTotal);
    }
}