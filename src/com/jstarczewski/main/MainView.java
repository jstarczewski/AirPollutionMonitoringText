package com.jstarczewski.main;

public class MainView implements MainContract.View {

    /**
     * @author Jan
     * Analogicznie do prezentera implementacja View z kontraktu
     *
     * Z powodu takie, ze nie mamy tutaj klasycznego GUI, bedzie trzeba takowy
     * wzorzec zmodyfikowac, od strony frontendu zajmę się tym ja
     *
     * */

    @Override
    public void setPresenter(MainContract.Presenter presenter) {

    }

    @Override
    public void stop() {

    }

    @Override
    public void printInvalidCharacterInputError(String inputError) {
        System.out.println(inputError);
    }

    @Override
    public void printValidInputInfo() {
        System.out.println("OK");
    }
}
