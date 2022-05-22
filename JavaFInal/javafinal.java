import java.io.*;
public class javafinal {

    private static double division;
    private static int i;
    private static double modulacion;
    private static double multiplicacion;
    private static int opcion;
    private static double resta;
    private static double suma;
    private static int tamanio;



    public static void main(String args[]) throws IOException {

        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("¿Cuantos números vas a utilizar?");
        tamanio = Integer.parseInt(bufEntrada.readLine());
        double[] num = new double[tamanio];

        suma = 0;
        resta = 0;
        multiplicacion = 0;
        division = 0;
        modulacion = 0;

        //

        System.out.println("¿Que quieres hacer?");
        System.out.println("1: Sumar");
        System.out.println("2: Restar");
        System.out.println("3: Multiplicar");
        System.out.println("4: Dividir");
        System.out.println("5: Modular");
        opcion = Integer.parseInt(bufEntrada.readLine());
        switch (opcion) {
            case 1:
                System.out.println("Digite los n�meros a sumar");
                for (i=0;i<=tamanio-1;i++) {
                    num[i] = Double.parseDouble(bufEntrada.readLine());
                    suma = suma+num[i];
                }
                System.out.println("El resultado de la suma total es: "+suma);
                break;
            case 2:
                System.out.println("Digite los números a restar");
                for (i=0;i<=tamanio-1;i++) {
                    num[i] = Double.parseDouble(bufEntrada.readLine());
                }
                resta = resta+num[0];
                for (i=1;i<=tamanio-1;i++) {
                    resta = resta-num[i];
                }
                System.out.println("El resultado de la resta total es: "+resta);
                break;
            case 3:
                System.out.println("Digite los números a multiplicar");
                num[0] = Double.parseDouble(bufEntrada.readLine());
                multiplicacion = num[0];
                for (i=1;i<=tamanio-1;i++) {
                    num[i] = Double.parseDouble(bufEntrada.readLine());
                    multiplicacion = multiplicacion*num[i];
                }
                System.out.println("El resultado de la multiplicación total es: "+multiplicacion);
                break;
            case 4:
                System.out.println("Digite los números a dividir");
                num[0] = Double.parseDouble(bufEntrada.readLine());
                division = num[0];
                for (i=1;i<=tamanio-1;i++) {
                    num[i] = Double.parseDouble(bufEntrada.readLine());
                    if (num[i]==0) {
                        System.out.println("No se aceptan divisiones por 0");
                        i = tamanio-1;
                        division = 0;
                    } else {
                        division = division/num[i];
                    }
                }
                System.out.println("El resultado de la división total es: "+division);
                break;
            case 5:
                System.out.println("Digite los números a modular");
                num[0] = Double.parseDouble(bufEntrada.readLine());
                modulacion = num[0];
                for (i=1;i<=tamanio-1;i++) {
                    num[i] = Double.parseDouble(bufEntrada.readLine());
                    if (num[i]==0) {
                        System.out.println("No se aceptan divisiones por 0");
                        i = tamanio-1;
                    } else {
                        modulacion = modulacion%num[i];
                    }
                }
                System.out.println("El resultado de la división total es: "+modulacion);
                break;
        }
    }


}


