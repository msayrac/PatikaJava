package first;

public class Calculate {

    public static void calcAverage(Course[] notes) {
        double total = 0;
        for (int c = 0; c < notes.length; c++) {
            total += notes[c].note;
        }
        double average = total / notes.length;
        System.out.println("Ortalamanız for : "+average);
    }



}
