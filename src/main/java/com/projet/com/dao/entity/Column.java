package com.projet.com.dao.entity;

public @interface Column {
    String name();

    boolean nullable();

    int length();
}
