package builderproject;

public class ArvoreBuilder implements Builder{
    private String folha;
    private String frutos;
    private double tamanho;
    private String textura;
    
    
    @Override
    public void setFolhaArvore(String folha) {
       this.folha = folha;
    }

    @Override
    public void setFrutosArvore(String frutos) {
        this.frutos = frutos;
    }

    @Override
    public void setTamanhoArvore(double tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public void setTextutaArvore(String textura) {
        this.textura = textura;
    }
    
    public Arvore getResult() {
        return new Arvore(folha, frutos, tamanho, textura);
    }
    
}
