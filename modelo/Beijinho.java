package modelo;

import doceria.Doceria;

public class Beijinho extends Doceria {
    private String[] ingredientes;

    public Beijinho() {
        super("Beijinho");
        ingredientes = new String[]{"Leite condensado", "Coco ralado", "Manteiga", "Açúcar cristal"};
    }

    @Override
    public void listarIngredientes() {
        System.out.println("Ingredientes do Beijinho:");
        for (String ingrediente : ingredientes) {
            System.out.println("- " + ingrediente);
        }
    }
}

    

