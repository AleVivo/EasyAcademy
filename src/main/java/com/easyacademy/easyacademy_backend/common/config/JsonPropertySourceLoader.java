package com.easyacademy.easyacademy_backend.common.config;

import org.springframework.boot.env.YamlPropertySourceLoader;
import org.springframework.context.annotation.Configuration;

public class JsonPropertySourceLoader extends YamlPropertySourceLoader {
    @Override
    public String[] getFileExtensions() {
        return new String[] { "json" };
    }

}
