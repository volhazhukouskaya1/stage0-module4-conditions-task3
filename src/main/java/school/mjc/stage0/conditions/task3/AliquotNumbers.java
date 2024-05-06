package school.mjc.stage0.conditions.task3;

public class AliquotNumbers {
    public void isFirstAliquot(int first, int second) {
        int a = second/first;
        double b = second % first;

        if (a>1 && b == 0)
        { System.out.println("Aliquot");}
        else
        { System.out.println("Not aliquot");}

    }
}
