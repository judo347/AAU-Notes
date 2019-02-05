public class Times {

    Plus plus;
    int x = 1;

    public Times(Plus plus) {
        this.plus = plus;
    }

    public int getResult(){
        return plus.getResult() * 1;
    }
}
