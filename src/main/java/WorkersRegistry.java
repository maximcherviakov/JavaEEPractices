import java.util.LinkedList;
import java.util.List;

public class WorkersRegistry {
    private static final List<Employee> workers = new LinkedList<>();
    private static WorkersRegistry instance = null;

    private WorkersRegistry() {
    }

    public static WorkersRegistry getInstance() {
        if (instance == null) {
            instance = new WorkersRegistry();
        }
        return instance;
    }

    public void addWorker(Employee employee) throws EmployeeInRegistryException {
        for (Employee emp : workers) {
            if (employee.equals(emp)) {
                throw new EmployeeInRegistryException(employee.toString() + " was already added to registry");
            }
        }
        workers.add(employee);
    }

    public void printList() {
        for (Employee employee : workers) {
            if (employee.getClass().getSimpleName().equals(Manager.class.getSimpleName())) {
                System.out.println(employee.toString());
            } else {
                System.out.println(employee.toString());
            }
        }
    }
}
