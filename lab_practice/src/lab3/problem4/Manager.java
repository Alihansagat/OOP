package lab3.problem4;

import java.util.Vector;

public class Manager extends Employee {
    private Vector<Employee> team;
    private double bonus;

    public Manager() {
        super();
        this.team = new Vector<>();
        this.bonus = 0;
    }

    public Manager(String name, double salary, java.util.Date hireDate,
                   String insuranceNumber, double bonus) {
        super(name, salary, hireDate, insuranceNumber);
        this.team = new Vector<>();
        this.bonus = bonus;
    }

    public void addEmployee(Employee e) {
        team.add(e);
    }

    public Vector<Employee> getTeam() {
        return team;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Manager{name='" + name +
                "', salary=" + salary +
                ", bonus=" + bonus +
                ", hireDate=" + hireDate +
                ", teamSize=" + team.size() + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        if (!(obj instanceof Manager)) return false;

        Manager other = (Manager) obj;

        return bonus == other.bonus &&
                team.equals(other.team);
    }

    @Override
    public int compareTo(Employee other) {
        if (other instanceof Manager) {
            Manager m = (Manager) other;

            int salaryCompare = Double.compare(this.salary, m.salary);

            if (salaryCompare != 0)
                return salaryCompare;

            return Double.compare(this.bonus, m.bonus);
        }

        return super.compareTo(other);
    }

    @Override
    public Manager clone() {
        Manager cloned = (Manager) super.clone();
        cloned.team = new Vector<>(this.team); // shallow copy
        return cloned;
    }
}