package homework_16;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.Annotated;
import homework_5.hw5_1.Dog;

import java.lang.reflect.*;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException,
            InstantiationException, NoSuchFieldException {

        Class<Cat> cats = Cat.class;

        System.out.println("Class name - " + cats.getName());
        System.out.println("Simple class name - " + cats.getSimpleName());
        System.out.println("Modifier - " + cats.getModifiers());
        System.out.println("Public modifier -" + Modifier.isPublic(cats.getModifiers()));
        System.out.println("Abstract modifier -" + Modifier.isAbstract(cats.getModifiers()));
        System.out.println("Private modifier -" + Modifier.isPrivate(cats.getModifiers()));
        System.out.println("Is interface -" + Modifier.isInterface(cats.getModifiers()));
        System.out.println("Class package - " + cats.getPackage());
        System.out.println("Cat superclass - " + cats.getSuperclass());

        System.out.println();
        Constructor[] cons = cats.getConstructors();
        for (Constructor constructor : cons) {
            System.out.println(constructor);
        }
        System.out.println();
        System.out.println("First constructor parameters");
        Constructor<?> constructor = cons[0];
        Class[] parametrs = constructor.getParameterTypes();
        for (Class param : parametrs) {
            System.out.println(param);
        }
        System.out.println();

        System.out.println();
        System.out.println("\nClass " + cats.getSimpleName() + " has fields: ");
        Field[] commodityFields = cats.getDeclaredFields();
        for (Field field : commodityFields) {
            System.out.println("Field - " + field);
        }

        System.out.println();
        System.out.println("Class " + cats.getSimpleName() + " has nex methods: ");
        Method[] catsMethods = cats.getMethods();
        for (Method method : catsMethods) {
            System.out.println("Method: " + method);
        }

        //adding new dog with reflection
        Constructor<Cat> cat1 = cats.getConstructor(String.class, Integer.class, int.class, String.class);
        Cat newInstance = cat1.newInstance("Murchyk", 12, 3, "black");
        System.out.println(newInstance);

        //changes in field
        System.out.println();
        Field fieldName = cats.getField("colour");
        fieldName.set(newInstance, "red");
        System.out.println(newInstance);
        System.out.println();

        System.out.println("Class interfaces: ");
        Class[] interfaces = cats.getInterfaces();
        for (Class interf : interfaces) {
            System.out.println(interf);
        }

        System.out.println("Class annotated interfaces: ");
        AnnotatedType[] interfacesAnnotated = cats.getAnnotatedInterfaces();
        for (AnnotatedType interfAn : interfacesAnnotated) {
            System.out.println(interfAn);
        }
    }
}
