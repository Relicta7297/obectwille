package ru.manavaz.objectwille.core.town;

import java.util.List;

public interface Locality {

    /**
     * Возвращает все улицы текущего населенного пункта
     * @return Лист улиц
     */
    List<Street> getStreets();

    /**
     * Добавляет улицу в текущий населенный пункт
     * @param street Улица
     */
    void addStreet(Street street);

    /**
     * Возвращает имя населеного пункта
     * @return имя населенного пункта
     */
    String getName();

}
