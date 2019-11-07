package com.hmtmcse.gsrest

import com.hmtmcse.httputil.HttpResponse


class GsAPISpecification extends RestAPISpecification {


    private throwError(String defaultMessage, String errorMessage = null) {
        if (errorMessage) {

        }
    }

    public processResponse(HttpResponse response, String errorMessage = null) {
        if (!response) {

        }
    }

    public Map getJsonResponseContent() {
        String response = this.apiResponse.content
        if (response) {
            return stringToMap(response)
        }
        return null
    }

}