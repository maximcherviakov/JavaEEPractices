public class Manager extends Employee {
    private double bonus;

    public Manager(String name, String surname, String departmentName, double salary, double bonus) throws FieldLengthLimitException, IncorrectSalaryException {
        super(name, surname, departmentName, salary);
        this.bonus = bonus;
    }

    public Manager(String name, String surname, String departmentName, double salary, double bonus, long managerId) throws FieldLengthLimitException, IncorrectSalaryException {
        super(name, surname, departmentName, salary, managerId);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "id = " + id +
                ", managerId = " + managerId +
                ", name = '" + name + '\'' +
                ", surname = '" + surname + '\'' +
                ", departmentName = '" + departmentName + '\'' +
                ", salary = " + salary + " $" +
                ", bonus = " + bonus + " $" +
                '}';
    }
}