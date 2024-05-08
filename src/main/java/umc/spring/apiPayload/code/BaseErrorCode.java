package umc.spring.apiPayload.code;

public interface BaseErrorCode<ErrorReason> {

    public ErrorReason getReason();

    public ErrorReason getReasonHttpStatus();
}
