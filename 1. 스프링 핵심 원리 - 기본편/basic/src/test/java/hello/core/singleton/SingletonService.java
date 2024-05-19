package hello.core.singleton;

public class SingletonService {
    // 1. static 영역에 객체 instance를 하나 생성해서 올려둠.
    private static final SingletonService instance = new SingletonService();
    // 2. 생성자를 private으로 선언해서 외부에서 new 키워드를 사용한 객체 생성을 못하게 막음
    private SingletonService() {}
    // 3. public으로 열어서 객체 인스턴스가 필요하면 이 static 메서드를 통해서 조회되도록 함
    public static SingletonService getInstance() {
        return instance;
    }
}
