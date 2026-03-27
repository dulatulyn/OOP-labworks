package labwork3.problem4;

import java.util.Date;
import java.util.Objects;
import java.util.Vector;

public class Manager extends Employee {
    private Vector<Employee> team;
    private double bonus;

    public Manager() {
        super();
        this.team = new Vector<>();
        this.bonus = 0;
    }

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.team = new Vector<>();
        this.bonus = bonus;
    }

    public Manager(String name, double salary, Date hireDate, String nin, double bonus) {
        super(name, salary, hireDate, nin);
        this.team = new Vector<>();
        this.bonus = bonus;
    }

    public double getBonus() { return bonus; }
    public void setBonus(double bonus) { this.bonus = bonus; }
    public Vector<Employee> getTeam() { return team; }

    public void addEmployee(Employee e) {
        team.add(e);
    }

    public void removeEmployee(Employee e) {
        team.remove(e);
    }

    @Override
    public int compareTo(Employee other) {
        int result = super.compareTo(other);
        if (result != 0) return result;
        if (other instanceof Manager) {
            return Double.compare(this.bonus, ((Manager) other).bonus);
        }
        return 0;
    }

    @Override
    public String toString() {
        return super.toString() + " | Bonus: " + bonus + " | Team size: " + team.size();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Manager)) return false;
        if (!super.equals(obj)) return false;
        return Double.compare(bonus, ((Manager) obj).bonus) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), bonus);
    }

    @Override
    public Manager clone() {
        Manager cloned = (Manager) super.clone();
        cloned.team = new Vector<>(team);
        return cloned;
    }
}
