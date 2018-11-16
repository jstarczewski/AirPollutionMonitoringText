package com.jstarczewski.main;

import com.jstarczewski.util.Messages;

public class MainPresenter implements MainContract.Presenter {

    /**
     * @author Jan
     * MainPresenter implementuje Presenter z przygotwana przez nas funkcjonalnsocia
     * znajdujaca sie w MainContract
     */


    /**
     * @author Jan
     * Dobrze byłoby gdyby błędy inputu zostały znalezione jeszcze zanim powstana obiekty odpowiadajace
     * za pobieranie danych itp. sprawy
     */

    private MainContract.View mainView;
    private static final String NAME_REGEX = "[A-Za-zżźćńółęąśŻŹĆĄŚĘŁÓŃ]*";
    private final String[] input;


    public MainPresenter(MainContract.View mainView, String... input) {
        this.mainView = mainView;
        this.input = input;
    }

    @Override
    public void start() {

        //prosty test uzytkownika koncowego
        for (int i = 0; i < input.length; i++)
            checkInput(input[i]);
    }

    @Override
    public void stop() {

    }

    @Override
    public void checkInput(String input) {

        /**
         * @author Jan
         * Zagłebione if-else -> nie najlepsze wyjście, do refactoru pewnie
         * */

        if (input == null)
            mainView.printNullPointerExceptionError("input" + Messages.Errors.IS_NULL);
        else {
            if (isAlpha(input)) {
                mainView.printValidInputInfo(input + Messages.Errors.CONTAINS_VALID_CHARACTERS);
            } else
                mainView.printInvalidCharacterInputError(input + Messages.Errors.CONTAINS_INVALID_CHARACTERS);
        }
    }

    @Override
    public void checkInstruction(String command) {
        if (isAlpha(command)) {
            if (isInstruction(command)) {
                executeInstruction(command);
            }
        }
    }

    @Override
    public void startGetPollutionProcedure() {
        /*
         * Starting GetPollutionPresenter with start() method
         * */
    }

    @Override
    public void executeInstruction(String instruction) {

    }

    private boolean isAlpha(String input) {
        return input.matches(NAME_REGEX);
    }

    private boolean isInstruction(String command) {
        for (Instruction instruction : Instruction.values()) {
            if (instruction.toString().equalsIgnoreCase(command))
                return instruction.isInstruction();
        }
        return false;
    }

}
