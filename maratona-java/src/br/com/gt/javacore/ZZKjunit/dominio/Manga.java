package br.com.gt.javacore.ZZKjunit.dominio;

import java.util.Objects;

public record Manga(String name, int episodes) {

    public Manga {
        Objects.requireNonNull(name);
    }
}
