package umc.spring.apiPayload.code;

import org.springframework.http.HttpStatus;

import java.awt.desktop.UserSessionEvent;

public interface BaseCode {

    public UserSessionEvent.Reason getReason();

    public UserSessionEvent.Reason getReasonHttpStatus();

    String getCode();
    String getMessage();

}
