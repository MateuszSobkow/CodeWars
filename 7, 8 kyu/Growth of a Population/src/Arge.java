class Arge {

    public static int nbYear(int p0, double percent, int aug, int p) {
//        boolean isReady = false;
//        int years = 0;
//        while (!isReady) {
//            years += 1;
//
//            p0 = (int) ((p0 + (p0 * percent / 100)) + aug);
//
//            if (p0 >= p)
//                isReady = true;
//
//        }
//        return years;
//    }

        int years = 0;
        while (p0 < p) {
            p0 += p0 * percent / 100 + aug;
            years++;
        }
        return years;
    }
}
