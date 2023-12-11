import java.util.Random;

public class UserSessionManager {

    private int sessionToken;

    private String lastAccess;

    private static UserSessionManager instance;

    private UserSessionManager() {
        this.lastAccess = String.valueOf(System.currentTimeMillis());
    }

    public int getSessionToken() {
        return sessionToken = new Random().nextInt(0, 10);
    }

    public String getLastAccess() {
        return lastAccess;
    }

    public void updateLastAccessTime() {
        this.lastAccess = String.valueOf(System.currentTimeMillis());
    }

    public static UserSessionManager getInstance(){
        if (instance == null){
            instance = new UserSessionManager();
        }
        return instance;
    }
}
