import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Ura on 10.11.2017.
 */
public class Main {
    public static void main(String[] args) {

        Company company = new Company ();
        company.addName ();
        company.addPerson ();
        company.showMiddleAgePersonA(company.personList);
        company.showMiddleAgePersonB(company.personList);
        company.showPersonStartsNameWithA (company.personList.stream ());
        company.showPersonStartsNameWithAList (company.personList);
    }
}
