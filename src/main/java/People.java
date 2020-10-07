import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class People <E extends Person> implements Iterable {
    private List<E> personList = new ArrayList<E>();

    public void add(E person){
        personList.add(person);
    }

    public List<E> getPersonList(){
        return personList;
    }

    public E findByID(Long ID){
        for (E person:personList) {
            if(person.getId() == ID){
                return person;
            }
        }
        return null;
    }

    public boolean contains(E person){
        if(personList.contains(person)){
            return true;
        }
        else return false;
    }

    public void remove(E person){
        personList.remove(person);
    }

    public void removeById(Long ID){
        for (Person person : personList){
            if(person.getId() == ID){
                personList.remove(person);
            }
        }
    }

    public void removeAll(){
        personList.clear();
    }

    public int count(){
        return personList.size();
    }

    public abstract E[] toArray();


    public Iterator<E> iterator() {
        return personList.iterator();
    }
}
