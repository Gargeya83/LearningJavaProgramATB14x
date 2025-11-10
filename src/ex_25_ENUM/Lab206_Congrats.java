package ex_25_ENUM;

public class Lab206_Congrats {
    public static void main(String[] args) {
        System.out.println(Env.DEV.getBaseURL());
        System.out.println(Env.PROD.getBaseURL());
    }
}
