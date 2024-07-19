package entities;

import entities.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.List;

/**
 * @author joaovictorcmd
 * @date 2024 Jul 18
 */
public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private Department department;
    private final List<HourContract> contracts = new ArrayList<>();

    public Worker() {
    }

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    public void addContract(HourContract contract) {
        this.getContracts().add(contract);
    }

    public void removeContract(HourContract contract) {
        this.getContracts().remove(contract);
    }

    public Double income(Integer year, Integer month) {
        double sum = getBaseSalary();

        for (HourContract contract : this.getContracts()) {
            int contractYear = contract.getDate().getYear();
            int contractMonth = contract.getDate().getMonthValue();

            if (year == contractYear && month == contractMonth) {
                sum += contract.totalValue();
            }
        }
        return sum;
    }
}
