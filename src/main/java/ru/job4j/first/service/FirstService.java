package ru.job4j.first.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

@Service
@RefreshScope
public class FirstService {

    @Value("${app.word:none}")
    private String word;

    public String getWord() {
        return word;
    }


}
