package com.ShanInfotech.WorkLogTrackerApp;

import java.util.Scanner;

import com.ShanInfotech.WorkLogTrackerApp.Dao.Departmentdao;
import com.ShanInfotech.WorkLogTrackerApp.Dao.Employedao;
import com.ShanInfotech.WorkLogTrackerApp.Dao.Sprintdao;
import com.ShanInfotech.WorkLogTrackerApp.Dao.Worklogdao;
import com.ShanInfotech.WorkLogTrackerApp.Dao.projectdao;
import com.ShanInfotech.WorkLogTrackerApp.entity.Department;
import com.ShanInfotech.WorkLogTrackerApp.entity.Employe;
import com.ShanInfotech.WorkLogTrackerApp.entity.Project;
import com.ShanInfotech.WorkLogTrackerApp.entity.Sprint;
import com.ShanInfotech.WorkLogTrackerApp.entity.WorkLog;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception{
    	Scanner sc=new Scanner(System.in);
    	
    	Departmentdao Dd=new Departmentdao();
    	System.out.println("Insert the Department data");
    	Department Dr=new Department(sc.nextInt(), sc.next());
    	Dd.addDepartment(Dr);
    	
    	
    	Employedao Ee=new Employedao();
    	System.out.println("Insert the Employee Data");
    	Employe Ep=new Employe(sc.hashCode(), sc.next(), Dr);
    	Ee.addEmploye(Ep);
    	
    	
    	projectdao Pp=new projectdao();
    	System.out.println("Insert the project Data");
    	Project pr=new Project(sc.nextInt(), sc.next(), sc.next());
    	Pp.addProject(pr);
    	
    	
    	Sprintdao Sp=new Sprintdao();
    	System.out.println("insert the Sprint data");
    	Sprint Sr=new Sprint(sc.nextInt(), sc.next(), sc.next(), sc.next(), pr);
    	Sp.addSprint(Sr);
    	
    	
    	Worklogdao Wl=new Worklogdao();
    	System.out.println("Insert the WorkLog data");
    	WorkLog Ww=new WorkLog(sc.nextInt(), sc.next(), sc.nextDouble(), Ep, pr, Sr);
    	Wl.addWorkLog(Ww);
    	
    	
    	
    }
}
