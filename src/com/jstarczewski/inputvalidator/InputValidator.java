package com.jstarczewski.inputvalidator;

import org.jetbrains.annotations.Contract;

import java.util.HashMap;

public class InputValidator {
    private static HashMap<String, Integer> commands;
    private static InputValidator validator =null;
    private static final String NAME_REGEX = "[0-9A-Za-zżźćńółęąśŻŹĆĄŚĘŁÓŃ]*";

    public static synchronized InputValidator getInstance(){
        if(validator == null)
        {
            validator = new InputValidator();
            commands = new HashMap<String, Integer>();
            commands.put("help", 0);
            commands.put("get", 1);
        }
        return validator;
    }
    public String validate(String args[]) {
     if(args!=null)
     {
        int neededArguments = commands.containsKey(args[0].toLowerCase())?commands.get(args[0].toLowerCase()):-1;
         if(args.length==neededArguments+1) {
             for (int i = 1; i < args.length - 1; i++) {

             if (!isAlpha(args[i]))
                 return "getHelp";
            }

             return args[0];
         }
     }
     return "getHelp";
    }


    private boolean isAlpha(String input) {
        return input.matches(NAME_REGEX);
    }
}
