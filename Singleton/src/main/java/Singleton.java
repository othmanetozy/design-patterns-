public class Singleton {
    private static Singleton instance;
    private String Data;

    private Singleton(String data)
    {
        this.Data=data;
    }
    private static Singleton getInstance(String data){
        if (instance == null) {
            synchronized (Singleton.class) {
                instance = new Singleton(data);
            }
        }
        return instance;
    }
}
