public class Main {
    public static void main(String[] args) {
        UserSessionManager sessionManager = UserSessionManager.getInstance();
        System.out.println("Token Acesso: " + sessionManager.getSessionToken());
        System.out.println("Último Acesso: " + sessionManager.getLastAccess());

        sessionManager.updateLastAccessTime();

        System.out.println("Token Acesso: " + sessionManager.getSessionToken());
        System.out.println("Último Acesso: " + sessionManager.getLastAccess());
    }
}
