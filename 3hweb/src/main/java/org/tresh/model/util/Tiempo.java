
package org.tresh.model.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author GEORGE MEJIA
 */
public class Tiempo {

    /**
     * Calcula la edad
     *
     * @param nacimiento fecha de nacimiento
     * @return numero de a&ntilde;os transcurridos hasta la actualidad
     */
    public static int calcularEdadActual(Date nacimiento) {
        Calendar tiempoNacimiento = Calendar.getInstance();
        tiempoNacimiento.setTime(nacimiento);
        return Calendar.getInstance().get(Calendar.YEAR) - tiempoNacimiento.get(Calendar.YEAR);
    }

    /**
     * Calcula la diferencia en a&ntilde;os de dos fechas definidas
     *
     * @param fechaMayor fecha mayor
     * @param fechaMenor fecha menor
     * @return diferencia en a&ntilde;os
     */
    public static int calcularDiferenciaAnios(Date fechaMayor, Date fechaMenor) {
        Calendar tiempoMayor = Calendar.getInstance();
        tiempoMayor.setTime(fechaMayor);
        Calendar tiempoMenor = Calendar.getInstance();
        tiempoMenor.setTime(fechaMenor);
        System.out.println(tiempoMayor.get(Calendar.YEAR));
        System.out.println(tiempoMenor.get(Calendar.YEAR));
        return tiempoMayor.get(Calendar.YEAR) - tiempoMenor.get(Calendar.YEAR);
    }


    public static String formatearFecha(Locale localizacion, String formato, Date fecha) {
        SimpleDateFormat patron;
        if (localizacion != null) {
            patron = new SimpleDateFormat(formato, localizacion);
        }
        patron = new SimpleDateFormat(formato);
        String fechaConFormato;
        fechaConFormato = patron.format(fecha);
        return fechaConFormato;
    }

    public static String formatearFecha(String formato, Date fecha) {
        return formatearFecha(null,formato, fecha);
    }

    public static Date transformarStringFecha(String formato, String fecha) {
        SimpleDateFormat patron = new SimpleDateFormat(formato);
        Date fechaTransformada = null;
        try {
            fechaTransformada = patron.parse(fecha);
        } catch (ParseException ex) {
            Logger.getLogger(Tiempo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return fechaTransformada;
    }

}
