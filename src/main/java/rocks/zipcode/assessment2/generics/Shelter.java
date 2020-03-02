package rocks.zipcode.assessment2.generics;


import rocks.zipcode.assessment2.generics.ageable.Ageable;

import java.util.ArrayList;

/**
 * Shelter is a generic class that holds Objects that extends `Ageable`.
 * For example, if a Person and a Dog extends Ageable, then I can declare the following:
 * <p>
 * Shelter<Person> farmHouse = new Shelter<Person>();
 * Shelter<Dog> dogHouse = new Shelter<Dog>();
 */
public class Shelter<_> {

    ArrayList<Ageable> things;

    public Shelter() {
        things = new ArrayList<>();
        //throw new NullPointerException();
    }

    /**
     * @return the number of item in the shelter
     */
    public int size() {
        return things.size();
    }

    public void add(Object object) {
        things.add((Ageable) object);
    }

    public Boolean contains(Object object) {
        return null;
    }

    public void remove(Object object) {
        Ageable unknown = new Ageable() {};
        int index = 0;
        for(int x = 0; x <= things.size() -1; x++){
            if(things.get(x).equals(object)){
                index = x;
                break;
            }
        }
        things.remove(object);
    }

    public Object get(Integer index) {
        return null;
    }

    public Integer getIndexOf(Object ageable) {
        return 0;
    }
}