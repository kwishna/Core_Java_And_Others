package junit;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@DisplayName("AppTest")
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class App_Test {

    @DisplayName("shouldAnswerWithTrue")
	@ParameterizedTest(name = "For example, year {0} is not supported.")
	@ValueSource(ints = { -1, -4, 5, 6, -8 })
	public void shouldAnswerWithTrue(int i) {
		System.out.println("----- 1st Test -----> "+i);
		Assertions.assertTrue(true);
	}

	@BeforeAll
    @DisplayName("initAll")
	static void initAll() {
        System.out.println("----- Before All -----");
	}

	@BeforeEach
    @DisplayName("init")
	void init() {
        System.out.println("----- Before Each -----");
	}

	@Test
    @DisplayName("succeedingTest")
	void succeedingTest() {
        System.out.println("----- Test 2 -----");
	}

	@Test
    @DisplayName("failingTest")
    void failingTest() {
        Assertions.fail("a failing test");
    }

	@Test
    @DisplayName("skippedTest")
	@Disabled("for demonstration purposes")
	void skippedTest() {
        System.out.println("----- Skipped Test -----");
	}

	@Test
    @DisplayName("abortedTest")
	void abortedTest() {
        System.out.println("--- Test 3 ---");
		Assumptions.assumeTrue("abc".contains("Z"));
		Assertions.fail("test should have been aborted");
	}

	@AfterEach
    @DisplayName("tearDown")
	void tearDown() {
        System.out.println("----- After Each -----");
	}

	@AfterAll
    @DisplayName("tearDownAll")
	static void tearDownAll() {
        System.out.println("----- After All -----");
	}

	@Nested
	@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
	class A_year_is_a_leap_year {

		@Test
//		@EnabledIfEnvironmentVariable()
//		@EnabledIfSystemProperty()
		@EnabledOnJre({ JRE.JAVA_11, JRE.JAVA_8 })
		@DisabledOnOs(OS.MAC)
		@EnabledIfSystemProperty(named = "os.arch", matches = ".*64.*")
		@EnabledIf("2 * 3 == 6")
//		@EnabledOnOs()
		void if_it_is_divisible_by_4_but_not_by_100() {
		}

		@ParameterizedTest(name = "Year {0} is a leap year.")
		@ValueSource(ints = { 2016, 2020, 2048 })
		void if_it_is_one_of_the_following_years(int year) {
		}

	}

	@Disabled("Disabled until bug #99 has been fixed")
	class DisabledClassDemo {

		@Test
		void testWillBeSkipped() {
		}

	}
}
