public class Main {
    public static void main(String[] args) {
        WorkersRegistry registry = WorkersRegistry.getInstance();
        WorkersRegistry registryCopy = WorkersRegistry.getInstance();

        Manager manager1;
        Manager manager2;
        Employee employee = null;

        try {
            manager1 = new Manager("Obi wan", "Kenobi", "Training department", 2400, 500);
            manager2 = new Manager("Anakin", "Skywalker", "Innovations", 1800, 200, manager1.getId());
            employee = new Employee("Luke", "Skywalker", "Research", 2000, manager2.getId());

            registry.addWorker(manager1);
            registry.addWorker(manager2);
            registry.addWorker(employee);

            registry.printList();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        try {
            registryCopy.addWorker(employee);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}