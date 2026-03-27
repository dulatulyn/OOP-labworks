package labwork3.problem4;

import java.util.Date;
import java.util.Objects;

public class Employee extends Person implements Comparable<Employee>, Cloneable {
    private double salary;
    private Date hireDate;
    private String nationalInsuranceNumber;

    public Employee() {
        super();
        this.salary = 0;
        this.hireDate = new Date();
        this.nationalInsuranceNumber = "";
    }

    public Employee(String name, double salary) {
        super(name);
        this.salary = salary;
        this.hireDate = new Date();
        this.nationalInsuranceNumber = "";
    }

    public Employee(String name, double salary, Date hireDate, String nationalInsuranceNumber) {
        super(name);
        this.salary = salary;
        this.hireDate = hireDate;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    public double getSalary() { return salary; }
    public Date getHireDate() { return hireDate; }
    public String getNationalInsuranceNumber() { return nationalInsuranceNumber; }

    public void setSalary(double salary) { this.salary = salary; }
    public void setHireDate(Date hireDate) { this.hireDate = hireDate; }
    public void setNationalInsuranceNumber(String nin) { this.nationalInsuranceNumber = nin; }

    @Override
    public int compareTo(Employee other) {
        return Double.compare(this.salary, other.salary);
    }

    @Override
    public String toString() {
        return getName() + " | Salary: " + salary + " | Hired: " + hireDate + " | NIN: " + nationalInsuranceNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Employee)) return false;
        if (!super.equals(obj)) return false;
        Employee other = (Employee) obj;
        return Double.compare(salary, other.salary) == 0
                && Objects.equals(hireDate, other.hireDate)
                && Objects.equals(nationalInsuranceNumber, other.nationalInsuranceNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), salary, hireDate, nationalInsuranceNumber);
    }

    @Override
    public Employee clone() {
        try {
            Employee cloned = (Employee) super.clone();
            cloned.hireDate = (Date) hireDate.clone();
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
