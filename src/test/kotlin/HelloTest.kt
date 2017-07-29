package hello.tests

import hello.getHelloWorld
import org.junit.Test
import kotlin.test.assertEquals

class HelloTest {
    @Test fun testAssert(): Unit {
        assertEquals("Hello World!", getHelloWorld())
    }
}