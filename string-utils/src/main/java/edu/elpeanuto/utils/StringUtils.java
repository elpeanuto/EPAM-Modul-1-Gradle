package edu.elpeanuto.utils;

import static org.apache.commons.lang3.StringUtils.isNumeric;

public class StringUtils {
    public static  boolean isPositiveNumber(String str){
        return isNumeric(str) && Integer.parseInt(str) > 0;
    }
}