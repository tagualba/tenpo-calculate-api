package com.tenpo.calculate.api.validators;

import com.tenpo.calculate.api.exceptions.ValidationException;
import com.tenpo.calculate.api.statics.ErrorCode;

public class CalculateValidator extends Validators {

    public static void validateValues(Double valueA, Double valueB) throws ValidationException {
        String propertiesFailMessage = "";
        if (valueA == null ) {
            propertiesFailMessage += missingFieldDescription("valueA");
        }

        if (valueB == null) {
            propertiesFailMessage += missingFieldDescription("valueB");
        }

        if (propertiesFailMessage.length() > 0) {
            throw new ValidationException(ErrorCode.INVALID_DATA, propertiesFailMessage);
        }
    }

}
