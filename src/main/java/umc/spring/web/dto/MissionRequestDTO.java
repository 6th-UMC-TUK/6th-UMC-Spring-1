package umc.spring.web.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import umc.spring.validation.annotation.StoreExists;

import java.time.LocalDate;

public class MissionRequestDTO {

    @Getter
    @Setter
    public static class AddMissionDto {

        @NotBlank(message = "Mission specification is required")
        private String missionSpec;

        @NotNull(message = "Deadline is required")
        private LocalDate deadline;

        @NotNull(message = "Reward is required")
        private Integer reward;

        @NotNull(message = "Store ID is required")
        @StoreExists
        private Long storeId;
    }
}
