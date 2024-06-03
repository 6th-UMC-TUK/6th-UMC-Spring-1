package umc.spring.web.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

public class MemberMissionResponseDTO {

    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class AddMMResultDTO {
        private Long memberMissionId;
        private Long memberId;
        private Long missionId;
        private LocalDateTime createdAt;
    }
}
