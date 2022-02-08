package com.example.classesemetodosnapratica;

public class Tiago extends Cidadao implements Presidente {

    @Override
    public void ganharElecao() {
        System.out.println("Ganhar uma eleição no Brasil");
    }
}
