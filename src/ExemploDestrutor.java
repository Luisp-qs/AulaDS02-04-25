public class ExemploDestrutor {
    protected void finalize() {
        System.out.println("Objeto está sendo removido pelo Garbage Collector");
    }

    public static void main(String[] args) {
        ExemploDestrutor exemplo = new ExemploDestrutor();
        exemplo = null;
        System.gc();
    }
}
