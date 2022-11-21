package com.bridghlabz;

public class EmployeeWage {

    static final int WAGE_PER_HOUR = 20;

    static final int FULL_DAY_HOUR = 8;

    static final int PART_TIME_HOUR = 4;

    static final int IS_FULL_TIME = 2;

    static final int IS_PART_TIME = 1;
    
    static final int WORKING_HOUR_PER_MONTH = 100;

    static final int WORKING_DAYS_PER_MONTH = 20;


    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage");

        int dayCount = 1;
        int workingHours= 0;

        while (dayCount <=WORKING_DAYS_PER_MONTH && workingHours <= WORKING_HOUR_PER_MONTH )
        {

            int employeeCheck= (int)Math.floor(Math.random()*10) % 3;
            System.out.println(employeeCheck);

            int dailyWage = 0;

            switch (employeeCheck) {
                case IS_FULL_TIME:
                    dailyWage = FULL_DAY_HOUR * WAGE_PER_HOUR;
                    workingHours += FULL_DAY_HOUR;
                    System.out.println("Employee is Full time");
                    break;
                case IS_PART_TIME:
                    dailyWage = PART_TIME_HOUR * WAGE_PER_HOUR;
                    workingHours += PART_TIME_HOUR;
                    System.out.println("Employee is Part time");
                    break;
                default:
                    System.out.println("Employee is Absent");


            }
            System.out.println("Daily Wage for Day " + dayCount + "=>" + dailyWage  );
            dayCount++;
        }

        System.out.println ("WorkingHour =>" + workingHours );




    }
}
