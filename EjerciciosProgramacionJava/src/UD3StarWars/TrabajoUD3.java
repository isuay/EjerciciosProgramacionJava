/*
 * Proyecto TrabajoUD3 - Archivo TrabajoUD3.java - Compañía DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package UD3StarWars;

import java.util.Scanner;
import java.lang.Math;

/*
 *
 * @author Iris Suay <irisau2@gmail.com>
 * @version 1.0
 * @date 28 oct. 2021 19:51:49
 */
public class TrabajoUD3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        //Variables generales
        int resp;
        boolean pierde = false;

        //Escribimos la introducción del juego
        System.out.println("===STAR WARS CÓDIGOS SECRETOS===\n"
                + "Hace mucho tiempo, en una galaxia muy, muy lejana... La Princesa Leia, Luke Skywalker, Han Solo, "
                + "Chewbacca, C3PO y R2D2 \nviajan en una nave imperial robada en una misión secreta para infiltrarse "
                + "en otra estrella de la muerte que el imperio \nestá construyendo para destruirla. (Presiona intro para continuar)");

        String intro = in.nextLine();

        //Variables nivel 1
        int S1 = (int) (1 + Math.random() * 10), S2 = (int) (20 + Math.random() * (30 - 20 + 1)), suma = 0;

        //Nivel 1
        System.out.println("Los problemas empiezan cuando deben realizar un salto hiperespacial hasta el sistema estelar " + S1
                + " en el sector " + S2 + ", \npero el control de navegación está estropeado y el computador tiene problemas para "
                + "calcular parte de las coordenadas de salto. \nChewbacca, piloto experto, se da cuenta que falta el cuarto número de la serie.\n"
                + "Recuerda de sus tiempos en la academia de pilotos que para calcularlo hay que calcular el sumatorio entre "
                + "el nº del sistema y \nel nº del sector (ambos inclusive). \n¿Qué debe introducir?");

        //Hacemos las operaciones del nivel 1
        for (int i = S1; i <= S2; i++) {
            suma += i;
        }

        resp = in.nextInt();

        //Si es correcto empezamos nivel 2
        if (resp == suma) {

            //Variables nivel 2
            int P1 = (int) (1 + Math.random() * 7), P2 = (int) (8 + Math.random() * (12 - 8 + 1)), mult = 1;

            System.out.println("Gracias a Chewbacca consiguen llegar al sistema correcto y ven a lo lejos la estrella de la muerte.\n"
                    + "Como van en una nave imperial robada se aproximan lentamente con la intención de pasar desapercibidos.\n"
                    + "De  repente suena el comunicador. “Aquí agente de espaciopuerto " + P1 + " contactando con nave imperial " + P2 + "\n"
                    + "No están destinados en este sector. ¿Qué hacen aquí?”. Han Solo coge el comunicador e improvisa.\n"
                    + "“Eh... tenemos un fallo en el... eh... condensador de fluzo... Solicitamos permiso para atracar y reparar la nave”.\n"
                    + "El agente, que no se anda con tonterías, responde “Proporcione código de acceso o abriremos fuego”.\n"
                    + "Han Solo ojea rápidamente el manual del piloto que estaba en la guantera y da con la página correcta.\n"
                    + "El código es el productorio entre el nº del agente y el nº de la nave (ambos inclusive). ¿Cuál es el código?");

            //Hacemos las operaciones del nivel 2
            for (int i = P1; i <= P2; i++) {
                mult *= i;
            }

            resp = in.nextInt();

            //Si es correcto empezamos nivel 3
            if (resp == mult) {

                //Variables nivel 3
                int N = (int) (50 + Math.random() * (100 - 50 + 1)), fact = 1;

                System.out.println("Han Solo proporciona el código correcto. Atracan en la estrella de la muerte,\n"
                        + "se equipan con trajes de soldados imperiales que encuentran en la nave para pasar desapercibidos y bajan.\n"
                        + "Ahora deben averiguar en qué nivel de los " + N + " existentes se encuentra el reactor principal.\n"
                        + "Se dirigen al primer panel computerizado que encuentran y la Princesa Leia intenta acceder a los planos de la \n"
                        + "nave pero necesita introducir una clave de acceso. Entonces recuerda la información que le proporcionó \n"
                        + "Lando Calrissian “La clave de acceso a los planos de la nave es el factorial de N/10 (redondeando N hacia abajo),\n"
                        + "donde N es el nº de niveles”. ¿Cual es el nivel correcto?");

                //Hacemos las operaciones del nivel 3
                N /= 10;

                for (int i = 2; i <= N; i++) {
                    fact *= i;
                }

                resp = in.nextInt();

                //Si es correcto empezamos nivel 4
                if (resp == fact) {

                    //Variables nivel 4
                    int P = (int) (10 + Math.random() * (100 - 10 + 1)), contador = 0;

                    System.out.println("Gracias a la inteligencia de Leia llegan al nivel correcto y encuentran la puerta acorazada\n"
                            + "que da al reactor principal. R2D2 se conecta al panel de acceso para intentar hackear el sistema y\n"
                            + "abrir la puerta. Para desencriptar la clave necesita verificar si el número " + P + " es primo o no.\n"
                            + "Si es primo introduce un 1, si no lo es introduce un 0.");

                    //Hacemos las operaciones del nivel 4
                    for (int i = 1; i <= P; i++) {
                        if (P % i == 0) {
                            contador++;
                        }
                    }

                    if (contador <= 2) {
                        P = 1;
                    } else {
                        P = 0;
                    }

                    resp = in.nextInt();

                    //Si es correcto empezamos el nivel 5
                    if (resp == P) {

                        //Variables nivel 5
                        int M = (int) (5 + Math.random() * (10 - 5 + 1)), S = (int) (5 + Math.random() * (10 - 5 + 1)), factm = 1, facts = 1;

                        System.out.println("Consiguen entrar al reactor. Ya solo queda que Luke Skywalker coloque la bomba,\n"
                                + "programe el temporizador y salir de allí corriendo. Necesita programarlo para que explote en exactamente\n"
                                + M + " minutos y " + S + " segundos, el tiempo suficiente para escapar antes de que explote pero sin que\n"
                                + "el sistema de seguridad antiexplosivos detecte y desactive la bomba. Pero el temporizador utiliza\n"
                                + "un reloj Zordgiano un tanto peculiar. Para convertir los minutos y segundos al sistema Zordgiano hay\n"
                                + "que sumar el factorial de " + M + " y el factorial de " + S + ". ¿Qué valor debe introducir?");

                        //Hacemos las operaciones del nivel 5
                        for (int i = 2; i <= M; i++) {
                            factm *= i;
                        }

                        for (int i = 2; i <= S; i++) {
                            facts *= i;
                        }

                        int total = factm + facts;

                        resp = in.nextInt();

                        //Si es correcto mostramos el mensaje de ganar
                        if (resp == total) {
                            System.out.println("Luke Skywalker introduce el tiempo correcto, activa el temporizador y empiezan a sonar\n"
                                    + "las alarmas. Salen de allí corriendo, no hay tiempo que perder. La nave se convierte en un\n"
                                    + "hervidero de soldados de arriba a abajo y entre el caos que les rodea consiguen llegar a la nave\n"
                                    + "y salir de allí a toda prisa. A medida que se alejan observan por la ventana la imagen de la\n"
                                    + "colosal estrella de la muerte explotando en el silencio del espacio, desapareciendo para siempre\n"
                                    + "junto a los restos del malvado imperio.\n"
                                    + "¡Has salvado la galaxia gracias a la Fuerza Jedi de las matemáticas!\n"
                                    + "Enhorabuena ;D");
                        } else {
                            pierde = true;
                        }
                    } else {
                        pierde = true;
                    }
                } else {
                    pierde = true;
                }
            } else {
                pierde = true;
            }
        } else {
            pierde = true;
        }

        //Si fallamos alguno nos muestra el mensaje de perder
        if (pierde == true) {
            System.out.println("Ese no era el código correcto… La misión ha sido un fracaso… :( :( :(\n"
                    + "Todavía no eres un Maestro Jedi de las Matemáticas. ¡Vuelve a intentarlo!");
        }

        //Texto del fin
        System.out.println("Gracias por jugar :D");
    }
}
