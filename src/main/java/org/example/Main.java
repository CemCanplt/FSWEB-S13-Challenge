package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        // İşlemleri başka bir metoda taşıyoruz.
        runOperations();
    }

    public static void runOperations() {
        // Healthplan oluşturma
        Healthplan healthplan1 = new Healthplan(1, "Plan A", Plan.BASIC);
        Healthplan healthplan2 = new Healthplan(2, "Plan B", Plan.PREMIUM);

        // Employee oluşturma
        String[] healthplansArray = new String[5];
        Employee employee = new Employee(1, "Cem Yılmaz", "cem@example.com", "password123", healthplansArray);

        // Healthplan ekleme
        employee.addHealthPlan(0, healthplan1.getName());
        employee.addHealthPlan(1, healthplan2.getName());
        employee.addHealthPlan(1, "Zaten dolu olmalı!");

        // Company oluşturma
        String[] developersArray = new String[3];
        Company company = new Company(1, "Example Co.", 100000.0, developersArray);

        // Employee ekleme
        company.addEmployee(0, "Cem Yılmaz");
        company.addEmployee(0, "Zaten dolu olmalı!");
        company.addEmployee(3, "Hatalı index!");

        // Sonuçları yazdırma
        System.out.println(healthplan1);
        System.out.println(healthplan2);
        System.out.println(employee);
        System.out.println(company);
    }
}
