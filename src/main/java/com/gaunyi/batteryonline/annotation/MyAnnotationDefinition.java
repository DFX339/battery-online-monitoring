package com.gaunyi.batteryonline.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by S0111 on 2019/8/20.
 */
@Target(value= {ElementType.ANNOTATION_TYPE,ElementType.TYPE,ElementType.METHOD,ElementType.FIELD})
@Retention(value = RetentionPolicy.RUNTIME)
public @interface MyAnnotationDefinition {

    String name();

    String value();

    String path();
}
