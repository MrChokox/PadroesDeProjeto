package prototypeproject;

public class PrototypeProject {

    public static void main(String[] args) throws CloneNotSupportedException {        
        Mesa branca = new MesaBranca("Quartzo","Branca");
        branca.altura = 600;
        Mesa redonda = new MesaRedonda("Marmore","Bege");
        redonda.altura = 1200;

        Mesa clone;
        //Clone do Objeto Mesa branca
        clone = branca.clone();

        
        clone.altura = branca.altura + Mesa.setAltura();
        System.out.println("Material da mesa: " + clone.getMaterial() + ", Altura da mesa: " + clone.altura);

        //Clone do Objeto Mesa redonda
        clone = redonda.clone();
       
        clone.altura = branca.altura + Mesa.setAltura();
        System.out.println("Material da mesa: " + clone.getMaterial() + ", Altura da mesa: " + clone.altura);
    }
    
}
