import java.util.Scanner;
public class Talleres {
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        System.out.print("Escribir la cantidad de estudiantes que hay: ");
        int estudiantes = lector.nextInt();
        int accion;

        double[] notas = new double[estudiantes];
        double nota;
        boolean seingresaronnotas = false;
        double sumanotas = 0.0;
        int contador = 0;
        double promedio;
        double mayornota;
        double menornota;
        int aprobados =0;
        int reprobados =0;

do {
        // Menú del programa
        System.out.println("Escribir el número segun corresponda:\n1. Ingresar notas\n2. Mostrar notas\n3. Promedio\n4. Mayor nota" +
                "\n5. Menor nota\n6. Estudiantes reprobados\n7. Estudiantes aprobados\n8. Salir");
        accion = lector.nextInt();

        switch (accion) {
            case 1:
                // Ingresar nota cada uno de los estudiantes
                // Limite de notas de 0 a 5
                // Se ingresaron notas
                System.out.println("Ingresar las notas de 0 a 5");
                for (int N = 0; N < notas.length; N++) {
                    System.out.print("Nota del estudiante " + (N + 1) + " : ");
                    nota = lector.nextDouble();
                    if (nota < 0 || nota > 5) {
                        System.out.println("Esa nota se sale del rango de 0 a 5");
                        N -= 1;
                        } else {
                            notas[N] = nota;
                        }
                 }
                seingresaronnotas = true;
                break;
            case 2:
                // Mostrar Notas de los estudiantes
                if (seingresaronnotas == true) {
                    for (int i = 0; i < notas.length; i++) {
                        System.out.println("Nota del estudiante " + (i + 1) + " : " + notas[i]);
                    }
                }
                else {
                    System.out.println("No se han ingresado notas");
                }
                break;
            case 3:
                // Promedio de notas
                if (seingresaronnotas == true) {
                    for (int i = 0; i < notas.length; i++) {
                        sumanotas += notas[i];
                        contador+=1;
                    }
                    promedio = sumanotas/contador;
                    System.out.println("Promedio de notas es: " + promedio);
                }
                else {
                    System.out.println("No se han ingresado notas");
                }
                break;
            case 4:
                // Nota mas alta
                mayornota = notas[0];
                if (seingresaronnotas == true) {
                    for(int a =0; a < notas.length; a++){
                        if(notas[a]>mayornota)
                        {
                            mayornota=notas[a];
                        }
                    }
                    System.out.println("La nota mas baja es: " + mayornota);
                }
                else {
                    System.out.println("No se han ingresado notas");
                }
                break;
            case  5:
                // Nota mas baja
                menornota = notas[0];
                if (seingresaronnotas == true) {
                    for(int b =0; b < notas.length; b++){
                        if(notas[b]<menornota)
                        {
                            menornota = notas[b];
                        }
                    }
                    System.out.println("La nota mas baja es: " + menornota);
                }
                else {
                    System.out.println("No se han ingresado notas");
                }
                break;
            case 6:
                if (seingresaronnotas == true) {
                    for(int r =0; r < notas.length; r++){
                        if(notas[r]<3.0)
                        {
                         reprobados+=1;
                        }
                    }
                    System.out.println("Numero de estudiantes rerobados: " + reprobados);
                }
                else {
                    System.out.println("No se han ingresado notas");
                }
                break;
            case 7:
                if (seingresaronnotas == true) {
                    for(int A =0; A < notas.length; A++){
                        if(notas[A]>=3.0)
                        {
                            aprobados+=1;
                        }
                    }
                    System.out.println("Numero de estudiantes rerobados: " + aprobados);
                }
                else {
                    System.out.println("No se han ingresado notas");
                }
                break;
        }
}while (accion!=8);
        System.out.println("\n");




//------------Taller (3) Matrices------------//

        System.out.println("//-------Materias y estudiantes-------//");
int estud;
int materias;
double grade;
boolean hayG = false;
double prom =0;

        System.out.print("Escribir cuántos estudiantes son: ");
        estud = lector.nextInt();
        System.out.print("Escribir cuántas materias son: ");
        materias = lector.nextInt();

        double[][] grades = new double[materias][estud];
do {

    // Menu
    System.out.println("Escribir el numero:\n1. Registrar Notas\n2. Mostrar Notas\n3. Promedio por estudiante" +
            "\n4. Promedio por materia\n5. Promedio general\n6. Salir ");
    accion= lector.nextInt();
    switch (accion) {
        case 1:
            // Agregar notas en cada materia
            for (int i = 0; i < grades.length; i++) {
                System.out.println("Materia ---- Notas");
                for (int j = 0; j < grades[i].length; j++) {
                    System.out.print("  " + i + "     ----  ");
                    grade = lector.nextDouble();
                    if(grade < 0 || grade > 5){
                        System.out.println("Esa nota se sale del rango de 0 a 5");
                        j-=1;
                    }else {
                        grades[i][j] = grade;
                    }
                }
                hayG = true;
                System.out.println("--------------------");
            }
            break;
        case 2:
            // Mostrar Notas
            if(hayG == true)
            {
                // Loop para que se veo como una tabla
                System.out.print("Materia ----- Notas");
                for (int m =1; m <= estud; m++){
                    if(m<10) {
                        System.out.print("   " + m + "  ");
                    }
                    else {
                        System.out.print("   " + m + " ");
                    }
                }
                // Loop para mostrar las notas de los estudiantes
                System.out.println("");
                for (int m =0; m < grades.length; m++)
                {
                    System.out.print("   "+m+"                 ");
                    for (int g = 0; g < grades[m].length; g++) {
                        System.out.print(grades[m][g]+ "   ");
                    }
                    System.out.println("\n--------------------------------------");
                }
            }
            else {
                System.out.println("No se han ingresado notas");
            }
            break;
        case 3:
            // promedio por estudiante
            if(hayG == true) {
                int e = 0;
                while (contador < estud) {
                    for (int M = 0; M < grades.length; M++) {
                        for (e = e; e < grades[M].length; e++) {
                            prom += grades[M][e];
                            break;
                        }
                    }
                    System.out.println("El promedio del estudiante " + (e + 1) + " es: " + (prom / materias));
                    prom = 0;
                    e += 1;
                    contador += 1;
                }
                contador = 0;
            }
            else {
                System.out.println("No se han ingresado notas");
            }
            break;
        case 4:
            // promedio por materia
            if(hayG == true) {
                int p = 0;
                while (contador < materias) {
                    for (p = p; p < grades.length; p++) {
                        for (int I = 0; I < grades[p].length; I++) {
                            prom += grades[p][I];
                        }
                        break;
                    }
                    System.out.println("El promedio de la materia " + (p + 1) + " es:" + (prom / estud));
                    p += 1;
                    prom = 0;
                    contador += 1;
                }
                contador = 0;
            }
            else {
                System.out.println("No se han ingresado notas");
            }
            break;
        case 5:
            // Promedio general
            if(hayG == true) {
                for (int T = 0; T < grades.length; T++) {
                    for (int Y = 0; Y < grades.length; Y++) {
                        prom += grades[T][Y];
                    }
                }
                System.out.println("El promedio general es: " + (prom / (estud * materias)));
            }
            else {
                System.out.println("No se han ingresado notas");
            }
            break;
    }
}while (accion!=6);




    }
}



