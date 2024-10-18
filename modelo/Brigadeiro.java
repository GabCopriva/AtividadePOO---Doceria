package modelo;

import doceria.Doceria;

    public class Brigadeiro extends Doceria {
    private String[] ingredientes;

    public Brigadeiro() {
        super("Brigadeiro");
        ingredientes = new String[]{"Leite condensado", "Achocolatado Nescau", "Manteiga", "Leite"};
    }

    @Override
    public void listarIngredientes() {
        System.out.println("Ingredientes do Brigadeiro:");
        for (String ingrediente : ingredientes) {
            System.out.println("- " + ingrediente);
        }
    }
}



