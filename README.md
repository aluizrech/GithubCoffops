# Converter LocalDateTime XMLGregorianCalendar Java

Mais um post com uma dica super rápida e simples de como converter LocalDateTime e LocalDate para XMLGregorianCalendar no Java.

## 1 – Um pouco sobre o XMLGregorianCalendar
O padrão XML Schema define regras claras para especificar datas no formato XML. Para usar esse formato, a classe Java XMLGregorianCalendar foi introduzida no Java 1.5, que representa o tipo de dados de data/hora W3C XML Schema 1.0.

## 2 – Um pouco sobre o LocalDate
A instância LocalDate representa uma data sem fuso horário no sistema de calendário ISO-8601. Portanto, LocalDate é adequado para armazenar somente datas, mas não para armazenar qualquer informação relacionada ao tempo (Horário). Java introduziu LocalDate na versão 1.8.

## 3 – Um pouco sobre o LocalDateTime
A instância LocalDateTime possui a mesma característica que o LocalDate de armazenar datas, porém com um adicional de armazenar também informação de horário e fuso horário.

## 4 – Convertendo LocalDate para XMLGregorianCalendar

    public static XMLGregorianCalendar getXMLGregorianCalendar(LocalDate localDate) throws DatatypeConfigurationException {
        return DatatypeFactory.newInstance().newXMLGregorianCalendar(localDate.toString());
    }

## 5 – Convertendo LocalDateTime para XMLGregorianCalendar

    public static XMLGregorianCalendar getXMLGregorianCalendar(LocalDateTime localDateTime) throws DatatypeConfigurationException {

        ZonedDateTime zoneDateTime = ZonedDateTime.of(localDateTime, ZoneId.systemDefault());

        GregorianCalendar gregorianCalendar = GregorianCalendar.from(zoneDateTime);

        return DatatypeFactory.newInstance().newXMLGregorianCalendar(gregorianCalendar);

    }
## 6 – Conclusão
Tanto o passo de conversão do LocalDate quanto para o LocalDateTime são extremamente simples como pode pode ser visto nos passos anteriores.

# Confira o post completo em:
https://coffops.com/converter-localdatetime-xmlgregoriancalendar-java/

