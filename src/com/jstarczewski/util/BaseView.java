package com.jstarczewski.util;

public interface BaseView<T> {

    /**
     * @author Jan
     * Prawdopodobnie nasza aplikacja bedzie działała przy wywołaniu,
     * w przypadku jakbysmy włączyli ja i nasłuchiwali to start() i
     * stop() byłyby naprawde potrzebne, jednak w naszym wypadku dopisałem
     * je glownie dla zasady
     *
     *
     * setPresenter(T presenter) -> podstawa do ustawienia View (interfejsu tekstowego)
     * planuje rozwiazac to w sposoób taki, ze w zaleznosci od wywolania podstawi sie inny view
     * czyli plik reprezentujacy interfejs tekstowy. Zrezygnujemy w ten sposob z jednej ogromnej fasady,
     * dzielac ja na pare mniejszych fasad
     *
     */

    void setPresenter(T presenter);

    void stop();

    void printNullPointerExceptionError(String message);

}
