import static java.util.stream.IntStream.range;

class FirstNonConsecutive {
    static Integer find(final int[] array) {
        if(array == null || array.length <= 1)
            return null;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] + 1 != array[i+1])
                return array[i+1];
        }
        return null;
    }
    static Integer find2(final int[] array) {
        return range(1, array.length).filter(i -> array[i] - array[i - 1] != 1).mapToObj(i -> array[i]).findFirst().orElse(null);
    }
        public static void main(String[] args) {
        System.out.println(find(new int[]{1, 2, 3, 4, 6, 7, 8}));
    }
}
