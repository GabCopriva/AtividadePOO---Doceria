package doceria;

public abstract class Doceria {
   
    protected String nome;
    
    public Doceria(String nome) {
        this.nome = nome;
    }

    // Método listar os ingredientes de cada doce
    public abstract void listarIngredientes();
    
    public void exibirNome() {
        System.out.println("Doce " + nome);
    }
}



