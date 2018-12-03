package com.jstarczewski.inputvalidator;


import java.util.HashMap;

/**
 * Jak używasz IntelliJ IDEAD to polecam wyrobić nawyk Ctrl+Alt+L
 */

public class InputValidator {
    private static HashMap<String, Integer> commands;
    private static InputValidator validator = null;
    private static final String NAME_REGEX = "[0-9A-Za-zżźćńółęąśŻŹĆĄŚĘŁÓŃ]*";

    public static synchronized InputValidator getInstance(String[] input) {
        if (validator == null) {
            validator = new InputValidator();
            commands = new HashMap<String, Integer>();
            commands.put("help", 0);
            commands.put("get", 1);

            /**
             * Teoretycznie w konstruktorze a potem -> tylko getArgument / isValid / getCommand
             * */

            validate(input);
        }
        return validator;
    }

    // chyba private
    private static String validate(String args[]) {
        if (args != null) {

            /*
            int needArguments = commands.getOrDefault(args[0].toLowerCase(), -1);
            */
            int neededArguments = commands.containsKey(args[0].toLowerCase()) ? commands.get(args[0].toLowerCase()) : -1;
            if (args.length == neededArguments + 1) {


                /**
                 * args[0] get
                 * args[1] Krakow
                 * length = 2
                 * czy ten for sie wykona dla wszystkich argumentow ?
                 *
                 * */


                for (int i = 1; i < args.length - 1; i++) {

                    if (!isAlpha(args[i]))
                        return "getHelp";
                }

                /**
                 * Poustawiac pola w hash mapie lub cos aby z gettera mogl je dostac
                 *
                 * */

                return args[0];
            }
        }
        return "getHelp";
    }

    /**
     * public String getCommand() {
     *
     * }
     *
     * public String getArgument() {
     *
     * }
     * public boolean isValid() {
     *
     * }
     *
     */

    private static boolean isAlpha(String input) {
        return input.matches(NAME_REGEX);
    }
}
