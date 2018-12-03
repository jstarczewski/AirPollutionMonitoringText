package com.jstarczewski.util;


public interface BasePresenter {

    /**
     * @author Jan
     * Prawdopodobnie nasza aplikacja bedzie działała przy wywołaniu,
     * w przypadku jakbysmy włączyli ja i nasłuchiwali to start() i
     * stop() byłyby naprawde potrzebne, jednak w naszym wypadku dopisałem
     * je glownie dla zasady
     * */

    void start();

    void stop();
}
