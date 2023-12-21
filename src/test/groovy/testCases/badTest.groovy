package testCases

import spock.lang.Specification

class testTest extends Specification {

    def "test"() {

        when:
        String env = System.properties['env'];
        Properties props = new Properties()  
        File propsFile = new File("env/${env}.properties")  
        propsFile.withInputStream { props.load(it) }  

        then:
        env == "stage"
        props['admin_client_secret'] == "stagetest"

    }
}
