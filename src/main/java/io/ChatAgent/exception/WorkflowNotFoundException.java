package io.ChatAgent.exception;

/**
 * 例外類別，表示在系統中找不到指定的工作流。
 */
public class WorkflowNotFoundException extends RuntimeException {

    /**
     * 建構函數，使用指定的訊息創建例外。
     *
     * @param message 錯誤訊息，描述為什麼拋出這個例外。
     */
    public WorkflowNotFoundException(String message) {
        super(message);
    }

    /**
     * 建構函數，使用指定的訊息和根本原因創建例外。
     *
     * @param message 錯誤訊息，描述為什麼拋出這個例外。
     * @param cause 根本原因，可能是另一個例外。
     */
    public WorkflowNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
