package hello.core.singletone;

public class SingletonService {
    private static final SingletonService instance = new SingletonService();


    // 조회 할 때는 이 메서드를 쓰면 됨.(public으로 열어 놓았음)
    public static SingletonService getInstance() {
        return instance;
    }

    //생성자를 private를 선언해서 외부에서 new 키워드를 사용한 객체 생성을 못하게 막는다.
    private SingletonService() {
    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }
}
