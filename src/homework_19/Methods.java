package homework_19;

import java.io.*;

public class Methods {

    public static void serialize(Serializable obj, File file) throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
        objectOutputStream.writeObject(obj);
        objectOutputStream.close();
    }

    public static Object deserialize(File file) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
        Object object = objectInputStream.readObject();
        objectInputStream.close();
        return object;
    }

}
