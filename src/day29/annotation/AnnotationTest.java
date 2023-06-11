package day29.annotation;


import org.junit.Test;

import java.lang.reflect.Field;


public class AnnotationTest {
    @Test
    public void  test1(){
        Class clazz = Customer.class;
        Table annotation = (Table) clazz.getDeclaredAnnotation(Table.class);
        System.out.println(annotation.value());
    }

    @Test
    public void  test2() throws Exception{
        Class clazz = Customer.class;
        Field name = clazz.getDeclaredField("name");
        Column nameColume = name.getDeclaredAnnotation(Column.class);
        System.out.println(nameColume.columnName());
        System.out.println(nameColume.columnType());
    }

}
