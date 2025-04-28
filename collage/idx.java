class idx {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            // Print spaces
            for (int k = 1; k < i; k++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = i; j <= 5; j++) {
                System.out.print("*");
            }
            // Move to next line
            System.out.println();
        }
    }
}