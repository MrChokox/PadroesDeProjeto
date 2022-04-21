package builderproject;

public class OTodoPoderoso {
    public void constructCoqueiro(Builder builder) {
        builder.setFolhaArvore("Pinadas");
        builder.setFrutosArvore("Coco");
        builder.setTamanhoArvore(30);
        builder.setTextutaArvore("Tronco Liso");
    }

    public void constructSalgueiroChorao(Builder builder) {
        builder.setFolhaArvore("Serrilhadas");
        builder.setFrutosArvore("Não possui");
        builder.setTamanhoArvore(25);
        builder.setTextutaArvore("Rigida");
    }

    public void constructCarvalhoAlemao(Builder builder) {
        builder.setFolhaArvore("Verdes intensas");
        builder.setFrutosArvore("Bolota");
        builder.setTamanhoArvore(40);
        builder.setTextutaArvore("Resistente");
    }
}
