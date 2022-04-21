package prototypeproject;

public class MesaRedonda extends Mesa{
    public MesaRedonda(String material, String cor)
    {
          this.material = material;
          this.cor = cor;
    }

    @Override
    public Mesa clone() throws CloneNotSupportedException
    {
          return (MesaRedonda)super.clone();
    }
}
