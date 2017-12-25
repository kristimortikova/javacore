package center.kit.app.homework.lesson9;

import java.util.Scanner;

public class WhiteCollar extends Human {
    Scanner scanner = new Scanner(System.in);
    private String companyName;

    public WhiteCollar(int age, String name, String company) {
        super(age, name);
        this.companyName = companyName;
    }

    public void setCompany(String companyName) {
        System.out.println(" enter name of company: ");
        String check = scanner.nextLine();
        if (check.matches("^[a-zA-Z]+\\s?\\-?\\s?[a-zA-Z]+$")) {
            companyName = check;
            System.out.println("Company name is " + companyName);
        } else System.out.println("Company name is invalid");
    }
}


