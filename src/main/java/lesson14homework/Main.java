package lesson14homework;

import java.io.FileReader;
import java.io.IOException;
import java.rmi.server.ExportException;

public class Main {
    public static void main(String[] args) throws Exception {

        tryCatchFinally();
        tryCatchCatchFinally();
        threeCatchCatchCatchFinally();
        tryWithResourcesCatchFinally();
        tryFinally();
    }

    public static void tryCatchFinally() throws Exception {

        try {
            SecondClass.firstMethodSC();
            SecondClass.secondMethodSC();
            SecondClass.thirdMethodSC();

        } catch (ExportException | InstantiationException | IndexOutOfBoundsException q) {
            System.out.println("tryCatchFinally();" + q);
        } finally {
            System.out.println("tryCatchFinally();" + "\n");
        }
    }

    public static void tryCatchCatchFinally() throws Exception {

        try {
            SecondClass.firstMethodSC();
            SecondClass.secondMethodSC();
            SecondClass.thirdMethodSC();

        } catch (ExportException | InstantiationException q) {
            System.out.println("tryCatchCatchFinally();" + q);

        } catch (IndexOutOfBoundsException q) {
            System.out.println("tryCatchCatchFinally();" + q);

        } finally {
            System.out.println("tryCatchCatchFinally();" + "\n");
        }
    }

    public static void threeCatchCatchCatchFinally() throws Exception {

        try {
            SecondClass.firstMethodSC();
            SecondClass.secondMethodSC();
            SecondClass.thirdMethodSC();

        } catch (ExportException q) {
            System.out.println("tryCatchCatchCatchFinally();" + q);

        } catch (InstantiationException q) {
            System.out.println("tryCatchCatchCatchFinally();" + q);

        } catch (IndexOutOfBoundsException q) {
            System.out.println("tryCatchCatchCatchFinally();" + q);

        } finally {
            System.out.println("tryCatchCatchCatchFinally();" + "\n");
        }
    }

    public static void tryWithResourcesCatchFinally() throws Exception {
        String path = "C:/Hillel/src/main/resources/lesson14/file.txt";
        try (FileReader fileReader = new FileReader(path)) {
            try {
                SecondClass.firstMethodSC();
                SecondClass.secondMethodSC();
                SecondClass.thirdMethodSC();

            } catch (ExportException | InstantiationException | IndexOutOfBoundsException q) {
                System.out.println("tryWithResourcesCatchFinally()" + q);
            }
        } catch (IOException q) {
            System.out.println("tryWithResourcesCatchFinally() " + q);

        } finally {
            System.out.println("tryWithResourcesCatchFinally();" + "\n");
        }
    }

    public static void tryFinally() throws Exception {

        try {
            SecondClass.firstMethodSC();
            SecondClass.secondMethodSC();
            SecondClass.thirdMethodSC();
        } catch (ExportException | InstantiationException | IndexOutOfBoundsException q) {
            System.out.println("try-finally:)");
        } finally {
            System.out.println("try-finally" + "\n");
        }
    }
}
