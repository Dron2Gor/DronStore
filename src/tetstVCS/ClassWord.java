package tetstVCS;

public class ClassWord {
    private int i=0;

    private int getI() {
        return i;
    }

    public static void main(String[] args) {
        System.out.println("Hallo World "+new ClassWord().getI());
    }
}
