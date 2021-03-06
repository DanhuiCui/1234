/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Fitness.DietList;
import Business.Fitness.FitnessList;
import Business.Models.VipCustomer;
import Business.Role.Role;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author raunak
 */
public class UserAccount {
    
    private String username;
    private String password;
    private Employee employee;
    private Role role;
    private WorkQueue workQueue;
    private FitnessList fitnessList;
    private DietList dietList;
    public Enterprise Enterprise;
    public EcoSystem system;
    public VipCustomer customer;
    public UserAccount() {
        workQueue = new WorkQueue();
        fitnessList = new FitnessList();
        dietList = new DietList();
    }

    public FitnessList getFitnessList() {
        return fitnessList;
    }

    public DietList getDietList() {
        return dietList;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Employee getEmployee() {
        return employee;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    
    
    @Override
    public String toString() {
        return username;
    }
    
    
    
}