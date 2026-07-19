public class HealthRecord {
    // Instance field
    private int height;  // person's height in centimeters

    // Constants (static final)
    private static final int MIN_PERMITTED_HEIGHT = 30;
    private static final int MAX_PERMITTED_HEIGHT = 275;
    private static final int DEFAULT_HEIGHT = 165;

    // TODO: Initialize appropriately
    // Class-level tracking (static)
    private static int tallestHeight = MIN_PERMITTED_HEIGHT;
    private static int shortestHeight = MAX_PERMITTED_HEIGHT;

    private static int counter = 0;      // count number of objects
    private static double averageHeight; // track average height

    public HealthRecord (int height) {
        setHeight(height);
        counter++;
    }


    public int getHeight () {
        return this.height;
    }

    public void setHeight(int height) {

        // TODO: Validate height is within permitted range
        if (height > MIN_PERMITTED_HEIGHT && height < MAX_PERMITTED_HEIGHT) {
            this.height = height;
            if (this.height > tallestHeight) {
                tallestHeight = this.height;
            }
            if (this.height < shortestHeight) {
                shortestHeight = this.height;
            }
        } else {
            this.height = DEFAULT_HEIGHT;
        }
        // Update average using: y' = (y*n + x)/(n+1)
        // Where:
        // y' = new average
        // y = current average
        // n = current count
        // x = new height value
        averageHeight =(averageHeight*counter + this.height) / (counter+1);

    }

    public static int getTallestHeight() {
        return tallestHeight;
    }
    public static int getShortestHeight(){
        return shortestHeight;
    }
    public static double getAverageHeight() { return averageHeight;}
    public String getDetails() {
        return "Height (cm): " + getHeight();
    }

    public static String getClassDetails() {
        return "The tallest height (cm): " + getTallestHeight() + "\n" +
                "The shortest height (cm): " + getShortestHeight() + "\n" +
                "The average height (cm): " + getAverageHeight(); }
}