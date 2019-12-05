package homework_21;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Object obj = new Book();

        List<String> annotation = new ArrayList<String>();

        Field[] fields = obj.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            System.out.println("processing field " + field);
            Annotation[] ann = field.getAnnotations();
            for (Annotation annot : ann) {
                if (annot.annotationType().equals(MyAnnotation.class)) {
                    System.out.println(field);
                    annotation.add(field.getName());
                }
            }
        }


        System.out.println();
        Date date=new Date();
        System.out.println(date.toString());

        System.out.println(dateToLocalDate(date));
        System.out.println(dateToLocalTime(date));
        System.out.println(dateToLocalDateTime(date));

    }


    public static LocalDate dateToLocalDate(Date date) {

        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

    public static LocalTime dateToLocalTime(Date date) {

        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalTime();
    }

    public static LocalDateTime dateToLocalDateTime(Date date) {

        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
    }
}
