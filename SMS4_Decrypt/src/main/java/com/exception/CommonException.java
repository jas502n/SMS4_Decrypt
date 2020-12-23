package com.exception;

public class CommonException extends RuntimeException {
   public int errorCode = -1;

   public CommonException(String message) {
      super(message);
   }

   public CommonException(String message, Throwable e) {
      super(message, e);
   }

   public CommonException(int errorCode, String message) {
      super(message);
      this.errorCode = errorCode;
   }

   public CommonException(int errorCode, String message, Throwable e) {
      super(message, e);
      this.errorCode = errorCode;
   }

   public int getErrorCode() {
      return this.errorCode;
   }

   public void setErrorCode(int errorCode) {
      this.errorCode = errorCode;
   }
}
