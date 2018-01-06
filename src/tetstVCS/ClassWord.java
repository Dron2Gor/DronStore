package tetstVCS;

public class ClassWord {
    private int i=0;

    private int getI() {
        return i;
    }

    private void setI(int i) {
        this.i = i;
    }

    public static void main(String[] args) {
        ClassWord classWord=new ClassWord();
        classWord.setI(8);
        System.out.println("Hallo World "+classWord.getI());
    }
}
