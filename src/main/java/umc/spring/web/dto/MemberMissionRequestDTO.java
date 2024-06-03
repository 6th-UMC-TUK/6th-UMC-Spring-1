package umc.spring.web.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import umc.spring.validation.annotation.UniqueChallenge;

public class MemberMissionRequestDTO {

    @Getter
    @Setter
    public static class ChallengeDto {

        @NotNull(message = "Member ID is required")
        @UniqueChallenge
        private Long memberId;

        @NotNull(message = "Mission ID is required")
        @UniqueChallenge
        private Long missionId;

    }
}
