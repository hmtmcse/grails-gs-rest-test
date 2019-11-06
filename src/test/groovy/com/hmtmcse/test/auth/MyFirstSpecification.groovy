package com.hmtmcse.test.auth


class MyFirstSpecification extends RestAPISpecification<MyFirstSpecification> {



    def setup() {
        this.apiURL = "http://localhost:6601/"
    }

    def "bismillah Test"(){

        when:
        apiRequest.getRequest("/")

        then:
        apiResponse.httpCode == 200

    }


    def "bismillah Test1"(){

        when:
        apiRequest.getRequest("/")

        then:
        apiResponse.httpCode != 200

    }

    def "bismillah Test2"(){

        when:
        apiRequest.getRequest("/")

        then:
        apiResponse.httpCode == 200

    }

}
