package com.projet.com.entity;

public @interface Column {
    String name();

    boolean nullable();

    int length();
}
