package com.jstarczewski.main;

import com.jstarczewski.util.BasePresenter;
import com.jstarczewski.util.BaseView;


/**
 * @author Jan
 * Duzy interfejs zawierajacy dwa mniejsze, w srodku BasePresenter
 * beda znajdowaly sie metody narzucajace funkcjonalnosc dla naszego
 * MainPresentera
 *
 * Analogicznei do View, tak samo narzuca one funkcjonalnosc dla MainView
 *
 *
 * Podejscie to pozwala nam przemyslec jakich funkcjonalnosci ptrzebujemy
 * Przykladowo w Presenter ->
 *      public List<Sensor> getData(String sensorId);
 * Wtedy w View ->
 *      public void showData(List<Sensor> data);
 *
 *
 *  Celem zastosowania MainContract jest odseparowanie logiki biznesowej od
 *  Interakcji uzytkownika (w naszym przypadku sa ta wywołania)
 *
 *
 * */


public interface MainContract {

    interface View extends BaseView<Presenter> {



    }

    interface Presenter extends BasePresenter {



    }

}
