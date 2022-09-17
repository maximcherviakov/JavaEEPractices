import java.util.Objects;

public class Employee {
    protected static int nextId = 0;
    protected long id;
    protected long managerId;
    protected double salary;
    protected String name;
    protected String surname;
    protected String departmentName;

    public Employee(String name, String surname, String departmentName, double salary) throws FieldLengthLimitException, IncorrectSalaryException {
        this.id = nextId++;
        this.departmentName = departmentName;
        this.managerId = this.id;

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

    public Employee(String name, String surname, String departmentName, double salary, long managerId) throws FieldLengthLimitException, IncorrectSalaryException {
        this(name, surname, departmentName, salary);
        this.managerId = managerId;
    }

    public long getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id &&
                managerId == employee.managerId &&
                Double.compare(employee.salary, salary) == 0 &&
                Objects.equals(name, employee.name) &&
                Objects.equals(surname, employee.surname) &&
                Objects.equals(departmentName, employee.departmentName);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id = " + id +
                ", managerId = " + managerId +
                ", name = '" + name + '\'' +
                ", surname = '" + surname + '\'' +
                ", departmentName = '" + departmentName + '\'' +
                ", salary = " + salary +
                " $}";
    }
}