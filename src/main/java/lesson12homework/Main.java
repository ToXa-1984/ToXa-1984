package lesson12homework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

//        ArrayList list = new ArrayList();
//        list = FirstMainMethod(list);
//        list = SecondMainMethod(list);
//        ThirdMainMethod(list);

        HashSet hashSet = new HashSet();
        hashSet = FirstHashMethod(hashSet);
        hashSet = SecondHashMethod(hashSet);
        ThirdHashMethod(hashSet);

    }

    public static ArrayList FirstMainMethod(ArrayList list) {

        FirstClass firstClass = new FirstClass();
        SecondClass secondClass = new SecondClass();
        ThirdClass thirdClass = new ThirdClass();

        if (list.isEmpty()) {
            list.add(firstClass);
            list.add(firstClass);
            list.add(firstClass);
            list.add(firstClass);
            list.add(firstClass);
            list.add(firstClass);
        }

        list.add(0, secondClass);
        list.add(0, secondClass);
        list.add(0, secondClass);

        list.set(6, thirdClass);
        list.set(7, thirdClass);
        list.set(8, thirdClass);

        return list;
    }

    public static ArrayList SecondMainMethod(ArrayList list) {
        int fClass = 0;
        int sClass = 0;
        int tClass = 0;
        ArrayList listNew = new ArrayList();

        for (Object o : list) {
            if (o instanceof FirstClass & fClass < 2) {
                fClass++;
                listNew.add(o);
            } else if (o instanceof SecondClass & sClass < 2) {
                sClass++;
                listNew.add(o);
            } else if (o instanceof ThirdClass & tClass < 2) {
                tClass++;
                listNew.add(o);
            } else if (tClass > 1 & sClass > 1 & fClass > 1) {
                return listNew;
            }
        }

        return listNew;
    }

    public static void ThirdMainMethod(ArrayList list) {

        for (Object o : list) {
            if (o instanceof FirstClass) {
                ((FirstClass) o).FirstMethod("name in MainMethod");
            }

            if (o instanceof SecondClass) {
                ((SecondClass) o).SecondMethod(10);
            }

            if (o instanceof ThirdClass) {
                ((ThirdClass) o).ThirdMethod();
            }
        }

        list.clear();
    }

    public static HashSet FirstHashMethod(HashSet set) {

        if (set.isEmpty()) {
            set.add(new FirstClass("Name 1"));
            set.add(new FirstClass("Name 2"));
            set.add(new FirstClass("Name 3"));
            set.add(new FirstClass("Name 4"));
            set.add(new FirstClass("Name 5"));
            set.add(new FirstClass("Name 6"));
        }


        set.add(new SecondClass(5));
        set.add(new SecondClass(5));
        set.add(new SecondClass(5));

        int sizeSet = set.size();
        int counterSet = 0;
        Object[] arrSet = new Object[3];
        for (Object o : set) {
            if (counterSet >= sizeSet - 3) {
                arrSet[counterSet - (sizeSet - 3)] = o;
            }
            counterSet++;
        }

        for (int i = 0; i < arrSet.length; i++) {
            set.remove(arrSet[i]);
        }

        set.add(new ThirdClass());
        set.add(new ThirdClass());
        set.add(new ThirdClass());

        return set;
    }

    public static HashSet SecondHashMethod(HashSet myHashSet) {

        int fClass = 0;
        int sClass = 0;
        int tClass = 0;

        Iterator iterator = myHashSet.iterator();
        iterator.hasNext();
        iterator.next();

        HashSet newHashSet = new HashSet();

        for (Object o : myHashSet) {
            if (o instanceof FirstClass & fClass < 2) {
                fClass++;
                newHashSet.add(o);
            } else if (o instanceof SecondClass & sClass < 2) {
                sClass++;
                newHashSet.add(o);
            } else if (o instanceof ThirdClass & tClass < 2) {
                tClass++;
                newHashSet.add(o);
            } else if (tClass > 1 & sClass > 1 & fClass > 1) {
                return newHashSet;
            }
        }
        return newHashSet;
    }

    public static void ThirdHashMethod(HashSet myHashSet) {

        for (Object o : myHashSet) {
            if (o instanceof FirstClass) {
                ((FirstClass) o).FirstMethod("Hash name");
            }
            if (o instanceof SecondClass) {
                ((SecondClass) o).SecondMethod(10);
            }
            if (o instanceof ThirdClass) {
                ((ThirdClass) o).ThirdMethod();
            }
        }

        myHashSet.clear();
    }
}

