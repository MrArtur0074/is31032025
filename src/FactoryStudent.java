public class FactoryStudent {
    public Student createPovtasStudent(int id, String name) {
        Student a = new Povtas(id, name);
        /* какие-то действия */

        return a;
    }
    public Student createDesignStudent() {
        return new Design();
    }
    public Student createMarketingStudent() {
        return new Marketing();
    }
}
