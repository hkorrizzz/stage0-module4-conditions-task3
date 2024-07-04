package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if (salary < 0) {
            System.out.println("wrong input!");
        } else {
            double netSalary;
            if (salary <= 10000) {
                netSalary = salary - salary * 0.15;
            } else if (salary <= 20000) {
                netSalary = salary - salary * 0.18;
            } else {
                netSalary = salary - salary * 0.20;
            }
            System.out.println(netSalary);
        }
    }
}
