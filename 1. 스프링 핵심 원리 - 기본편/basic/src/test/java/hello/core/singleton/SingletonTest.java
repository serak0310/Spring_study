package hello.core.singleton;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SingletonTest {

    @Test
    @DisplayName("싱글톤 패턴을 적용한 객체 사용")
    void singletonServiceTest() {
        SingletonService instance1 = SingletonService.getInstance();
        SingletonService instance2 = SingletonService.getInstance();

        // same: 대상의 주소값을 비교. == 객체 인스턴스와 같은 참조어를 비교.
        // equal: 대상의 내용을 비교. Java의 Equals를 오버라이드.
        Assertions.assertThat(instance1).isSameAs(instance2);
    }
}
