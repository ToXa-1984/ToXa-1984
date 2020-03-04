package lesson13homework;

import java.util.*;

abstract class FirstClass {

    private ArrayList myList;
    private HashSet mySet;
    private HashMap myMap;

    public FirstClass() {
    }

    public ArrayList getMyList() {
        return myList;
    }

    public void setMyList(ArrayList myList) {
        this.myList = myList;
    }

    public HashSet getMySet() {
        return mySet;
    }

    public void setMySet(HashSet mySet) {
        this.mySet = mySet;
    }

    public HashMap getMyMap() {
        return myMap;
    }

    public void setMyMap(HashMap myMap) {
        this.myMap = myMap;
    }
}
