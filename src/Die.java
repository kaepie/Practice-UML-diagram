//6510450291 Chutipong Triyasith
public class Die {
    private int faceValue;
    public void roll(){
        faceValue = (int) (Math.random() * 6) + 1;
    }

    public int getFaceValue() {
        return faceValue;
    }
}
