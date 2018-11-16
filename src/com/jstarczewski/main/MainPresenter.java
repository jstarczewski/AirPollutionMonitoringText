package com.jstarczewski.main;

public class MainPresenter implements MainContract.Presenter {

    /**
     * @author Jan
     * MainPresenter implementuje Presenter z przygotwana przez nas funkcjonalnsocia
     * znajdujaca sie w MainContract
     */

    private MainContract.View mainView;
    private final String NAME_REGEX = "[A-Za-zżźćńółęąśŻŹĆĄŚĘŁÓŃ]*";



    public MainPresenter(MainContract.View mainView) {
        this.mainView = mainView;
    }


    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void checkInput(String input) {
        if (isAlpha(input))
            mainView.printValidInputInfo();
        else
            mainView.printInvalidCharacterInputError("Error");
    }

    private boolean isAlpha(String input) {
        return input.matches(NAME_REGEX);
    }

}
