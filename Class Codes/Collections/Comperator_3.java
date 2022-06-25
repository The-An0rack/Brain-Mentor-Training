import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

class Emp {
    int id;
    String name;
    Double salary;

    Emp(int id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ID: " + id + " Name: " + name + " Salary: " + salary + "\n";
    }
}

class Test{

    public static void main(String[] args) {
        List<Emp> list = new ArrayList();
        list.add(new Emp(01, "Dewashish Mehta", 100000.0));
        list.add(new Emp(02, "Tommy Vercetti", 80000.0));
        list.add(new Emp(03, "Carl Johenson", 90000.0));
        Collections.sort(list, (first,second) -> Integer.valueOf(second.id).compareTo(first.id));
        System.out.println(list);
    }
}