// package com.edutech.progressive.exception;

// public class InsufficientCapacityException {
// }

package com.edutech.progressive.exception;

public class InsufficientCapacityException extends RuntimeException{
    public InsufficientCapacityException(String message) {
        super(message);
    }
}