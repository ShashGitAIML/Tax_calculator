import java.util.*;
import java.text.DecimalFormat;


class Example {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("                               ______   ______   ________  ________ ");
        System.out.println("                              |      \\ /      \\ |        \\|        \\");
        System.out.println("                               \\$$$$$$|  $$$$$$\\| $$$$$$$$ \\$$$$$$$$");
        System.out.println("                                | $$  | $$   \\$$| $$__       | $$   ");
        System.out.println("                                | $$  | $$      | $$  \\      | $$   ");
        System.out.println("                                | $$  | $$   __ | $$$$$      | $$   ");
        System.out.println("                               _| $$_ | $$__/  \\| $$_____    | $$   ");
        System.out.println("                              |   $$ \\ \\$$    $$| $$     \\   | $$   ");
        System.out.println("                               \\$$$$$$  \\$$$$$$  \\$$$$$$$$    \\$$   ");
        System.out.println("                                                                        ");
        System.out.println("                                                                        ");
        System.out.println("                                                                        ");


        System.out.println("                    _______               _____      _            _       _             ");
        System.out.println("                   |__   __|             / ____|    | |          | |     | |            ");
        System.out.println("                      | | __ ___  __    | |     __ _| | ___ _   _| | __ _| |_ ___  _ __ ");
        System.out.println("                      | |/ _` \\ \\/ /    | |    / _` | |/ __| | | | |/ _` | __/ _ \\| '__|");
        System.out.println("                      | | (_| |>  <     | |___| (_| | | (__| |_| | | (_| | || (_) | |   ");
        System.out.println("                      |_|\\__,_/_/\\_\\    \\_____\\__,_|_|\\___|\\__,_|_|\\__,_|\\__\\___/|_|   ");
        System.out.println("                                                                                                      ");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("================================================================================================================");
        System.out.println();
        System.out.println();
        String input_continue = "N";
        boolean user_continue = true;

        System.out.println("[1] Withholding Tax : ");
        System.out.println();
        System.out.println("[2] Payable Tax : ");
        System.out.println();
        System.out.println("[3] Income Tax : ");
        System.out.println();
        System.out.println("[4] Social Security Contribution Levy (SSCL) Tax: ");
        System.out.println();
        System.out.println("[5] Leasing payment: ");
        System.out.println();
        System.out.print("[6] Exit: ");

        int num1 = input.nextInt();
        DecimalFormat df = new DecimalFormat("#.00");


