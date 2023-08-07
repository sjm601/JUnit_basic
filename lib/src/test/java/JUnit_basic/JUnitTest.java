package JUnit_basic;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(value=MethodOrderer.OrderAnnotation.class)
public class JUnitTest {

		@BeforeAll
		static void initAll() {
			System.out.println("딱 한번 초기화 메소드...");
		}
	
		@BeforeEach
		void init() {
			System.out.println("테스트 메소드 실행전 초기화 작업 실행");
		}
		@Test
		@DisplayName("사용자 로그인 체크 기능")
		@Order(4)
		void myTest() {
			System.out.println("테스트입니당");
		}
		@Test
		@Order(2)
		void myTest2() {
			System.out.println("테스트입니당22222222222222");
		}
		
		@Test
		@Order(5)
		void myTest3() {
			System.out.println("테스트입니다333333333333333");
		}

		@Test
		@Order(1)
		void myTest4() {
			System.out.println("테스트입니다444444444444444");
		}
		
		@Test
		@Order(3)
		void myTest5() {
			System.out.println("테스트입니다55555555555555");
		}
		@AfterEach
		void  destroy() {
			System.out.println("자원 해제 코드입니다....");
		}

		@AfterAll
		static void  destroyAll() {
			System.out.println("딱 한번 자원 해제 코드입니다....");
		}


}
