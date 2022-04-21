package builderproject;

public class Arvore {
    private final String folha;
    private String frutos;
    private double tamanho;
    private final String textura;
    

    public Arvore(String folha, String frutos, double tamanho, String textura) {
        this.folha = folha;
        this.frutos = frutos;
        this.tamanho = tamanho;
        this.textura = textura;       
    }

    public String getFolha() {
        return folha;
    }

    public String getFrutos() {
        return frutos;
    }
    
    public double getTamanho() {
        return tamanho;
    }

    public String getTextura() {
        return textura;
    }    
}
