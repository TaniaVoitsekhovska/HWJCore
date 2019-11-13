/*
 * Copyright
 */

package homework_12.hw12_2;

import java.util.ArrayList;
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
        //     Month[] monthArray = Month.values();
        //    Seasons[] seasonsArray = Seasons.values();
        ArrayList<Month> monthArray = new ArrayList();
        for (Month month : Month.values()) {
            monthArray.add(month);
        }

        ArrayList<Seasons> seasonsArray = new ArrayList<>();
        for (Seasons season : Seasons.values()) {
            seasonsArray.add(season);
        }


        while (true) {
            consoleMenu();
            int numb = -1;
            try {
                numb = new Scanner(System.in).nextInt();
            } catch (InputMismatchException input) {
                System.out.println("Must be a Number !");
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
                        String message = "Month does not exist!";
                        throw new WrongInputConsoleParametrException(message);
                    }


                    break;
                }
                case 2: {
                    System.out.println("Enter a season ");
                    String season = sc.next().toUpperCase();
                    String equalSeason = " Months, that have same season are: ";

                    boolean isSeason = false;
                    for (Month months : monthArray) {
                        if (months.getSeasons().name().equalsIgnoreCase(season)) {
                            isSeason = true;
                        }
                    }
                    if (!isSeason) {
                        String message = "Season does not exist !";
                        throw new WrongInputConsoleParametrException(message);
                    } else {
                        System.out.println(equalSeason);
                        for (Month months : monthArray) {
                            if (months.getSeasons().toString().equalsIgnoreCase(season)) {
                                System.out.println(months);
                            }
                        }
                    }
                    break;
                }
                case 3: {
                    System.out.println("Enter  number of days ");
                    int number = sc.nextInt();
                    String numDays = " Months that have same number of days ";
                    boolean areDays = false;

                    for (Month months : monthArray) {
                        if (months.getDays() == number) {
                            areDays = true;
                        }
                    }

                    if (!areDays) {
                        String message = "There is no such month  !";
                        throw new WrongInputConsoleParametrException(message);

                    } else {
                        System.out.println(numDays);
                        for (Month months : monthArray) {
                            if (months.getDays() == number) {
                                System.out.println(months);
                            }
                        }
                    }
                    break;
                }

                case 4: {
                    System.out.println("Enter  number of days ");
                    int number = sc.nextInt();
                    String sameNumDays = " Months that have less number of days are ";
                    boolean areDays = false;

                    for (Month months : monthArray) {
                        if (months.getDays() <= number) {
                            areDays = true;
                        }
                    }
                    if (!areDays) {
                        String message = "There is no such month  !";
                        throw new WrongInputConsoleParametrException(message);

                    } else {
                        System.out.println(sameNumDays);
                        for (Month months : monthArray) {
                            if (months.getDays() <= number) {
                                System.out.println(months);
                            }
                        }
                    }
                    break;
                }

                case 5: {
                    System.out.println("Enter days number ");
                    int number = sc.nextInt();
                    String sameNumDays = " Months that have more number of days are:";
                    boolean areDays = false;

                    for (Month months : monthArray) {
                        if (months.getDays() > number) {
                            areDays = true;
                        }
                    }
                    if (!areDays) {
                        String message = "There is no such month  !";
                        throw new WrongInputConsoleParametrException(message);

                    } else {
                        System.out.println(sameNumDays);
                        for (Month months : monthArray) {
                            if (months.getDays() >= number) {
                                System.out.println(months);
                            }
                        }
                    }
                    break;
                }
                case 6: {
                    System.out.println("Enter season");
                    String str = sc.next().toUpperCase();

                    boolean next = false;
                    for (Seasons seasons : seasonsArray) {
                        if (seasons.name().equalsIgnoreCase(str)) {
                            next = true;
                        }

                    }
                    if (next) {
                        Seasons season = Seasons.valueOf(str);
                        int index = season.ordinal();
                        System.out.println(" Next season is ");
                        if (index == (seasonsArray.size() - 1)) {
                            index = 0;
                            System.out.println(seasonsArray.get(index));
                            break;
                        } else {
                            System.out.println(seasonsArray.get(index + 1));
                            break;
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

                    for (Seasons seasons : seasonsArray) {
                        if (seasons.name().equalsIgnoreCase(str)) {
                            previous = true;
                        }
                    }
                    if (previous) {
                        Seasons season = Seasons.valueOf(str);
                        int index = season.ordinal();
                        System.out.println(" Previous season is :");
                        if (index == 0) {
                            index = (seasonsArray.size() - 1);
                            System.out.println(seasonsArray.get(index));
                            break;
                        } else {
                            System.out.println(seasonsArray.get(index - 1));
                            break;
                        }
                    }
                    if (!previous) {
                        String message = "There is no such season !";
                        throw new WrongInputConsoleParametrException(message);

                    }
                    break;
                }
                case 8: {

                    System.out.println("Months that have even num of days are :");

                    boolean isEven = false;

                    for (Month month : monthArray) {
                        if (month.getDays() % 2 == 0)
                            isEven = true;
                        System.out.println(month);
                    }
                    if (!isEven) {
                        String message = " There is no such month !";
                        throw new WrongInputConsoleParametrException(message);
                    }
                    break;
                }
                case 9: {
                    System.out.println("Months that have uneven num of days are :");

                    boolean isUnEven = false;
                    for (Month month : monthArray) {
                        if (month.getDays() % 2 != 0)
                            isUnEven = true;
                        System.out.println(month);
                    }

                    if (!isUnEven) {
                        String message = " There is no such month !";
                        throw new WrongInputConsoleParametrException(message);
                    }
                    break;
                }
                case 10: {
                    System.out.println("Enter month ");
                    String month = sc.next().toUpperCase();
                    boolean check = isMonth(monthArray, month);

                    if (check) {
                        Month months2=Month.valueOf(month);

                        if (months2.getDays() % 2 == 0) {
                            System.out.println("The number of days in your month is even !");
                            break;
                        } else {
                            System.out.println("The number of days in your month is even !");
                            break;
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

    static boolean isMonth(ArrayList<Month> arrayListmonths, String monthToCheck) {
        boolean isMonth = false;

        for (Month months : arrayListmonths) {
            if (months.name().equalsIgnoreCase(monthToCheck))
                isMonth = true;
        }
        return isMonth;
    }


}
