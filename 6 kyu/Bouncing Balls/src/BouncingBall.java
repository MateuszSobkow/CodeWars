public class BouncingBall {
    public static int bouncingBall(double h, double bounce, double window) {
        if ((h <= 0) || (bounce <= 0) || (bounce >= 1) || (window >= h))
            return -1;
        int numberOfBounce = 0;
        int timesSawBall = 0;
        while (h > window) {
            //falling
            timesSawBall++;
            h = h * bounce;
            //rising
            if (h > window)
                timesSawBall++;
        }
        return timesSawBall == 0 ? -1 : timesSawBall;
    }

    public static int bouncingBall2(double h, double bounce, double window) {
        if ((h <= 0) || (window >= h) || (bounce <= 0) || (bounce >= 1))
            return -1;
        int seen = -1;
        while (h>window){
            seen += 2;
            h *= bounce;
        }
        return seen;
    }

}
