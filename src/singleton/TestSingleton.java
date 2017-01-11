
package singleton;

/**
 * @author LevFlavien
 */
public class TestSingleton {
    
    public static void main(String[] args) {        
        assert(Singleton.getInstance() == Singleton.getInstance()):"ok";
    }

}
