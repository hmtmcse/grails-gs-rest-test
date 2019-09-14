package com.hmtmcse.gsrest


class MyFirstSpecification extends GSSpecification<MyFirstSpecification> {



    def "bismillah Test"(){
        expect:
        Math.max(a, b) == c

        where:
        a << [5, 3]
        b << [1, 9]
        c << [5, 9]
    }

}
