package modelo;

import doceria.Doceria;

public class Executor {
    public static void main(String[] args) {
        
        Doceria brigadeiro = new Brigadeiro();
        Doceria beijinho = new Beijinho();

        brigadeiro.exibirNome();
        brigadeiro.listarIngredientes();

        System.out.println();

        beijinho.exibirNome();
        beijinho.listarIngredientes();
    }
}

