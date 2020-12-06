package ru.manavaz.town;

import ru.manavaz.bulding.Building;
import ru.manavaz.bulding.Tualet;

import java.util.ArrayList;
import java.util.List;

public class SimpleTown implements Locality{
    private List<Street> streets;
    private String name;

    public SimpleTown(String name){
        this.name = name;
        this.streets = new ArrayList<>();
    }


    @Override
    public List<Street> getStreets() {
        return streets;
    }

    @Override
    public void addStreet(Street street) {
        streets.add(street);

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "SimpleTown{ \nname='" + name + '\'' +",  \nstreets=" + streets + '}';
    }

    public static void main(String[] args) {
        SimpleTown town = new SimpleTown("Oblomov");

        Street street1 = new Street("Первая");
        Tualet tualet1 = new Tualet();
        street1.addBuilding(tualet1);

        Street street2 = new Street("Вторая");
        street2.addBuilding(new Tualet());
        street2.addBuilding(new Tualet());

        town.addStreet(street1);
        town.addStreet(street2);

        System.out.println(town.toString());


    }


}
