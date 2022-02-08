package com.example.classesemetodosnapratica;

public class Pessoa {

                    private String nome;
                    private int idade;

                    public void exibirDdos(String nome){
                        System.out.println( "Exibir apenas o nome" + nome );
                    }

                    public void exibirDados(String nome, int idade){
                        System.out.println( "nome" +nome  + "idade " + idade );
                    }



}
