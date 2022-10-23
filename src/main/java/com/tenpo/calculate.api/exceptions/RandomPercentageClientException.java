package com.tenpo.calculate.api.exceptions;

import com.tenpo.calculate.api.statics.ErrorCode;

public class RandomPercentageClientException extends Exception {

    private ErrorCode clientErrorCode;

    public RandomPercentageClientException(ErrorCode clientErrorCode) {
        super(clientErrorCode.getMessage());
        this.clientErrorCode = clientErrorCode;
    }

    public RandomPercentageClientException(ErrorCode clientErrorCode, String message) {
        super(message);
        this.clientErrorCode = clientErrorCode;
    }

    public RandomPercentageClientException(ErrorCode clientErrorCode, String message, Throwable cause) {
        super(message, cause);
        this.clientErrorCode = clientErrorCode;
    }

    public ErrorCode getClientErrorCode() {
        return clientErrorCode;
    }

}
