public class Main {
    public static void main(String[] args) {
        Employee employee;

        // correct case
        try {
            employee = new Employee("Luke", "Skywalker", 7000);
            System.out.println(employee.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //incorrect case: surname is too big
        try {
            employee = new Employee("Anakin", "Skywalker from Tatooine, Darth Vader, Dart Lord", -100);
            System.out.println(employee.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //incorrect case: negative salary
        try {
            employee = new Employee("Anakin", "Skywalker", -100);
            System.out.println(employee.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}