import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Ura on 09.11.2017.
 */
public class Company {
    List<Person> personList = new ArrayList<> ();
    List<String> nameList = new ArrayList<> ();
    int ageRandom = 0;
    String name;

    void addName() {
        nameList.add ("Паша");
        nameList.add ("Анастасия");
        nameList.add ("Юра");
        nameList.add ("Анна");
        nameList.add ("Андрей");
        nameList.add ("Мария");
        nameList.add ("Игорь");
        nameList.add ("Сергей");
        nameList.add ("Алексей");
        nameList.add ("Дмитрий");
        nameList.add ("Вадим");
        nameList.add ("Ирина");
        nameList.add ("Ольга");
        nameList.add ("Ксения");
        nameList.add ("Алекс");

    }

    public void addPerson()
    {
        for (int i = 0; i < 10; i++) {
            ageRandom = (int)(Math.random()*47 + 18);
            int n = (int)(Math.random()*nameList.size());
            name = nameList.get(n);
            nameList.remove(n);
            this.personList.add(new Person(name, ageRandom));
        }
        
    }

    void showMiddleAgePersonA(List<Person> list) {
        System.out.println ();
        for (int i = 0; i < list.size (); i++) {
            if (list.get (i).getAge () > 25 && list.get (i).getAge () < 45){
                System.out.println (list.get (i).getName () + list.get (i).getAge ());
            }

        }
        void showMiddleAgePersonB(List<Person> list) {
        System.out.println ();
        list.stream ()
                .filter (person -> person.getAge () > 25)
                .filter (person -> person.getAge () < 45)
                .forEach (System.out::println);

    }
    }

    void showPersonStartsNameWithA(Stream<Person> stream) {
        System.out.println ();
        stream
                .filter (person -> person.getName ()
                        .startsWith ("А")).forEach (System.out::println);

    }
    void showPersonStartsNameWithAList(List<Person> list) {
        char [] mass;
        System.out.println ();
        for (Person person : list) {
            mass = person.getName().toCharArray();
            if (mass[0] == 'А') {
                System.out.println (person);

            }
        }

    }
    }



