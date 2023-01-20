public class Worker {
    int id, salary;
    String firstName, lastName;

    @Override
    public String toString() {
        return String.format("id: %i, %f %l, Зарплата: %s", id, firstName, lastName, salary);
    }

    @Override
    public boolean equals(Object obj) {
        Worker w = (Worker) obj;
        return id == w.id && firstName == w.firstName &&
            lastName == w.lastName && salary == w.salary; 
    }

    @Override
    public int hashCode() {
        return id;
    }
}
