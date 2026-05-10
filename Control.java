import java.util.Scanner;
public class Control {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        for(int i=1; i<=3; i++) {
            System.out.println("____Usuario #" + i + "____");

            System.out.println("Ingrese su nombre");
            String nombre=sc.nextLine();
            System.out.println("Ingrese su edad");
            int edad=sc.nextInt();
            System.out.println("Ingrese su calificacion del 1 al 100");
            double calificacion=sc.nextDouble();
            sc.nextLine();

            String clasificacionEdad=(edad<=18)? "Menor de edad": "Mayor de edad";

            String resulCla;
            if (calificacion<60) {
                resulCla = "Reprobo";
            } else if (calificacion<70) {
                resulCla="Paso con una calificacion regular";
            } else if (calificacion<80) {
                resulCla="Paso con una calificacion buena";
            } else if (calificacion<90) {
                resulCla="Paso con una calificacion muy buena";
            } else if (calificacion>=90 && calificacion<=100) {
                resulCla="Paso con una calificacion excelente";
            } else
                resulCla="Calificacion no valida";


            System.out.println("_____Resultados_____");
            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad + " (" + clasificacionEdad + ")");
            System.out.println("Calificacion: " + resulCla);
        }

       sc.close(); 
    }
}
