package prototypeproject;

import java.util.Random;

public abstract class Mesa implements Cloneable {
       public String material;
       public double altura;
       public String cor;

       public String getMaterial()
       {
             return material;
       }

       public void setMaterial(String material)
       {
             this.material = material;
       }

       public static double setAltura()
       {
             double altura = 0;
             Random r = new Random();
             double p = r.nextInt(1000);
             altura = p;
             return altura;
       }

       public Mesa clone() throws CloneNotSupportedException
       {
             return (Mesa)super.clone();
       }
}
