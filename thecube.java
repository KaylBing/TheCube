/***************\
 * McKayl U.
 * Feb 2024
\***************/

// Define the thecube class //
public class thecube {
    static int[] cubefaces = { // One String to Rule them all //
        0, 1, 2,
        3, 4, 5,
        6, 7, 8,
        // Front //
        9, 10, 11,
        12, 13, 14,
        15, 16, 17,
        // Right //
        18, 19, 20,
        21, 22, 23,
        24, 25, 26,
        // Back //
        27, 28, 29,
        30, 31, 32,
        33, 34, 35,
        // Left //
        36, 37, 38,
        39, 40, 41,
        42, 43, 44,
        // Top //
        45, 46, 47,
        48, 49, 50,
        51, 52, 53,
        // Bottom //
    };

    // Get method //
    public int[] getCubefaces() {
        return cubefaces;
    }

    // Set method //
    public void setCubefaces(int[] cubefaces) {
        this.cubefaces = cubefaces;
    }

    // Top turn method //
    static void toprightturn() {
        int temp = 0;
        // Will hold variable between loops
        for (int num = 0; num < 12; num++) {
            // New index points (+9) //
            int moveto = num + 9;
            temp = cubefaces[moveto];
            // Needs to save old points and put the new ones into the array //
        }
    }
    // Main method //
    public static void main(String[] args) {
        // Creates instance of thecube //
        thecube cube = new thecube();

        // Access the cubefaces array //
        int[] cubefaces = cube.getCubefaces();
        System.out.println("Cubefaces array:");
        for (int i = 0; i < cubefaces.length; i++) {
            System.out.print(cubefaces[i] + " ");
            if ((i + 1) % 3 == 0) { // Print newline every three characters //
                System.out.println();
                // Another function to print out --- every third line to make it a bit easier to read //
            }
        }
    }
}
