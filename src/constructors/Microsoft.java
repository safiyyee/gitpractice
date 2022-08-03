package constructors;

import java.util.ArrayList;

public class Microsoft {

    public static void main(String[] args) {

        Employee employeeOne = new Employee(); // Calling for default constructor

       // employeeOne.salary = 20000;
        System.out.println(employeeOne.toString());

        employeeOne.name = "Ersin";
        employeeOne.ID = 100;
        employeeOne.jobTitle = "Technical Manager";

        Employee employeeTwo = new Employee("Efe", "QA Lead", 200, 110000);

        ArrayList<Employee> team = new ArrayList<>();

        team.add(employeeOne);
        team.add(employeeTwo);

        team.add(new Employee("Jamal", "SDET", 300, 95000));

        //let's find MAx salary from team list
        double maxSalary = Double.MIN_VALUE;
        for (Employee each : team) { //each is an Employee

            if(each.salary>maxSalary){
                maxSalary = each.salary;
            }

        }

        System.out.println("maxSalary = " + maxSalary);


        //I wanna find Jamal's job title
        for (Employee each : team){
            if (each.name.equalsIgnoreCase("Jamal")){
                System.out.println(each.jobTitle);
            }
        }




    }

}
