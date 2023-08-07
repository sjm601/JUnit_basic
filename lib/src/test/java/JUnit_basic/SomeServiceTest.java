package JUnit_basic;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.fail;

import org.assertj.core.error.ShouldBeNullOrEmpty;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Assertion 테스트 클래스
 * @author 박상훈
 *
 */
public class SomeServiceTest {
	
	SomeServiceImpl someServiceImpl;
	
	@BeforeEach
	void CreateSomeSerivce() {
		someServiceImpl = new SomeServiceImpl();
	}
	
	@Test
	void sumTest() {
		int result = someServiceImpl.sum(8, 23);
//		System.out.println(result);
		//assertEquals(31, result); //예상값, 결과값
		String str = "김기정";
	//	assertNotNull(str);
		assertThat(result)
			.isEqualTo(31)
			.isGreaterThan(20)
			.isBetween(10, 50);
	}
	
	@Test
	void getMessageTest() {
//		assertNotNull(someServiceImpl.getMessage());
//		assertEquals("아스날 커뮤니티 실드 우승", someServiceImpl.getMessage());
//		someServiceImpl.getMessage();
//		assertThat(someServiceImpl.getMessage())
//		.isNotNull()
//		.contains("아스날");
		
		//given
		String containMessage = "Hello";
		//when
		String result = someServiceImpl.getMessage();	
		//then
		assertThat(result)
			.contains(containMessage);
	}
	
	@Test
	void xxxTest() {
//		fail("승욱이가 구현한 기능인데 아직 구현 안됨...");
	}
}
