package edu.ufp.inf.aed2.aulas;

public class ArvoreBST {
    public class Nodo {
        public int key, val;
        public Nodo left, right;

        public Nodo(int chave, int valor) {
            key = chave;
            val = valor;
        }
    }

    public Nodo root;

    public void insere(int chave, int valor) {
        Nodo parent = null, no = root;
        while (true) {
            if (no == null) {
                ArvoreBST.Nodo novoNo = new ArvoreBST.Nodo(chave, valor);
                if (parent == null)
                    root = novoNo;
                else if (parent.key < chave)
                    parent.right = novoNo;
                else
                    parent.left = novoNo;
                return;
            } else {
                parent = no;
                if (chave > no.key)
                    no = no.right;
                else if (chave < no.key)
                    no = no.left;
                else
                    return;
            }
        }
    }


    public void preordem(Nodo x) {
        if (x == null) return;
        System.out.print(x.key + " ");    // visita o no
        preordem(x.left);  // visita sub-arvore esquerda
        preordem(x.right); // visita sub-arvore direita
    }

    public void emordem(Nodo x) {
        if (x == null) return;
        emordem(x.left);  // visita sub-arvore esquerda
        System.out.print(x.key + " ");    // visita o no
        emordem(x.right); // visita sub-arvore direita
    }

    public void entre_kmaior_kmenor(Nodo x, int kmaior, int kmenor) {
        if (x == null) return;
        if (x.key < kmaior)
            entre_kmaior_kmenor(x.right, kmaior, kmenor); // visita sub-arvore direita
        if (x.key <= kmaior && x.key >= kmenor)
            System.out.print(x.key + " ");    // visita o no
        if (x.key > kmenor)
            entre_kmaior_kmenor(x.left, kmaior, kmenor);  // visita sub-arvore esquerda
    }

}
