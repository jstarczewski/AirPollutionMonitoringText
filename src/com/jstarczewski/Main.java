package com.jstarczewski;

import com.jstarczewski.main.MainPresenter;
import com.jstarczewski.main.MainView;

public class Main {

    public static void main(String[] args) {
        // write your code here

        MainPresenter mainPresenter = new MainPresenter(new MainView());
        for (int i = 0; i<args.length; i++) {
            mainPresenter.checkInput(args[i]);
        }

    }
}
