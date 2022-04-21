package prototypeproject;

public class MesaBranca extends Mesa{
    public MesaBranca(String material, String cor)
    {
          this.material = material;
          this.cor = cor;
    }

    @Override
    public Mesa clone() throws CloneNotSupportedException
    {
          return (MesaBranca)super.clone();
    }
}
