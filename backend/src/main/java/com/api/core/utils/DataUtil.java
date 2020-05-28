package com.api.core.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/**
 * Esta classe contém métodos para auxiliar o desenvolvimento  com o uso de datas
 */
public class DataUtil {

    /**
     * @param ano
     * @param mes
     * @param dia
     * @return uma nova instancia de um Date do pacote util com o ano, mês e dia
     * informados.
     */
    @SuppressWarnings("deprecation")
	public static Date converteData(int ano, int mes, int dia) {
        return new Date(ano - 1900, mes - 1, dia);
    }

    /**
     * Faz com que a data seja exibida em GMT, ou seja, data e horário de
     * brasília. Exemplo de uso: minhaData = dataLocal();
     *
     * @return uma instancia do calendário local
     */
    public static Date dataLocal() {
        return Calendar.getInstance(TimeZone.getTimeZone("GMT-03:00")).getTime();
        //            TimeZone tz = new SimpleTimeZone(Calendar.ZONE_OFFSET, "GMT-03:00");
        //            Calendar ca = GregorianCalendar.getInstance(tz);
        //            d = ca.getTime();
        //            System.out.println("==>" +d);
    }

    /**
     * Aplica o formato ano-mês-dia ao Date .
     *
     * @return string contendo o ano, mês e dia
     */
    @SuppressWarnings("deprecation")
	public static String dataString(int ano, int mes, int dia) {
        Date data = new Date(ano - 1900, mes - 1, dia);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        return df.format(data);
    }

    /**
     * Aplica o formato ano-mês-dia ao Date .
     *
     * @return string contendo a data atual do sistema
     */
    public static String dataAtualString() {
        Date data = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        return df.format(data);
    }

    /**
     * Retorna um objeto util.Date no formato ano-mês-dia a partir da string
     * recebida no parâmetro
     *
     * @param data string contendo a data a ser formatada
     * @return novo objeto date no formato ano-mês-dia
     * @throws java.text.ParseException contém detalhes do erro, caso ocorra
     */
    public static Date formataData(String data) throws ParseException {
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        return formatter.parse(data);
    }

    /**
     * Este método cria uma string com intervalos dadas para auxiliar nas buscas
     * em que o critério sejam duas datas, como por exemplo os cardápios de uma
     * semana.
     *
     * Exemplo de entrada: semana = 37, primeiroDia = 1, ultimoDia = 7 Com o
     * exemplo de entrada acima, seria retornada uma string contendo duas datas:
     * A primeira correspondente a 37º semana no dia 1, ou seja 2017-09-10 E a
     * segunda também na 37º no dia 7, tendo como data 2017 09 16
     *
     * OBS: Os dias dos parâmetros correspondem ao dia da semana de acordo com o
     * calendário.
     *
     * @param data data atual informada pelo front
     * @return intervalo de dias da semana informada
     *
     * Exemplo de retorno: '2017-02-02' AND '2017-02-08'
     */
    public static String dataDaSemana(Date data) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Calendar inicio = Calendar.getInstance();
        inicio.setTime(data);
        inicio.set(Calendar.DAY_OF_WEEK, 1);
        int semana = inicio.get(Calendar.WEEK_OF_YEAR);

        Calendar fim = Calendar.getInstance();
        fim.set(Calendar.WEEK_OF_YEAR, semana);
        fim.set(Calendar.DAY_OF_WEEK, 7);

		return "'" + sdf.format(inicio.getTime()) + "' AND '" + sdf.format(fim.getTime()) + "'";
	}
    
    public static Date addDays(Date date, int days) {
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(date);
        cal.add(Calendar.DATE, +days);
        return cal.getTime();
    }

    public static Date subtractDays(Date date, int days) {
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(date);
        cal.add(Calendar.DATE, -days);
        return cal.getTime();
    }
}
