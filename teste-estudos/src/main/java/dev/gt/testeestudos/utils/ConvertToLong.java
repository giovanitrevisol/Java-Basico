package dev.gt.testeestudos.utils;

import org.apache.commons.lang3.StringUtils;

public class ConvertToLong {

    public static Long convertStringToLong(String value){

        if(StringUtils.isEmpty(value) || !value.substring(3).matches("[0-9]*")){
            return 0L;
        }

        return Long.valueOf(value);
    }

}
