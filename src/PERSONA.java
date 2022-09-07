import java.util.Scanner;

public class PERSONA {

    public static void main(String[] args)
    {
        Scanner ht = new Scanner(System.in);
        System . out . print("Por favor ingrese su altura:");
        double altura  = ht . nextDouble ();

        Scanner wt = new Scanner ( System . in );
        System . out . print("Por favor ingrese su peso:");
        double peso = wt . nextDouble ();

        double IMC = 0;

        IMC = peso / ( altura * altura );

        System.out.print("El índice de masa corporal es:"+IMC);
        System.out.print("\n");

        if (IMC < 18.5)
        {
            System.out.println("Tu Peso bajo");
        }
        else if (IMC >= 18.5 && IMC < 25 )
        {
            System.out.println("Tu peso es Normal");
        }
        else if (IMC >= 25 && IMC < 30 )
        {
            System.out.println("Tienes Sobrepeso");
        }
        else if (IMC >= 30 )
        {
            System.out.println("Tienes Obesidad");
        }



    }

}