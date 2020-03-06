package lesson14homework;

import java.rmi.server.ExportException;

public class FirstClass {

    public static void firstMethodFCException () throws ExportException {

        throw new ExportException("Exception number one");
    }

    public static void secondMethodFCException() throws InstantiationException {

        throw new InstantiationException("Exception number two");
    }

    public static void thirdMethodFCException() throws IndexOutOfBoundsException {

        throw new IndexOutOfBoundsException("Exception number three");
    }
}
