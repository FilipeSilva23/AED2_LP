package edu.ufp.inf.aed2;

import edu.princeton.cs.algs4.SequentialSearchST;


public class MainTestPrincetonAlgs4 {
    public static void main(String[] args) {
        System.out.println("MainTestPrincetonAlgs4->main(): test Princeton algs4!");
        exemplo1_princeton();
    }

    public static void exemplo1_princeton() {
        SequentialSearchST<String, Integer> st = new SequentialSearchST<>();

        st.put("Azul",10);
        st.put("Verde",50);
        System.out.println("Tabela (inicial):");
        for (String s : st.keys()) {
            System.out.println(s + "-" + st.get(s));
        }
        st.put("Azul",25);
        st.put("Verde",75);
        System.out.println("Tabela (depois de atualizar):");
        for (String s : st.keys()) {
            System.out.println(s + "-" + st.get(s));
        }

    }
}