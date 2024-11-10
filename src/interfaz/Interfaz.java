package interfaz;

import control.Gestor;

import java.time.LocalDateTime;

public class Interfaz {
    public static void interfaz () {
        System.out.println("Fecha local actual");
        System.out.println("------------------");
        Gestor.fechaActualLocal();
        System.out.println("Fecha actual en Caracas");
        System.out.println("-----------------------");
        Gestor.fechaActualCaracas();
        System.out.println("Años desde el descubrimiento de América");
        System.out.println("---------------------------------------");
        Gestor.annosDescubrimientoAmerica();
        System.out.println("Hora local actual");
        System.out.println("-----------------");
        Gestor.horaActualLocal();
        System.out.println("Hora actual en Caracas");
        System.out.println("----------------------");
        Gestor.horaActualCaracas();
        System.out.println("Diferencia horaria entre Madrid y Caracas");
        System.out.println("-----------------------------------------");
        Gestor.diferenciaHorariaMadridCaracas();
        System.out.println("Fecha y hora en la que Neil Armstrong pisó la luna");
        System.out.println("--------------------------------------------------");
        Gestor.fechaHoraLuna();
    }
}
