import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People implements Iterable {
    List<Person> personList = new ArrayList<Person>();

    public void add(Person person){
        personList.add(person);
    }

    public Person findByID(Long ID){
        for (Person person:personList) {
            if(person.getId() == ID){
                return person;
            }
        }
        return null;
    }

    public boolean contains(Person person){
        if(personList.contains(person)){
            return true;
        }
        else return false;
    }

    public void remove(Person person){
        personList.remove(person);
    }

    public void removeAll(Person person){
        personList.clear();
    }

    public int count(){
        return personList.size();
    }

    public Person[] toArray(){
        return (Person []) personList.toArray();
    }


    public Iterator iterator() {
        return personList.iterator();
    }
}
