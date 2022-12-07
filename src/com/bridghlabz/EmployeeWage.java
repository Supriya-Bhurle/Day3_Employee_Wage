package com.bridghlabz;

import java.util.Scanner;

public class EmployeeWage {

    static int  wagePerHour ;
    static int workingHoursPerMonth ;
    static int workingDaysPerMonth ;

    static final int WAGE_PER_HOUR = 20;

    static final int FULL_DAY_HOUR = 8;

    static final int PART_TIME_HOUR = 4;

    static final int IS_FULL_TIME = 2;

    static final int IS_PART_TIME = 1;
    
    static final int WORKING_HOUR_PER_MONTH = 100;

    static final int WORKING_DAYS_PER_MONTH = 20;


    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage");

        EmployeeWage obj = new EmployeeWage();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your count of company's");
        int company = sc.nextInt();

        for ( int i = 1 ; i<=company ; i++ ){
            System.out.println("Enter wage per hour ");
            wagePerHour = sc.nextInt();
            System.out.println("Enter workingHoursPerMonth ");
            workingHoursPerMonth = sc.nextInt();
            System.out.println("Enter workingDaysPerMonth ");
            workingDaysPerMonth = sc .nextInt();
            obj.refactor();
        }

        refactor();
    }
    public static void refactor(){

        int dayCount = 1;
        int workingHours= 0;
        int totalWage = 0;
        int fullDayHour = 8;
        int partTimeHour = 4;
        int isFullTime = 2;



        while (dayCount <WORKING_DAYS_PER_MONTH && workingHours < WORKING_HOUR_PER_MONTH )
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
                    break;
            }

                dayCount++;
                totalWage = totalWage + dailyWage;
        }

        System.out.println ("WorkingHour =>" + workingHours );
        System.out.println ("total wage for month" + totalWage );




    }
}
