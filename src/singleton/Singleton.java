
package singleton;

/**
 *
 * DESCRIPTION FICHIER
 */
public class Singleton {

    int a;
    
    private Singleton() {
        
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }
 }