        switch (num1) {
            case 1:

                    System.out.println("+--------------------------------------------------------------------+");
                    System.out.println("|                           WITHHOLDING TAX                          |");
                    System.out.println("+--------------------------------------------------------------------+");
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println("[1] Rent Tax");
                    System.out.println();
                    System.out.println("[2] Bank Interest Tax");
                    System.out.println();
                    System.out.println("[3] Dividend Tax");
                    System.out.println();
                    System.out.print("[4] Exit : ");
                    int num2 = input.nextInt();
                    input.nextLine();
                    switch (num2) {
                        case 1:

                            while (user_continue) {
                                System.out.println();
                                System.out.println("+--------------------------------------------------------------------+");
                                System.out.println("|                           RENT TAX                                 |");
                                System.out.println("+--------------------------------------------------------------------+");

                                System.out.print("Enter your Rent : ");
                                double rent = input.nextDouble();
                                input.nextLine();

                                if (rent >= 100000) {
                                    double rent_tax = (rent - 100000) * 0.1;
                                    System.out.println("You have to pay Rent Tax : " + df.format(rent_tax));


                                } else if (rent < 100000 && rent > 0) {
                                    System.out.println("You don't have to pay Rent Tax.");

                                } else {
                                    System.out.println("Invalid input.. ");
                                    System.out.print("Do you want to enter the correct value again? (Y/N): ");
                                    input_continue = input.nextLine();
                                    input_continue = input_continue.toUpperCase();
                                    if (input_continue.equals("N")) {
                                        user_continue = false;
                                    }
                                    continue;

                                }

                                System.out.print("Do you want to calculate another Rent tax? (Y/N): ");
                                input_continue = input.nextLine();
                                input_continue = input_continue.toUpperCase();
                                if (input_continue.equals("N")) {
                                    user_continue = false;

                                }

                            }


                            break;

                        case 2:
                            while (user_continue) {

                                System.out.println("+--------------------------------------------------------------------+");
                                System.out.println("|                           BANK INTEREST TAX                        |");
                                System.out.println("+--------------------------------------------------------------------+");
                                System.out.println();
                                System.out.println();
                                System.out.println();
                                System.out.println();
                                System.out.print("Enter your Bank Interest per year : ");
                                double annual_bank_interest = input.nextDouble();
                                input.nextLine();
                                double bank_interest_tax = annual_bank_interest * 0.05;
                                System.out.println("You have to pay Bank Interest Tax per year : " + df.format(bank_interest_tax));
                                System.out.print("Do you want to calculate another Bank Interest Tax ? (Y/N): ");
                                input_continue = input.nextLine();
                                input_continue = input_continue.toUpperCase();
                                if (input_continue.equals("N")) {
                                    user_continue = false;
                                }
                            }
                            break;

                        case 3:
                            while (user_continue) {
                                System.out.println("+--------------------------------------------------------------------+");
                                System.out.println("|                           DIVIDEND TAX                             |");
                                System.out.println("+--------------------------------------------------------------------+");
                                System.out.println();
                                System.out.println();
                                System.out.println();
                                System.out.println();
                                System.out.print("Enter your total dividend per year : ");
                                double year_dividend = input.nextDouble();
                                input.nextLine();
                                if (year_dividend >= 100000) {
                                    double dividend_tax = year_dividend * 0.14;
                                    System.out.println("You have to pay Dividend Tax per year : " + df.format(dividend_tax));
                                } else {
                                    System.out.println("You don't have to pay Dividend Tax.");
                                }

                                System.out.print("Do you want to calculate another Dividend Tax ? (Y/N): ");
                                input_continue = input.nextLine();
                                input_continue = input_continue.toUpperCase();
                                if (input_continue.equals("N")) {
                                    user_continue = false;
                                }
                            }
                            break;

                        case 4:
                            System.out.println("Exiting the program...");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Invalid option");
                            break;
                    }
                    break;

                    case 2:
                        while (user_continue) {

                            System.out.println("+--------------------------------------------------------------------+");
                            System.out.println("|                          PAYABLE TAX                                |");
                            System.out.println("+--------------------------------------------------------------------+");
                            System.out.println();
                            System.out.println();
                            System.out.println();
                            System.out.println();
                            System.out.print("Enter your employee payment : ");
                            double employee_salary = input.nextDouble();
                            input.nextLine();
                            double payble_tax = 0;

                            if (employee_salary <= 100000) {
                                System.out.println("You don't have to pay Payable Tax.");
                            } else if (employee_salary > 100000 && employee_salary < 141667) {
                                payble_tax = employee_salary * 0.06;
                                System.out.println("You have to pay Payable Tax per month: " + df.format(payble_tax));

                            } else if (employee_salary >= 141667 && employee_salary < 183333) {
                                payble_tax = employee_salary * 0.12;
                                System.out.println("You have to pay Payable Tax per month: " + df.format(payble_tax));
                            } else if (employee_salary >= 183333 && employee_salary < 225000) {
                                payble_tax = employee_salary * 0.18;
                                System.out.println("You have to pay Payable Tax per month: " + df.format(payble_tax));
                            } else if (employee_salary >= 225000 && employee_salary < 266667) {
                                payble_tax = employee_salary * 0.24;
                                System.out.println("You have to pay Payable Tax per month: " + df.format(payble_tax));
                            } else if (employee_salary >= 266667 && employee_salary < 308333) {
                                payble_tax = employee_salary * 0.30;
                                System.out.println("You have to pay Payable Tax per month : " + df.format(payble_tax));
                            } else {
                                payble_tax = employee_salary * 0.36;
                                System.out.println("You have to pay Payable Tax per month: " + df.format(payble_tax));
                            }

                            System.out.print("Do you want to calculate another Payable Tax ? (Y/N): ");
                            input_continue = input.nextLine();
                            input_continue = input_continue.toUpperCase();
                            if (input_continue.equals("N")) {
                                user_continue = false;
                            }
                        }

                        break;

                    case 3:
                        while (user_continue) {
                            System.out.println("+--------------------------------------------------------------------+");
                            System.out.println("|                          INCOME TAX                                |");
                            System.out.println("+--------------------------------------------------------------------+");
                            System.out.println();
                            System.out.println();
                            System.out.println();
                            System.out.println();
                            System.out.print("Enter your total income per year : ");
                            double annual_income = input.nextDouble();
                            input.nextLine();
                            double income_tax = 0;
                            if (annual_income < 1200000) {
                                System.out.println("You don't have to pay Income  Tax.");
                            } else if (annual_income >= 1200000 && annual_income < 1700000) {
                                income_tax = annual_income * 0.06;
                                System.out.println("You have to pay Income  Tax per month : " + df.format(income_tax));
                            } else if (annual_income >= 1700000 && annual_income < 2200000) {
                                income_tax = annual_income * 0.12;
                                System.out.println("You have to pay Income  Tax per month : " + df.format(income_tax));
                            } else if (annual_income >= 2200000 && annual_income < 2700000) {
                                income_tax = annual_income * 0.18;
                                System.out.println("You have to pay Income Tax per month : " + df.format(income_tax));
                            } else if (annual_income >= 2700000 && annual_income < 3200000) {
                                income_tax = annual_income * 0.24;
                                System.out.println("You have to pay Income Tax per month : " + df.format(income_tax));
                            } else if (annual_income >= 3200000 && annual_income <= 3700000) {
                                income_tax = annual_income * 0.30;
                                System.out.println("You have to pay Income Tax per month : " + df.format(income_tax));
                            } else {
                                income_tax = annual_income * 0.36;
                                System.out.println("You have to pay Income Tax per month : " + df.format(income_tax));
                            }

                            System.out.print("Do you want to calculate another Income Tax ? (Y/N): ");
                            input_continue = input.nextLine();
                            input_continue = input_continue.toUpperCase();
                            if (input_continue.equals("N")) {
                                user_continue = false;
                            }
                        }
                        break;

                    case 4:
                        while (user_continue) {
                            System.out.println("+--------------------------------------------------------------------+");
                            System.out.println("|         SOCIAL SECURITY CONTRIBUTION LEVY (SSCL) TAX               |");
                            System.out.println("+--------------------------------------------------------------------+");
                            System.out.println();
                            System.out.println();
                            System.out.println();
                            System.out.println();
                            System.out.print("Enter your value of Good or Service : ");
                            double value = input.nextDouble();
                            input.nextLine();
                            double sale_tax = value * 0.025;
                            double new_value = value + sale_tax;
                            double vat = new_value * 0.15;
                            double sscl_tax = sale_tax + vat;
                            System.out.println();
                            System.out.println("You have to pay SSCL Tax : " + df.format(sscl_tax));
                            System.out.print("Do you want to calculate another Income Tax ? (Y/N): ");
                            input_continue = input.nextLine();
                            input_continue = input_continue.toUpperCase();
                            if (input_continue.equals("N")) {
                                user_continue = false;
                            }
                        }
                        break;

                    case 5:

                        System.out.println("+--------------------------------------------------------------------+");
                        System.out.println("|                         LEASING PAYMENT                            |");
                        System.out.println("+--------------------------------------------------------------------+");
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println("[1] Calculate monthly installment ");
                        System.out.println();
                        System.out.println("[2] Search Leasing Category ");
                        System.out.println();
                        System.out.println("[3] Find Leasing Amount ");
                        System.out.println();
                        System.out.print("[4] Exit : ");
                        int num3 = input.nextInt();

                        switch (num3) {
                            case 1:
                                while (user_continue) {
                                    System.out.println("+------------------------------------------------------------------+");
                                    System.out.println("|                 Calculate Leasing Payment                        |");
                                    System.out.println("+------------------------------------------------------------------+");
                                    System.out.println();
                                    System.out.println();
                                    System.out.println();
                                    System.out.println();
                                    System.out.print("Enter the Lease amount: ");
                                    double lease_amount = input.nextDouble();
                                    input.nextLine();
                                    System.out.println();
                                    System.out.print("Enter the Annual Interest rate (%): ");
                                    double annual_interest_rate = input.nextDouble();
                                    input.nextLine();
                                    if (annual_interest_rate < 0) {
                                        System.out.println();
                                        System.out.println("Invalid Annual Interest rate..Enter the correct value again..");
                                        System.out.println();
                                        continue;
                                    }
                                    System.out.println();
                                    System.out.print("Enter the number of years: ");
                                    double num_years = input.nextDouble();
                                    input.nextLine();
                                    if (num_years > 5) {
                                        System.out.println();
                                        System.out.println("Invalid Annual number of Years..Enter the correct value again..");
                                        System.out.println();
                                        continue;
                                    }
                                    double num_months = num_years * 12;
                                    double monthly_interest_rate = (annual_interest_rate / 12) / 100; // Convert annual interest rate to monthly rate
                                    double monthly_installement = (lease_amount * monthly_interest_rate * Math.pow(1 + monthly_interest_rate, num_months))
                                            / (Math.pow(1 + monthly_interest_rate, num_months) - 1);

                                    System.out.println();
                                    System.out.println("Monthly Installment: " + df.format(monthly_installement));
                                    System.out.print("Do you want to calculate another Monthly Installment ? (Y/N): ");
                                    input_continue = input.nextLine();
                                    input_continue = input_continue.toUpperCase();
                                    if (input_continue.equals("N")) {
                                        user_continue = false;
                                    }
                                }
                                break;

                            case 2:
                                while (user_continue) {
                                    System.out.println("+-------------------------------------------------------------------+");
                                    System.out.println("|                     Search Leasing Category                       |");
                                    System.out.println("+-------------------------------------------------------------------+");
                                    System.out.println();
                                    System.out.println();
                                    System.out.println();
                                    System.out.println();
                                    System.out.print("Enter the Lease amount: ");
                                    double lease_amount = input.nextDouble();
                                    input.nextLine();
                                    System.out.println();
                                    System.out.print("Enter the Annual Interest rate (%): ");
                                    double annual_interest_rate = input.nextDouble();
                                    input.nextLine();
                                    System.out.println();
                                    double monthly_interest_rate = (annual_interest_rate / 12) / 100;

                                    double monthly_installment_3_yrs = (lease_amount * monthly_interest_rate * Math.pow(1 + monthly_interest_rate, 36))
                                            / (Math.pow(1 + monthly_interest_rate, 36) - 1);


                                    double monthly_installment_4_yrs = (lease_amount * monthly_interest_rate * Math.pow(1 + monthly_interest_rate, 48))
                                            / (Math.pow(1 + monthly_interest_rate, 48) - 1);


                                    double monthly_installment_5_yrs = (lease_amount * monthly_interest_rate * Math.pow(1 + monthly_interest_rate, 60))
                                            / (Math.pow(1 + monthly_interest_rate, 60) - 1);


                                    System.out.println("Your monthly installement for 3 year paln - " + df.format(monthly_installment_3_yrs));
                                    System.out.println("Your monthly installement for 4 year paln - " + df.format(monthly_installment_4_yrs));
                                    System.out.println("Your monthly installement for 5 year paln - " + df.format(monthly_installment_5_yrs));
                                    System.out.print("Do you want to calculate another Leasing Category ? (Y/N): ");
                                    input_continue = input.nextLine();
                                    input_continue = input_continue.toUpperCase();
                                    if (input_continue.equals("N")) {
                                        user_continue = false;
                                    }
                                }
                                break;

                            case 3:
                                while (user_continue) {

                                    System.out.println("+-------------------------------------------------------------------+");
                                    System.out.println("|                      Find Leasing Amount                          |");
                                    System.out.println("+-------------------------------------------------------------------+");
                                    System.out.println();
                                    System.out.println();
                                    System.out.println();
                                    System.out.println();
                                    System.out.print("Enter the monthly lease payment amount you can afford : ");
                                    double m_L_p_amount = input.nextDouble();
                                    input.nextLine();
                                    System.out.println();
                                    System.out.print("Enter the number of years: ");
                                    double num_years = input.nextDouble();
                                    input.nextLine();
                                    double num_months = num_years * 12;
                                    System.out.println();
                                    System.out.print("Enter the Annual Interest rate (%): ");
                                    double annual_interest_rate = input.nextDouble();
                                    input.nextLine();
                                    System.out.println();
                                    double monthly_interest_rate = (annual_interest_rate / 12) / 100;
                                    double lease_amount = (m_L_p_amount * (Math.pow(1 + monthly_interest_rate, num_months) - 1)) / (monthly_interest_rate * Math.pow(1 + monthly_interest_rate, num_months));

                                    lease_amount = Math.ceil(lease_amount);
                                    System.out.print("You can get Lease Amount : " + df.format(lease_amount));
                                    System.out.print("Do you want to calculate another Lease Amount ? (Y/N): ");
                                    input_continue = input.nextLine();
                                    input_continue = input_continue.toUpperCase();
                                    if (input_continue.equals("N")) {
                                        user_continue = false;
                                    }
                                }
                                break;

                            case 4:
                                System.out.println("Exiting the program...");
                                System.exit(0);
                                break;

                            default:
                                System.out.println("Invalid option");
                                break;
                        }
                        break;

                    case 6:
                        System.out.println("Exiting the program...");
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Wrong Number");
                        break;
                }
        }
    }

