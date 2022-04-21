package builderproject;

public class PrintArvore {
    private final String folha;
    private String frutos;
    private double tamanho;
    private final String textura;
    
    public PrintArvore(String folha, String frutos, double tamanho, String textura) {
        this.folha = folha;
        this.frutos = frutos;
        this.tamanho = tamanho;
        this.textura = textura;       
    }
    
    public String print() {
        String info = "";
        info += "Folhas da árvore: " + folha + "\n";
        info += "Frutos da árvore: " + frutos + "\n";
        info += "Tamanho da árvore: " + tamanho + "\n";
        info += "Textura: " + textura + "\n";
        
        return info;
    }
}
