package mathClass;

public class findMax {
    public static void main(String[] args) {
        int x = 8;
        int y = 20;
        int z = 6;
        int maxOfXAndY = Math.max(x, y);
        int maxOfXYZ = Math.max(maxOfXAndY, z);

        System.out.println(maxOfXAndY);
        System.out.println(maxOfXYZ);

    }
}
