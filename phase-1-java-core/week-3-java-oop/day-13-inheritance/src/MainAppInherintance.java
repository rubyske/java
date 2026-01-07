package src;

public class MainAppInherintance {
    public static void main(String[] args) {
        EmployeInheritance emp1 = new BackendDeveloper();
        EmployeInheritance emp2 = new FrontendDeveloper();

        emp1.work();
        emp2.work();
    }
}
