public class President implements Student{
    private static President president;
    private President() {}

    @Override
    public String finalSpeech() {
        return "Я здесь власть";
    }

    public static President getPresident() {
        if (president == null) {
            president = new President();
        }

        return president;
    }
}
