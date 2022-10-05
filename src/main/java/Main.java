public class Main {
    public static void main(String[] args) {
        try {
            Manager CEO = new Manager("Obi wan", "Kenobi", "Management department", 3400, 500, null);
            Manager PM = new Manager("Luke", "Skywalker", "Management department", 2000, 400, CEO.getId());
            Manager marketingHead = new Manager("Anakin", "Skywalker", "Management department", 1800, 200, CEO.getId());

            Employee seniorEmp = new Employee("Boris", "Jonsonuk", "Application development", 1800, PM.getId());
            Employee juniorEmp = new Employee("Joel", "Miller", "Application development", 900, PM.getId());

            Employee middleBA = new Employee("Mark", "Walter", "Analytic department", 1200, marketingHead.getId());
            Employee juniorBA = new Employee("Elly", "Mitchel", "Analytic department", 800, marketingHead.getId());

            CEO.add(PM);
            CEO.add(marketingHead);

            PM.add(seniorEmp);
            PM.add(juniorEmp);

            marketingHead.add(middleBA);
            marketingHead.add(juniorBA);

            System.out.println(CEO.toString());

            for (Employee head : CEO.getSubordinates()) {
                System.out.println(head.toString());
                for (Employee emp : head.getSubordinates()) {
                    System.out.println(emp.toString());
                }
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}