/*
 * Copyright
 */

package homework_8_and_9.hw8_1_9_1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Tania Voitsekhovska
 * @version 0.1
 * @since JDK 1.8
 */

public class Main {

    public static void main(String[] args) throws WrongInputConsoleParametrException {

        Scanner sc = new Scanner(System.in);
        Month[] monthArray = Month.values();
        Seasons[] seasonsArray = Seasons.values();


        while (true) {
            consoleMenu();
            int numb = -1;
            try {
                numb = new Scanner(System.in).nextInt();
            } catch (InputMismatchException input) {
                System.out.println("Must be a number !");
                System.out.println(input.getMessage());
            }

            switch (numb) {
                case 0: {
                    return;
                }
                case 1: {
                    System.out.println("Enter month ");
                    String month = sc.next().toUpperCase();

                    boolean monthCheck = isMonth(monthArray, month);
                    if (monthCheck) {
                        System.out.println("Month exists!");
                    } else {
                        String message = "Month doesn't exist!";
                        throw new WrongInputConsoleParametrException(message);
                    }


                    break;
                }
                case 2: {
                    System.out.println("Enter season ");
                    String season = sc.next().toUpperCase();
                    String equalSeason = " Months, that have same season are: ";

                    boolean isSeason = false;
                    for (int i = 0; i < monthArray.length; i++) {
                        if (monthArray[i].getSeasons().name().equalsIgnoreCase(season)) {
                            equalSeason += monthArray[i].name() + " ";
                            isSeason = true;

                        }
                    }

                    if (!isSeason) {
                        String message = "Season does not exist !";
                        throw new WrongInputConsoleParametrException(message);
                    } else
                        System.out.println(equalSeason);

                    break;
                }
                case 3: {
                    System.out.println("Enter days number ");
                    int number = sc.nextInt();
                    String numDays = " Months that have same number of days ";
                    boolean areDays = false;

                    for (int i = 0; i < monthArray.length; i++) {
                        if (monthArray[i].getDays() == number) {
                            numDays += monthArray[i].name() + " ";
                            areDays = true;

                        }
                    }
                    if (!areDays) {
                        String message = "There is no such month  !";
                        throw new WrongInputConsoleParametrException(message);
                    } else
                        System.out.println(numDays);
                    break;
                }
                case 4: {
                    System.out.println("Enter days number ");
                    int number = sc.nextInt();
                    String sameNumDays = " Months that have less number of days ";
                    boolean areDays = false;

                    for (int i = 0; i < monthArray.length; i++) {
                        if (monthArray[i].getDays() <= number) {
                            sameNumDays += monthArray[i].name() + " ";
                            areDays = true;

                        }
                    }
                    if (!areDays) {
                        String message = "There is no such month  !";
                        throw new WrongInputConsoleParametrException(message);
                    } else
                        System.out.println(sameNumDays);
                    break;
                }
                case 5: {
                    System.out.println("Enter days number ");
                    int number = sc.nextInt();
                    String sameNumDays = " Months that have more number of days ";
                    boolean areDays = false;

                    for (int i = 0; i < monthArray.length; i++) {
                        if (monthArray[i].getDays() >= number) {
                            sameNumDays += monthArray[i].name() + " ";
                            areDays = true;

                        }
                    }
                    if (!areDays) {
                        String message = "There is no such month  !";
                        throw new WrongInputConsoleParametrException(message);
                    } else
                        System.out.println(sameNumDays);
                    break;

                }
                case 6: {
                    System.out.println("Enter season");
                    String str = sc.next().toUpperCase();

                    boolean next = false;
                    for (int i = 0; i < seasonsArray.length; i++) {
                        if (seasonsArray[i].name().equals(str)) {
                            if (i == (seasonsArray.length - 1)) {
                                i = 0;
                                System.out.println(" Next season is " + seasonsArray[i]);
                                next = true;
                                break;
                            } else {
                                System.out.println(" Next season is " + seasonsArray[i + 1]);
                                next = true;
                                break;
                            }
                        }
                    }
                    if (!next) {
                        String message = "There is no such season !";
                        throw new WrongInputConsoleParametrException(message);
                    }
                    break;
                }
                case 7: {
                    System.out.println("Enter season");
                    String str = sc.next().toUpperCase();

                    boolean previous = false;
                    for (int i = seasonsArray.length - 1; i >= 0; i--) {
                        if (seasonsArray[i].name().equals(str)) {
                            if (i == 0) {
                                i = seasonsArray.length - 1;
                                System.out.println(" Previous season is " + seasonsArray[i]);
                                previous = true;
                                break;
                            } else {
                                System.out.println(" Previous season is " + seasonsArray[i - 1]);
                                previous = true;
                                break;
                            }
                        }
                    }
                    if (!previous) {
                        String message = "There is no such season !";
                        throw new WrongInputConsoleParametrException(message);
                    }
                    break;
                }
                case 8: {

                    String str = "Months that have even num of days are :";

                    boolean isEven = false;
                    for (int i = 0; i < monthArray.length; i++) {
                        if (monthArray[i].getDays() % 2 == 0) {
                            str += monthArray[i] + " ";
                            isEven = true;
                        }
                    }
                    System.out.println(str);
                    if (!isEven) {
                        String message = " There is no such month !";
                        throw new WrongInputConsoleParametrException(message);
                    }
                    break;
                }
                case 9: {
                    String str = "Months that have uneven num of days are :";

                    boolean isUnEven = false;
                    for (int i = 0; i < monthArray.length; i++) {
                        if (monthArray[i].getDays() % 2 != 0) {
                            str += monthArray[i] + " ";
                            isUnEven = true;
                        }
                    }
                    System.out.println(str);
                    if (!isUnEven) {
                        String message = " There is no such month !";
                        throw new WrongInputConsoleParametrException(message);
                    }
                    break;
                }
                case 10: {
                    System.out.println("Enter month ");
                    String month = sc.next().toUpperCase();
                    boolean check = false;

                    for (int i = 0; i < monthArray.length; i++) {
                        if (month.equals(monthArray[i].name())) {
                            if (monthArray[i].getDays() % 2 == 0) {
                                System.out.println("The number of days in your month is even !");
                                check = true;
                                break;
                            } else {
                                System.out.println("The number of days in your month is even !");
                                check = true;
                                break;
                            }
                        }
                    }
                    if (!check) {
                        String message = " There is no such month !";
                        throw new WrongInputConsoleParametrException(message);
                    }
                    break;
                }
                default:
                    System.out.println("Enter the number from menu !");

            }

        }


    }

    /**
     * menu to enter for output
     *
     * @param -
     * @author Tania Voitsekhovska
     * @see - look at method name
     */
    static void consoleMenu() {

        System.out.println("Enter 1, to check if month exists");
        System.out.println("Enter 2, to output months with same season");
        System.out.println("Enter 3, to output months with same days");
        System.out.println("Enter 4, to output months with less days");
        System.out.println("Enter 5, to output months with less days");
        System.out.println("Enter 6, to output next season");
        System.out.println("Enter 7, to output previous season");
        System.out.println("Enter 8, to output all month that have even number of days");
        System.out.println("Enter 9, to output all month that have uneven number of days");
        System.out.println("Enter 10, to check if month has equal number of days");
        System.out.println("Enter 0 for exit");
    }

    /**
     *
     * @param array to check entered month with Enum
     * @param monthToCheck month that should be checked
     * @return boolean value
     */
    static boolean isMonth(Month[] array, String monthToCheck) {
        boolean month = false;

        for (Month months : array) {
            if (months.name().equalsIgnoreCase(monthToCheck))
                month = true;
        }
        return month;
    }


}
