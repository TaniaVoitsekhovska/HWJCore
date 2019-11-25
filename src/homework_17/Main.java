package homework_17;


public class Main {
    public static void main(String[] args) {

        Number[] array = {5, 8, 6, 1, 0, -5, -7, 2, 122};

        Collection collection = new Collection(array);

        System.out.println("Array :");
        for (Number nums : array) {
            System.out.println(nums);
        }
        System.out.println();

        System.out.println("Array from beginning to end, replacing the not odd elements with null:");

        Iterator iteratorForward = collection.createForward();
        while (iteratorForward.hasNext()) {
            Number next = iteratorForward.next();
            if (next.intValue() % 2 != 0) {
                System.out.println("null");
            } else
                System.out.println(next);
        }

        System.out.println();

        System.out.println("Array through one element from end to beginning: ");
        Iterator iteratorBackwards = collection.createBackward();
        while (iteratorBackwards.hasNext()) {
            Number next = iteratorBackwards.next();
            System.out.println(next);
        }

        System.out.println();

        System.out.println("Array every third element if not odd from end to beginning:");
        Iterator iteratorAnonymous = collection.createAnonymous();

        int i = 1;
        while (iteratorAnonymous.hasNext()) {
            Number next = iteratorAnonymous.next();

            if (i % 3 == 0) {
                if (next.intValue() % 2 != 0) {
                    System.out.println(next);
                }
            }
            i++;
        }

        System.out.println();


        System.out.println("Array from beginning to end, every fifth number if is odd, change to number-100");

        Iterator iteratorLocal = collection.createLocal();
        int j = 1;
        while (iteratorLocal.hasNext()) {
            Number next = iteratorLocal.next();

            if (j % 5 == 0) {
                if (next.intValue() % 2 == 0) {
                    System.out.println(next.intValue() - 100+"  /was odd/");
                }
            }else
                System.out.println(next);

            j++;
        }
        System.out.println();


        System.out.println("Array from beginning to end,if every second number is odd, make it not odd :");
        Iterator iteratorStatic = Collection.createStatic();

        int k = 1;
        while (iteratorStatic.hasNext()) {
            Number next = iteratorStatic.next();

            if (k % 2 == 0) {
                if (next.intValue() % 2 == 0) {
                    System.out.println(next.intValue() + 1+ "  / was odd/");
                }
            }else
                System.out.println(next);

            k++;
        }
    }
}
