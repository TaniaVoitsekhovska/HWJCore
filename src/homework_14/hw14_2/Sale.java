package homework_14.hw14_2;

import java.util.*;

public class Sale implements Comparator<Commodity> {

    List<Commodity> commodities = new ArrayList<Commodity>();

    public void add() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of commodity ");
        String name = sc.nextLine();
        System.out.println("Enter length of commodity ");
        int length = sc.nextInt();
        System.out.println("Enter width of commodity ");
        int width = sc.nextInt();
        System.out.println("Enter weight of commodity ");
        int weight = sc.nextInt();

        Commodity commodity = new Commodity(name, length, width, weight);
        commodities.add(commodity);
        System.out.println("Commodity is added !");
        Collections.sort(commodities, new Sale());
        Iterator<Commodity> iterator = commodities.iterator();
        while (iterator.hasNext()) {
            Commodity c = iterator.next();
            System.out.println(c.toString());
        }
    }

    public void remove() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of commodity ");
        String name = sc.nextLine();
        System.out.println("Enter length of commodity ");
        int length = sc.nextInt();
        System.out.println("Enter width of commodity ");
        int width = sc.nextInt();
        System.out.println("Enter weight of commodity ");
        int weight = sc.nextInt();

        boolean exist = isCommodity(commodities, name, length, width, weight);

        if (exist) {
            Iterator<Commodity> iterator = commodities.iterator();
            while (iterator.hasNext()) {
                Commodity remove = iterator.next();

                if (remove.getName().equalsIgnoreCase(name) && remove.getLength() == length
                        && remove.getWidth() == width && remove.getWeight() == weight) {
                    iterator.remove();
                    System.out.println("Commodity " + remove.toString() + " is removed!");
                }
            }

        } else {
            System.out.println("There is no such commodity");
        }
        Collections.sort(commodities, new Sale());
        Iterator<Commodity> iterator = commodities.iterator();
        while (iterator.hasNext()) {
            Commodity c = iterator.next();
            System.out.println(c.toString());
        }
    }

    public void replace() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of commodity ");
        String name = sc.nextLine();
        System.out.println("Enter length of commodity ");
        int length = sc.nextInt();
        System.out.println("Enter width of commodity ");
        int width = sc.nextInt();
        System.out.println("Enter weight of commodity ");
        int weight = sc.nextInt();

        boolean exist = isCommodity(commodities, name, length, width, weight);

        if (exist) {
            Iterator<Commodity> iterator = commodities.iterator();
            while (iterator.hasNext()) {
                Commodity remove = iterator.next();

                if (remove.getName().equalsIgnoreCase(name) && remove.getLength() == length
                        && remove.getWidth() == width && remove.getWeight() == weight) {
                    System.out.println("Enter the name of commodity ");
                    String name1 = sc.next();
                    System.out.println("Enter length of commodity ");
                    int length1 = sc.nextInt();
                    System.out.println("Enter width of commodity ");
                    int width1 = sc.nextInt();
                    System.out.println("Enter weight of commodity ");
                    int weight1 = sc.nextInt();
                    remove.setName(name1);
                    remove.setLength(length1);
                    remove.setWidth(width1);
                    remove.setWeight(weight1);

                    System.out.println("Commodity  is replaced!");
                }
            }

        } else {
            System.out.println("There is no such commodity to replace");
        }
        Collections.sort(commodities, new Sale());
        Iterator<Commodity> iterator = commodities.iterator();
        while (iterator.hasNext()) {
            Commodity c = iterator.next();
            System.out.println(c.toString());
        }
    }

    public void sortByName() {
        System.out.println("Commodities before soring");
        Iterator<Commodity> iterator = commodities.iterator();
        while (iterator.hasNext()) {
            Commodity c = iterator.next();
            System.out.println(c.toString());
        }

        Collections.sort(commodities, new Commodity_Name());
        System.out.println("After sorting by name:");

        Iterator<Commodity> iterator2 = commodities.iterator();
        while (iterator2.hasNext()) {
            Commodity c2 = iterator2.next();
            System.out.println(c2.toString());
        }
    }

    public void sortByLength() {
        System.out.println("Commodities before soring");
        Iterator<Commodity> iterator = commodities.iterator();
        while (iterator.hasNext()) {
            Commodity c = iterator.next();
            System.out.println(c.toString());
        }
        Collections.sort(commodities, new Commodity_Length());
        System.out.println("After sorting by length:");

        Iterator<Commodity> iterator2 = commodities.iterator();
        while (iterator2.hasNext()) {
            Commodity c2 = iterator2.next();
            System.out.println(c2.toString());

        }
    }

    public void sortByWidth() {
        System.out.println("Commodities before soring");
        Iterator<Commodity> iterator = commodities.iterator();
        while (iterator.hasNext()) {
            Commodity c = iterator.next();
            System.out.println(c.toString());
        }

        Collections.sort(commodities, new Commodity_Width());
        System.out.println("After sorting by width:");

        Iterator<Commodity> iterator2 = commodities.iterator();
        while (iterator2.hasNext()) {
            Commodity c2 = iterator2.next();
            System.out.println(c2.toString());

        }
    }

    public void sortByWeight() {
        System.out.println("Commodities before soring");
        Iterator<Commodity> iterator = commodities.iterator();
        while (iterator.hasNext()) {
            Commodity c = iterator.next();
            System.out.println(c.toString());
        }
        Collections.sort(commodities, new Commodity_Weight());
        System.out.println("After sorting by weight:");

        Iterator<Commodity> iterator2 = commodities.iterator();
        while (iterator2.hasNext()) {
            Commodity c2 = iterator2.next();
            System.out.println(c2.toString());
        }
    }


    public void getElementOfCommodity() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of commodity");
        int element = scanner.nextInt();

        if (element < 0 || element > (commodities.size() - 1)) {
            System.out.println("Commodity with this number does not exist!");
        } else {
            System.out.println("the commodity with " + element + " number is : " + commodities.get(element).toString());
        }
        Collections.sort(commodities, new Sale());
        Iterator<Commodity> iterator = commodities.iterator();
        while (iterator.hasNext()) {
            Commodity c = iterator.next();
            System.out.println(c.toString());
        }
    }

    static boolean isCommodity(List<Commodity> arrayList, String name, int length, int width, int weight) {
        Iterator<Commodity> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Commodity com = iterator.next();
            if (com.getName().equals(name) && com.getLength() == length && com.getWidth() == width && com.getWeight() == weight) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int compare(Commodity o1, Commodity o2) {
        if (o1.getName().compareTo(o2.getName()) != 0) {
            return o1.getName().compareTo(o2.getName());
        } else {
            if (o1.getLength().compareTo(o2.getLength()) != 0) {
                return o1.getLength().compareTo(o2.getLength());
            } else {
                if (o1.getWidth().compareTo(o2.getWidth()) != 0) {
                    return o1.getWidth().compareTo(o2.getWidth());
                } else
                    return o1.getWeight().compareTo(o2.getWeight());
            }
        }
    }

}
