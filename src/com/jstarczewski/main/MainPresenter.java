package com.jstarczewski.main;

import com.jstarczewski.util.Messages;

public class MainPresenter implements MainContract.Presenter {

    /**
     * @author Jan
     * MainPresenter implementuje Presenter z przygotwana przez nas funkcjonalnsocia
     * znajdujaca sie w MainContract
     */

    private MainContract.View mainView;
    private static final String NAME_REGEX = "[A-Za-zżźćńółęąśŻŹĆĄŚĘŁÓŃ]*";


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
            mainView.printValidInputInfo(input + Messages.Errors.CONTAINS_VALID_CHARACTERS);
        else
            mainView.printInvalidCharacterInputError(input + Messages.Errors.CONTAINS_INVALID_CHARACTERS);
    }

    private boolean isAlpha(String input) {
        return input.matches(NAME_REGEX);
    }

}
