public class PaintJob {

    public static void main(String[] args) {
        // Printed values should be: -1, 3, 3, -1, 5, 14, 3, 3 and 5
        System.out.println(getBucketCount(0.75, 0.75, 0.5, 0));
        System.out.println(getBucketCount(-3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));
        System.out.println(getBucketCount(-3.4, 2.1, 1.5));
        System.out.println(getBucketCount(3.4, 2.1, 1.5));
        System.out.println(getBucketCount(7.25, 4.3, 2.35));
        System.out.println(getBucketCount(3.4, 1.5));
        System.out.println(getBucketCount(6.26, 2.2));
        System.out.println(getBucketCount(3.26, 0.75));
    }

    public static int getBucketCount(double width, double height,
                                     double areaPerBucket, int extraBuckets) {
        if (width <= 0.0 || height <= 0.0 ||
            areaPerBucket < 0.0 || extraBuckets < 0) {
            return -1;
        }
        else {
            // the area to be painted
            double area = width * height;
            // taking out paint we already have from paint total
            area -= (extraBuckets * areaPerBucket);
            // returning paint buckets to buy
            return (int) Math.ceil(area / areaPerBucket);
        }
    }

    // Overloaded method for when extraBuckets == 0
    public static int getBucketCount(double width, double height,
                                     double areaPerBucket) {
        return getBucketCount(width, height, areaPerBucket, 0);
    }

    // Overloaded method for when area is known directly
    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0.0 || areaPerBucket <= 0.0) {
            return -1;
        }
        return (int) Math.ceil(area / areaPerBucket);
    }
}
