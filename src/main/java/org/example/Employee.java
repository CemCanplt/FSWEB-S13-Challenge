package org.example;

public class Employee {
    private long id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthPlans;

    public Employee(long id, String fullName, String email, String password, String[] healthPlans) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthPlans = healthPlans;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String[] getHealthPlans() {
        return healthPlans;
    }

    public void setHealthPlans(String[] healthPlans) {
        this.healthPlans = healthPlans;
    }

    public void addHealthPlan(int index, String name) {
        if (index >= 0 && index < healthPlans.length) {
            if (healthPlans[index] == null) {
                healthPlans[index] = name;
            } else {
                System.out.println("Index " + index + " zaten dolu.");
            }
        } else {
            System.out.println("Index " + index + " geçersiz.");
        }
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", fullName='" + fullName + "', email='" + email + "'}";
    }
}
