import groovy.util.GroovyTestCase

class FizzBuzzTest extends GroovyTestCase {
    void testThreeBecomesFizz() {
        fizzer = new FizzBuzzer

        assert fizzer.fizzbuzz(3) == "Fizz"
}
