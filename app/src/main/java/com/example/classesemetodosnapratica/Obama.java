package com.example.classesemetodosnapratica;

public class Obama extends Cidadao implements Presidente {

    @Override
    public void ganharElecao() {
        System.out.println("Ganhar uma eleição nos Estados Unidos");
    }
}
