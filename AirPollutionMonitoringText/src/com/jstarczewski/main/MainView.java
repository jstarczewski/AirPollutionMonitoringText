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
    public void printNullPointerExceptionError(String message) {
        System.out.println(message);
    }

    @Override
    public void printInvalidCharacterInputError(String message) {
        System.out.println(message);
    }

    @Override
    public void printValidInputInfo(String message) {
        System.out.println(message);
    }
}
