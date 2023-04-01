package org.csits.demo.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class MessageService {

    @Autowired
    private MessageSource messageSource;


    public static String LOCALE;

    @Value("${spring.web.locale}")
    public void setLOCALE(String locale) {
        this.LOCALE = locale;
    }

    public String getMessage(String code) {
        return messageSource.getMessage(code, null, Locale.forLanguageTag(LOCALE));
    }

    public String getMessage(String code, Object[] args) {
        return messageSource.getMessage(code, args, Locale.forLanguageTag(LOCALE));
    }

    public String getMessage(String code, String locale) {
        return messageSource.getMessage(code, null, Locale.forLanguageTag(locale));
    }

    public String getMessage(String code, String locale, Object[] args) {
        return messageSource.getMessage(code, args, Locale.forLanguageTag(locale));
    }

}
