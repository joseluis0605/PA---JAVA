package com.company.materialAportado;

public abstract class FakeGenerator {

    private String id;
    private int fakesNumberAttended;

    public FakeGenerator(String id) {
        this.id = id;
        this.fakesNumberAttended = 0;
    }


}
