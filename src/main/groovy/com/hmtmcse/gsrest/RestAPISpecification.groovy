package com.hmtmcse.gsrest

import com.hmtmcse.httputil.HttpResponse
import com.hmtmcse.httputil.HttpUtil
import spock.lang.Specification

class RestAPISpecification<T> extends Specification {

    public String apiURL = null
    private HttpUtil httpUtil = null
    private HttpResponse httpResponse = null



    HttpUtil getApiRequest() {
        if (!this.httpUtil){
            this.httpUtil = new HttpUtil()
            this.httpUtil.baseURL = apiURL
        }
        return this.httpUtil
    }

    HttpResponse getApiResponse(){
        return this.httpUtil.send()
    }

    void sent(){
        if (this.httpUtil){
           this.httpResponse = this.httpUtil.send()
        }
    }


}