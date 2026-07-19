public static void main(String[] args) {
        // Create and test student records
        HealthRecord student1 = new HealthRecord(120);
        HealthRecord student2 = new HealthRecord(55);
        HealthRecord student3 = new HealthRecord(280);

        // Display individual records
        System.out.println(student1.getDetails()); // Expected: 120
        System.out.println(student2.getDetails()); // Expected: 55
        System.out.println(student3.getDetails()); // Expected: 165 (default, as 280 is invalid)

        // Display class statistics
        System.out.println(HealthRecord.getClassDetails()); // Expected: tallest=120, shortest=55
}
