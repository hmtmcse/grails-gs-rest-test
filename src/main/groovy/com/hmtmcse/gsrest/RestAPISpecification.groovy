package com.hmtmcse.gsrest

import com.hmtmcse.httputil.HttpResponse
import com.hmtmcse.httputil.HttpUtil
import com.hmtmcse.jtfutil.parser.JsonReadWrite
import spock.lang.Specification

class RestAPISpecification extends Specification {

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

    String mapToString(Map data){
        JsonReadWrite jsonReadWrite = new JsonReadWrite()
        try{
            return jsonReadWrite.objectAsJsonString(data)
        }catch(Exception e){
            return null
        }
    }

    Map stringToMap(String data){
        JsonReadWrite jsonReadWrite = new JsonReadWrite()
        try{
            return jsonReadWrite.readJsonStringToMap(data)
        }catch(Exception e){
            return null
        }
    }

}