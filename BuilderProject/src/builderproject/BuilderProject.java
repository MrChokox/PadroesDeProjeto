package builderproject;

public class BuilderProject {

    public static void main(String[] args) {
        OTodoPoderoso deus = new OTodoPoderoso();        
        ArvoreBuilder builder = new ArvoreBuilder();
        deus.constructSalgueiroChorao(builder);
        
        Arvore arvore = builder.getResult();
        System.out.println("Tronco da arvore que deus criou:\n" + arvore.getTextura());

        PrintArvoreBuilder printArvore = new PrintArvoreBuilder();
        
        deus.constructCoqueiro(printArvore);
        PrintArvore arvorePrint = printArvore.getResult();
        System.out.println("\nArvore:\n" + arvorePrint.print());
    }
    
}
