import java.util.Scanner;
public class Transfer {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner Scanner = new Scanner(System.in);
        int number;
        do {
            number = Scanner.nextInt();
        } while (number<0);
        if (number/100 > 0 && number/100 <10) {
            switch (number/100) {
                case 1:
                    System.out.printf("one hundred and ");
                    break;
                case 2:
                    System.out.printf("two hundred and ");
                    break;
                case 3:
                    System.out.printf("three hundred and ");
                    break;
                case 4:
                    System.out.printf("four hundred and ");
                    break;
                case 5:
                    System.out.printf("five hundred and ");
                    break;
                case 6:
                    System.out.printf("six hundred and ");
                    break;
                case 7:
                    System.out.printf("seven hundred and ");
                    break;
                case 8:
                    System.out.printf("eight hundred and ");
                    break;
                case 9:
                    System.out.printf("nine hundred and ");
                    break;
            }
        }
        number %= 100;
        if (number/10 >=0 && number/10 <10) {
            if (number/10 ==1) {
                switch (number%=10) {
                    case 0:
                        System.out.printf("ten");
                        break;
                    case 1:
                        System.out.printf("eleven");
                        break;
                    case 2:
                        System.out.printf("twelve");
                        break;
                    case 3:
                        System.out.printf("thirteen");
                        break;
                    case 4:
                        System.out.printf("fourteen");
                        break;
                    case 5:
                        System.out.printf("fifteen");
                        break;
                    case 6:
                        System.out.printf("sixteen");
                        break;
                    case 7:
                        System.out.printf("seventeen");
                        break;
                    case 8:
                        System.out.printf("eighteen");
                        break;
                    case 9:
                        System.out.printf("nineteen");
                        break;
                }
            } else {
                switch (number/10) {
                    case 2:
                        System.out.printf("twenty-");
                        break;
                    case 3:
                        System.out.printf("thirty-");
                        break;
                    case 4:
                        System.out.printf("fourty-");
                        break;
                    case 5:
                        System.out.printf("fifty-");
                        break;
                    case 6:
                        System.out.printf("sixty-");
                        break;
                    case 7:
                        System.out.printf("seventy-");
                        break;
                    case 8:
                        System.out.printf("eighty-");
                        break;
                    case 9:
                        System.out.printf("ninety-");
                        break;
                }
                number %=10;
                switch (number) {
                    case 0:
                        System.out.printf("zero");
                        break;
                    case 1:
                        System.out.printf("one");
                        break;
                    case 2:
                        System.out.printf("two");
                        break;
                    case 3:
                        System.out.printf("three");
                        break;
                    case 4:
                        System.out.printf("four");
                        break;
                    case 5:
                        System.out.printf("five");
                        break;
                    case 6:
                        System.out.printf("six");
                        break;
                    case 7:
                        System.out.printf("seven");
                        break;
                    case 8:
                        System.out.printf("eight");
                        break;
                    case 9:
                        System.out.printf("nine");
                        break;
                }
            }
        }
    }
}
