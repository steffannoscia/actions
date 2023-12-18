package adminApi

import spock.lang.Specification

class testTest extends Specification {

    def "test"() {

        when:
        String env = System.properties['env'];
        Properties props = new Properties()  
        File propsFile = new File("env/${env}.properties")  
        propsFile.withInputStream { props.load(it) }  

        then:
        env == "engg"
        props['test_prop'] == "THIS_A_TEST"
        props['ADMIN_CLIENT_SECRET'] == "secretTest"

    }
}
