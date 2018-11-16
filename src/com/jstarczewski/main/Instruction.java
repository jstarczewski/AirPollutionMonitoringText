package com.jstarczewski.main;

public enum Instruction {

    GET(true);

    private boolean isInstruction;

    Instruction(boolean isInstruction) {
        this.isInstruction = isInstruction;
    }

    public boolean isInstruction() {
        return isInstruction;
    }
}
