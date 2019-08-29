package IO;

import java.io.*;

public class SereliazePerson {

    public static void main(String[] args) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data/person.dat"))) {
            Person simplePerson = new Person("Ivan", 23);
            oos.writeObject(simplePerson);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data/person.dat"))) {
            Person person = (Person)ois.readObject();
            System.out.println(person);
        }catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }catch (IOException e)
        {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
