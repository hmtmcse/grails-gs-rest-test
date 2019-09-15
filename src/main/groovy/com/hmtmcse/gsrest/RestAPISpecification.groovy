package com.hmtmcse.gsrest

import spock.lang.Specification

class RestAPISpecification<T> extends Specification {

    public String apiURL = null

    String getApiURL() {
        return apiURL
    }

    T setApiURL(String apiURL) {
        this.apiURL = apiURL
        return T
    }


}