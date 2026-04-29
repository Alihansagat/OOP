package lab3.problem4;

import java.util.Date;


public class Employee extends Person implements Comparable<Employee>, Cloneable {
    protected double salary;
    protected Date hireDate;
    protected String insuranceNumber;

    public Employee() {
        super();
        this.salary = 0;
        this.hireDate = new Date();
        this.insuranceNumber = "";
    }

    public Employee(String name, double salary, Date hireDate, String insuranceNumber) {
        super(name);
        this.salary = salary;
        this.hireDate = hireDate;
        this.insuranceNumber = insuranceNumber;
    }

    public double getSalary() {
        return salary;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public String getInsuranceNumber() {
        return insuranceNumber;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public void setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', salary=" + salary +
                ", hireDate=" + hireDate +
                ", insuranceNumber='" + insuranceNumber + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        if (!(obj instanceof Employee)) return false;

        Employee other = (Employee) obj;

        return salary == other.salary &&
                hireDate.equals(other.hireDate) &&
                insuranceNumber.equals(other.insuranceNumber);
    }

    @Override
    public int compareTo(Employee other) {
        return Double.compare(this.salary, other.salary);
    }

    @Override
    public Employee clone() {
        try {
            Employee cloned = (Employee) super.clone();
            cloned.hireDate = (Date) hireDate.clone(); // deep copy
            return cloned;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}