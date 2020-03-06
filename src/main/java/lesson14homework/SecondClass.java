package lesson14homework;

import java.rmi.server.ExportException;

public class SecondClass {
    public static void firstMethodSC() throws ExportException {

        FirstClass.firstMethodFCException();
    }

    public static void secondMethodSC() throws InstantiationException {

        FirstClass.secondMethodFCException();
    }

    public static void thirdMethodSC() throws IndexOutOfBoundsException {

        FirstClass.thirdMethodFCException();
    }
}
