package chnu.edu.kn.ml;


public class Main {
    public static void main(String[] args) {
        Cone cone = new Cone(5, 10);
        System.out.println(cone.volume());
        System.out.println(cone.surfaceArea());
        System.out.println(cone.getDiameter());
        System.out.println(cone.getCircumference());
        System.out.println(cone.baseArea());

    }
}
