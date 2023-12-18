package testCases

import spock.lang.Specification

class testTest extends Specification {

    def "test"() {

        when:
        def bad = "BAD"

        then:
        bad != "BAD"

    }
}
