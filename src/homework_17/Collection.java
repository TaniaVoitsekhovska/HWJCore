package homework_17;

public class Collection {

    private static Number[] nums;

    public Collection(Number[] nums) {
        this.nums = nums;
    }

    public class Forward implements Iterator {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < nums.length;
        }

        @Override
        public Number next() {
            return nums[index++];
        }
    }

    public Forward createForward() {
        return new Forward();
    }


    public class Backward implements Iterator {
        private int index = nums.length - 1;

        @Override
        public boolean hasNext() {
            return index >= 0;
        }

        @Override
        public Number next() {
            index = index - 2;
            return nums[index+2];
        }
    }

    public Backward createBackward() {
        return new Backward();
    }

    public Iterator createAnonymous() {
        return new Iterator() {
            private int index = nums.length - 1;

            @Override
            public boolean hasNext() {
                return index >= 0;
            }

            @Override
            public Number next() {
                return nums[index--];
            }
        };
    }

    public Iterator createLocal() {
        class Local implements Iterator {

            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < nums.length;
            }

            @Override
            public Number next() {
                return nums[index++];
            }
        }

        return new Local();
    }


    static class Static implements Iterator {
        private int i = 0;

        @Override
        public boolean hasNext() {
            return i < nums.length;
        }

        @Override
        public Number next() {
            return nums[i++];
        }
    }

    static Static createStatic() {
        return new Static();
    }
}
