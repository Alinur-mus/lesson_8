import java.util.Scanner;
//public class Main {
//    public static void main(String[] args)
//    {
//        lesson 8
//        task1
//        int month3 =2;
//        switch(month3){
//            case 1:
//                System.out.println("January");
//            break;
//            case 2:
//                System.out.println("February");
//            break;
//            case 3:
//                System.out.println("March");
//            break;
//            default:
//                System.out.println("Invalid");
//            break;
//        }
////        task2
//        int mounth1 = 1;
//        switch(mounth1){
//            case 12:
//            case 1:
//            case 2:
//                System.out.println("Winter");
//                break;
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Spring");
//                break;
//            case 6:
//            case 7:
//            case 8:
//                System.out.println("Summer");
//                break;
//            case 9:
//            case 10:
//            case 11:
//                System.out.println("Autumn");
//                break;
//            default:
//                System.out.println("Invalid");
//                break;
//        }
//        task3
//        String name = "Maksat";
//        String surname = "empty";
//        switch(name){
//            case "Vasya":
//                surname = "Pupkkin";
//                break;
//            case "Arman":
//                surname = "Orman";
//                break;
//            case "Batyr":
//                surname = "Bala";
//                break;
//            default:
//                System.out.println("Invalid");
//                break;
//        }
//        System.out.println("name: "+name);
//        System.out.println("surname: "+surname);
////        task4
//        int mounth2 = 10;
//        int years = 2020;
//        int numDays = 0;
//        switch(mounth2){
//            case 1: case 3: case 5:
//            case 7: case 8: case 10:
//            case 12:
//                numDays = 31;
//            case 4: case 6:
//            case 9: case 11:
//                numDays = 30;
//                break;
//            case 2:
//                if((years%4==0 &&years%100 !=0)||(years%400==0))
//                    numDays = 29;
//                else
//                    numDays=28;
//                break;
//            default:
//                System.out.println("Invalid month.");
//                break;
//        }System.out.println("Number of Days = "+numDays);
////        task5
//        char branch ='I';
//        int group =3;
//        switch(group){
//            case 1:
//                switch (branch){
//                    case 'F':
//                        System.out.println("IT");
//                        break;
//                    case 'D':
//                        System.out.println("Economics");
//                        break;
//                    case 'A':
//                        System.out.println("Jurttin balasi");
//                        break;
//                }
//                break;
//            case 2:
//                switch (branch){
//                    case 'E':
//                        System.out.println("IT");
//                        break;
//                    case 'A':
//                        System.out.println("Philologi");
//                        break;
//                    case 'G':
//                        System.out.println("Math");
//                        break;
//                }
//            case 3:
//                switch (branch){
//                    case 'I':
//                        System.out.println("IT Teachers");
//                        break;
//                    case 'F':
//                        System.out.println("Just IT");
//                        break;
//                    case 'C':
//                        System.out.println("Mot IT");
//                        break;
//                }
//                break;
//        }
////        task6
//        Scanner scanner= new Scanner(System.in);
//        System.out.println(("Enter the animal: "));
//        String animal =scanner.nextLine();
//        String result;
//        switch (animal){
//            case "DOG":
//            case "CAT":
//                result = "domestic animal";
//                break;
//            case "TIGER":
//                result = "wild animal";
//                break;
//            default:
//                result = "unknown animal";
//                break;
//        }System.out.println(result);
//        task 7
//        Scanner scanner1 = new Scanner(System.in);
//        System.out.println("Enter the month number: ");
//        int month_1 = scanner1.nextInt();
//        switch (month_1){
//            case 1:
//                System.out.println("January");
//            break;
//            case 2:
//                System.out.println("February");
//                break;
//            case 3:
//                System.out.println("March");
//                break;
//            case 4:
//                System.out.println("April");
//                break;
//            case 5:
//                System.out.println("May");
//                break;
//            case 6:
//                System.out.println("June");
//                break;
//            case 7:
//                System.out.println("July");
//                break;
//            case 8:
//                System.out.println("August");
//                break;
//            case 9:
//                System.out.println("September");
//                break;
//            case 10:
//                System.out.println("October");
//                break;
//            case 11:
//                System.out.println("November");
//                break;
//            case 12:
//                System.out.println("December");
//                break;
//            default:
//                System.out.println("Invalid");
//        }
////        Task 8
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the month: ");
//        int moubth_2 = scanner.nextInt();
//        switch (moubth_2){
//            case 12:
//            case 1:
//            case 2:
//                System.out.println("Winter");
//                break;
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Spring");
//                break;
//            case 6:
//            case 7:
//            case 8:
//                System.out.println("Summer");
//                break;
//            case 9:
//            case 10:
//            case 11:
//                System.out.println("Autumn");
//                break;
//            default:
//                System.out.println("Invalid");
//                break;
//        }
////        Task 9
//        Scanner scanner2 = new Scanner(System.in);
//        System.out.println("Enter your name: ");
//        String name = scanner2.nextLine();
//        Scanner scanner3 = new Scanner(System.in);
//        System.out.println("Enter your surname: ");
//        String surname = scanner3.nextLine();
//        switch (name){
//            case "Vasya":
//                surname ="Pupkin";
//                break;
//            case "Arman":
//                surname="Orman";
//                break;
//            case "Batyr":
//                surname ="Bala";
//                break;
//            case "Maksat":
//                surname="Astaev";
//                break;
//            default:
//                System.out.println("Invalid");
//        }
//        System.out.println("name: "+name);
//        System.out.println("surname: "+surname);
////        Task 10
//        Scanner scanner4 = new Scanner(System.in);
//        System.out.println("Enter month: ");
//        int mounth_6=scanner4.nextInt();
//        Scanner scanner5 = new Scanner(System.in);
//        System.out.println("Enter year: ");
//        int year = scanner5.nextInt();
//        Scanner scanner6= new Scanner(System.in);
//        System.out.println("Enter numDay: ");
//        int numDays=scanner6.nextInt();
//        switch (mounth_6){
//            case 1: case 3: case 5:
//            case 7: case 8: case 10:
//            case 12:
//                numDays=31;
//                break;
//            case 4: case 6: case 9:
//            case 11:
//                numDays=30;
//                break;
//            case 2:
//                if((year%4==0&&year%100!=0)||(year%400==0))
//                    numDays=29;
//                else
//                    numDays=28;
//                break;
//            default:
//                System.out.println("Invalid mounth.");
//                break;
//        }
//        System.out.println("Number of Days= "+numDays);
////      Task 11
//        Scanner scanner7 =new Scanner(System.in);
//        System.out.println("enter branch: ");
//        char branch = scanner7.next().charAt(0);
//        Scanner scanner8 = new Scanner(System.in);
//        System.out.println("Enter your group: ");
//        int group = scanner8.nextInt();
//        switch (group) {
//            case 1:
//                switch (branch) {
//                    case 'F':
//                        System.out.println("IT");
//                        break;
//                    case 'D':
//                        System.out.println("Economics");
//                        break;
//                    case 'A':
//                        System.out.println("Jurttin balasi");
//                        break;
//                }
//                break;
//            case 2:
//                switch (branch) {
//                    case 'E':
//                        System.out.println("IT");
//                        break;
//                    case 'A':
//                        System.out.println("Philologi");
//                        break;
//                    case 'G':
//                        System.out.println("Math");
//                        break;
//                }
//                break;
//            case 3:
//                switch (branch) {
//                    case 'I':
//                        System.out.println("IT teacher");
//                        break;
//                    case 'F':
//                        System.out.println("Just IT");
//                        break;
//                    case 'C':
//                        System.out.println("Not IT");
//                        break;
//                }
//                break;
//        }
//}}
//        Task 13
        import java.util.Scanner;
        class Main{
            public static void main(String[] args){
//                Scanner myObj = new Scanner(System.in);
//                System.out.println("Enter username");
//
//                String userName =myObj.nextLine();
//                System.out.println("User name is: "+ userName);
////          Task 14
//                Scanner myObj = new Scanner(System.in);
//                System.out.println("Enter name, age and salary: ");
//                String name =myObj.nextLine();
//                int age = myObj.nextInt();
//                double salary = myObj.nextDouble();
//                System.out.println("name: "+name);
//                System.out.println("Age: "+age);
//                System.out.println("Salary: "+salary);
//                Problem 1
                Scanner scanner =new Scanner(System.in);
                System.out.println("Write week number: ");
                int week = scanner.nextInt();
                switch (week){
                    case 1:
                        System.out.println("Monday");
                        break;
                    case 2:
                        System.out.println("Tuesday");
                        break;
                    case 3:
                        System.out.println("Thirsday");
                        break;
                    case 4:
                        System.out.println("Foursday");
                        break;
                    case 5:
                        System.out.println("Friday");
                        break;
                    case 6:
                        System.out.println("Sunday");
                        break;
                    case 7:
                        System.out.println("Saturday");
                        break;
                    default:
                        System.out.println("Invalid number");
                        break;
                }
//                Problem 2
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("Write a month number: ");
                int month = scanner1.nextInt();
                switch (month){
                    case 1:
                        System.out.println("January");
                        break;
                    case 2:
                        System.out.println("February");
                        break;
                    case 3:
                        System.out.println("March");
                        break;
                    case 4:
                        System.out.println("April");
                        break;
                    case 5:
                        System.out.println("May");
                        break;
                    case 6:
                        System.out.println("June");
                        break;
                    case 7:
                        System.out.println("July");
                        break;
                    case 8:
                        System.out.println("August");
                        break;
                    case 9:
                        System.out.println("September");
                        break;
                    case 10:
                        System.out.println("October");
                        break;
                    case 11:
                        System.out.println("November");
                        break;
                    case 12:
                        System.out.println("December");
                        break;
                    default:
                        System.out.println("Invalid number.");
                        break;
                }
//                Problem 3
                Scanner scanner2 = new Scanner(System.in);
                System.out.println("Write month number: ");
                int month_1=scanner2.nextInt();
                switch (month_1){
                    case 12: case 1: case 2:
                        System.out.println("Winter");
                        break;
                    case 3: case 4: case 5:
                        System.out.println("Spring");
                        break;
                    case 6: case 7: case 8:
                        System.out.println("Summer");
                        break;
                    case 9: case 10: case 11:
                        System.out.println("Autumn");
                        break;
                    default:
                        System.out.println("Invalid mouth.");
                        break;
                }
    }
}