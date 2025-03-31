public class Povtas implements Student{
    private int id;
    private String name;

    public Povtas(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String finalSpeech() {
        return "Агай, пожалуйста";
    }

    public Povtas copy() {
        return new Povtas(id, name);
    }
}
