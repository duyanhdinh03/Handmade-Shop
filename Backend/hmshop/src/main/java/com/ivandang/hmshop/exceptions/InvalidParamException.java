package com.ivandang.hmshop.exceptions;

public class InvalidParamException extends RuntimeException {
  public InvalidParamException(String message) {
    super(message);
  }

  public InvalidParamException(String message, Throwable cause) {
    super(message, cause);
  }
}