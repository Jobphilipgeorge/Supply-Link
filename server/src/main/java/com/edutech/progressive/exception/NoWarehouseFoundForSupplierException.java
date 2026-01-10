// package com.edutech.progressive.exception;

// public class NoWarehouseFoundForSupplierException {
// }

package com.edutech.progressive.exception;
// extends RuntimeException
public class NoWarehouseFoundForSupplierException extends RuntimeException {
    public NoWarehouseFoundForSupplierException(String message) {
        super(message);
    }
}