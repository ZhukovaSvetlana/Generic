public enum AgeCategory {
    YOUNG(18, 29),
    AVERAGE(30, 49),
    ELDERLY(50, 64),
    SENILE(65, 200);

    private final int left;
    private final int right;

    AgeCategory(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public static AgeCategory valueOf(int age) {
        for (AgeCategory value : values()) {
            if ((age >= value.left) && (age <= value.right)){
                return value;
            }
        }
        throw new IllegalArgumentException();
    }
}

/*class AgeCategoryTest {
    private static final AgeCategoryTest[] values;
    private static final AgeCategoryTest YOUNG;
    private static final AgeCategoryTest AVERAGE;
    private static final AgeCategoryTest ELDERLY;
    private static final AgeCategoryTest SENILE;

    private final int left;
    private final int right;

    private AgeCategoryTest(int left, int right) {
        this.left = left;
        this.right = right;
    }

    static {
        values = new AgeCategoryTest[4];
        values[0] = YOUNG = new AgeCategoryTest(18, 29);
        values[1] = AVERAGE = new AgeCategoryTest(30, 49);
        values[2] = ELDERLY = new AgeCategoryTest(50, 64);
        values[3] = SENILE = new AgeCategoryTest(65, 200);
    }

    public static AgeCategoryTest[] values() {
        return values.clone();
    }

    public static AgeCategoryTest valueOf(int age) {
        for (AgeCategoryTest value : values) {
            if ((age >= value.left) && (age <= value.right)){
                return value;
            }
        }
        throw new IllegalArgumentException();
    }
}*/
