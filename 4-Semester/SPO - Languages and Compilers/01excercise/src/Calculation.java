public class Calculation {

    String rawInput;

    public Calculation(String rawInput) {
        this.rawInput = rawInput;
    }

    public int getResult() {

        return new Times(new Plus(getA(rawInput), getN(rawInput))).getResult();
    }

    private int getA(String string){
        return Integer.valueOf(string.substring(0, string.indexOf(" ")));
    }

    private int getN(String string){

        int firstSpace = string.indexOf(" ");
        int secondSpace = string.substring(firstSpace).indexOf(" ");
        int thirdSpace = string.substring(secondSpace).indexOf(" ");

        return Integer.valueOf(string.substring(secondSpace, thirdSpace));
    }
}
