//package Lesson14;
//
//import sun.misc.CEStreamExhausted;
//
//import java.net.BindException;
//import java.nio.file.AccessDeniedException;
//
//public class MethodsWithExceptions {
//
//    public static void first() throws AccessDeniedException {
//        //...some logic before...
//        throw new AccessDeniedException("file");
//    }
//
//    public static void second() throws BindException {
//        //...some logic before...
//        throw new BindException();
//    }
//
//    public static void third() throws CEStreamExhausted {
//        //...some logic before...
//        throw new CEStreamExhausted();
//    }
//}