package tests;

import org.junit.jupiter.api.*;


public class SimpleJUnitTest {
    int result;
    @BeforeAll //вообще общая конфигурация для всего (например открытие опред браузера)
    static void beforeAll(){ //для BeforeAll всегда должно быть строка потом static
        System.out.println("### beforeAll()\n");
    }

    @BeforeEach //делаем метод для всех тестов (это начало для всех тестов)
    void beforeEach(){
        System.out.println("###   beforeEach()");
        result = getResult();
    }
    @AfterEach //это то что повторяется для каждого теста в конце тестов
    void afterEach(){
        System.out.println("###   afterEach()\n");
        result = 0;
    }
    @AfterAll //вообще общая конфигурация для всего после того как выполнились тесты (например, очистка чего то)
    static void afterAll(){ //для AfterAll всегда должно быть строка потом static
        System.out.println("### afterAll()\n");
    }
    @Test //аннотация, это метод ниже это тест для Junit (эта метка из библиотеки взята)
    void firstTest() {

        System.out.println("###    firstTest()");
        Assertions.assertTrue(result>2);
    }
    @Test
    void secondTest() {

        System.out.println("###    secondTest()");
        Assertions.assertTrue(result>2);
    }
    @Test
    void thirdTest() {

        System.out.println("###    thirdTest()");
        Assertions.assertTrue(result>2);
    }
    private int getResult(){
        return 3;
    }
}
/*
это пример жизненного цикла теста
цикл состоит из самого теста,
а также возможность перед тестом выполнить метод
отмеченной аннотации BeforeEach() и после выполнить AfterEach()
ну и перед всеми тестами выполнить общую аннотацию BeforeAll() не забыть написать слово static
и после заверешения всех тестов выполнить общую аннотацию AfterAll() не забыть написать слово static

 */