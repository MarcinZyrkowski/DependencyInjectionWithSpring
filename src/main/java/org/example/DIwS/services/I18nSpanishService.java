package org.example.DIwS.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


@Service("i18nService")
public class I18nSpanishService implements GreetingService{

    @Override
    public String sayHello() {
        return "Hola mundo - ES";
    }
}