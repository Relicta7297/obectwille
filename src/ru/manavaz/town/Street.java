package ru.manavaz.town;

import ru.manavaz.bulding.Building;
import ru.manavaz.bulding.Tualet;

import java.util.HashMap;
import java.util.Map;

public class Street {
    private String name;
    private Map<Integer, Building> buildings;

    // конструктор класса - в нем создается объект(вызывается при помощи "new %ClassName%")
    public Street(String name){
        this.name = name;
        this.buildings = new HashMap<>();
    }

    public void addBuilding(Building building){
        buildings.put(buildings.size()+1, building);
    }

    public String getName() {
        return name;
    }

    public Map<Integer, Building> getBuildings() {
        return buildings;
    }

    @Override
    public String toString() {
        return name + " St." + " {\n\t" + buildings.toString() + "\n}";
    }

    /**
     * Тест создания улицы
     */
    public static void main(String[] args) {
        Street street = new Street("Krivor");
        Tualet tualet = new Tualet();
        street.addBuilding(tualet);
        System.out.println(street.toString());
    }
}
