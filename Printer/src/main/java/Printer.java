public class Printer {

    private int sheetsOfPaper;
    private int tonerVolume;

    public Printer(int sheetsOfPaper, int tonerVolume){

        this.sheetsOfPaper = sheetsOfPaper;
        this.tonerVolume = tonerVolume;

    }

    public int getSheetsOfPaper() {

        return this.sheetsOfPaper;
    }

    public int getTonerVolume() {
        return this.tonerVolume;
    }
}
