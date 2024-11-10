package control;


import java.time.*;
import java.time.format.DateTimeFormatter;

public class Gestor {
    public static void fechaActualLocal () {
        LocalDate fechaLocal = LocalDate.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(fechaLocal.format(formato));
    }

    public static void fechaActualCaracas () {
        ZoneId zonaCaracas = ZoneId.of("America/Caracas");
        ZonedDateTime fechaCaracas = ZonedDateTime.now(zonaCaracas);
        DateTimeFormatter formato= DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaCaracasLocal = fechaCaracas.toLocalDate();
        System.out.println(fechaCaracasLocal.format(formato));

    }

    public static void annosDescubrimientoAmerica () {
        LocalDate fechaDescubrimiento = LocalDate.of(1492, 10, 12);
        LocalDate fechaActual = LocalDate.now();
        Period tiempoEntreFechas = Period.between(fechaDescubrimiento, fechaActual);
        System.out.println(tiempoEntreFechas.getYears());
    }

    public static void horaActualLocal () {
        LocalTime horaActual = LocalTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println(horaActual.format(formato));
    }

    public static void horaActualCaracas () {
        ZoneId zonaCaracas = ZoneId.of("America/Caracas");
        ZonedDateTime horaCaracas = ZonedDateTime.now(zonaCaracas);
        LocalDateTime horaCaracasLocal = horaCaracas.toLocalDateTime();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println(horaCaracasLocal.format(formato));
    }

    public static void diferenciaHorariaMadridCaracas () {
        ZoneId zonaMadrid = ZoneId.of("Europe/Madrid");
        ZoneId zonaCaracas = ZoneId.of("America/Caracas");
        ZonedDateTime horaMadrid = ZonedDateTime.now(zonaMadrid);
        ZonedDateTime horaCaracas = ZonedDateTime.now(zonaCaracas);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm:ss");
        Duration diferenciaHoraria = Duration.between(horaCaracas, horaMadrid);
        LocalTime tiempoDiferencia = LocalTime.ofSecondOfDay(diferenciaHoraria.getSeconds());
        System.out.println(tiempoDiferencia.format(formato));
    }

    public static void fechaHoraLuna () {
        LocalDateTime fechaHoraLuna = LocalDateTime.of(1969, 7, 1, 3, 56);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy 'a las' HH:mm 'hora de Madrid'");
        System.out.println(fechaHoraLuna.format(formato));
    }
}
