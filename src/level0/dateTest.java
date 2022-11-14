package level0;

import javafx.util.converter.LocalDateStringConverter;
import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class dateTest {
    public static String dateTest1(String dt) throws ParseException {
        //자료형이 string 인 변수 선언 후 날짜 정보 입력
        SimpleDateFormat input = new SimpleDateFormat("yyyyMMddhhmmss");  //dt와 형식을 맞추어 준다.
        SimpleDateFormat output = new SimpleDateFormat("yy-MM-dd hh:mm:ss"); //변환할 형식
        Date newdt = input.parse(dt);            //date 자료형으로 변환
        String newdt2 = output.format(newdt);    //date 타입을 string 으로 변환
        System.out.println(newdt2);

        return newdt2;
    }

    static class SimpleOrderDto {
        private String insertdate;
    }

    public static void main(String[] args) throws ParseException {
        String date = "20221114";
        String date3 = "20221114132534";
        //LocalDateTime dateTime = LocalDateTime.parse(date);

        LocalDate date1 = LocalDate.parse(date, DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(date1);

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        //Date date2 = formatter.parse(date3);
        //String formattedDateString = formatter.format(date2);
        //System.out.println(formattedDateString);
        String dt = "20221114132534";

        String insertdate = dateTest1(dt);
        //dateTest1(m.getInsertdate)

        SimpleOrderDto simpleOrderDto = new SimpleOrderDto();
        System.out.println(simpleOrderDto.toString());


        
    }
}

