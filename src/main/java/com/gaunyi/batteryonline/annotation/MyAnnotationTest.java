package com.gaunyi.batteryonline.annotation;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by S0111 on 2019/8/20.
 */
public class MyAnnotationTest {

    public static void  main(String[] args) throws Exception{
        Class clazz = Class.forName("com.gaunyi.batteryonline.annotation.MyAnnotationUse");
        System.out.println( clazz.getAnnotations().toString());
        System.out.println( clazz.getAnnotatedSuperclass());
        System.out.println( clazz.getAnnotatedInterfaces());
        System.out.println( clazz.getClassLoader());

        //获取类注解信息
        MyAnnotationDefinition classAnno =(MyAnnotationDefinition) clazz.getAnnotation(MyAnnotationDefinition.class);
        System.out.println( classAnno.name()+"---"+classAnno.value()+"---"+classAnno.path());

        //获取方法注解信息
        Method[] allMethods = clazz.getDeclaredMethods();
        for(int i=0;i<allMethods.length;i++){
            if(allMethods[i].isAnnotationPresent(MyAnnotationDefinition.class)) {
                MyAnnotationDefinition methodAnno = allMethods[i].getAnnotation(MyAnnotationDefinition.class);
                System.out.println("遍历:"+methodAnno.name() + "---" + methodAnno.value() + "---" + methodAnno.path());
            }
        }


        //获取方法注解信息
       /* Method allMethods = clazz.getDeclaredMethod("testAnno");
        MyAnnotationDefinition methodAnno =  allMethods.getAnnotation(MyAnnotationDefinition.class);
        System.out.println( methodAnno.name()+"---"+methodAnno.value()+"---"+methodAnno.path());
        */

        //获取属性注解信息
        Field nameField =  clazz.getDeclaredField("name");
        MyAnnotationDefinition attrAnno = nameField.getAnnotation(MyAnnotationDefinition.class);
        System.out.println( attrAnno.name()+"---"+attrAnno.value()+"---"+attrAnno.path());
    }
}
