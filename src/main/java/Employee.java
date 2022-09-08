public class Employee {
    private static int nextId = 0;
    private long id;
    private double salary;
    private String name;
    private String surname;

    public Employee(String name, String surname, double salary) throws FieldLengthLimitException, IncorrectSalaryException {
        this.id = nextId++;

        if (name.length() > 20) {
            throw new FieldLengthLimitException("Name should be less than 20 symbols");
        } else {
            this.name = name;
        }

        if (surname.length() > 20) {
            throw new FieldLengthLimitException("Surname should be less than 20 symbols");
        } else {
            this.surname = surname;
        }

        if (salary < 0) {
            throw new IncorrectSalaryException("Salary cannot be negative");
        } else {
            this.salary = salary;
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id = " + id +
                ", name = '" + name + '\'' +
                ", surname = '" + surname + '\'' +
                ", salary = " + salary +
                " $}";
    }
}