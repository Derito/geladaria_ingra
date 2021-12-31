package com.helder.pro.geladariaingra.util;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// Component informa que esta classe é um Bean.
@Component
public class DateUtil {

      public String formatLocalDateTimeDatabaseStyle(LocalDateTime localDateTime){
        return DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:mm").format(localDateTime);
    }
}
