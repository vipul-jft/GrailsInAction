package qotd

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class QuoteControllerSpec extends Specification implements ControllerUnitTest<QuoteController> {

    def setup() {
    }

    def cleanup() {
    }

    void "Test message action"() {
        when:"The message action is invoked"
        controller.message()
        then:"Hello is returned"
        response.text == 'Hello'
    }
}
