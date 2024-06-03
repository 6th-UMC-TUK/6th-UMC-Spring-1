package umc.spring.web.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import umc.spring.validation.annotation.MemberExists;
import umc.spring.validation.annotation.StoreExists;

public class ReviewRequestDTO {

    @Getter
    @Setter
    public static class AddReviewDto {

        @NotBlank(message = "Review title is required")
        private String title;

        @NotBlank(message = "Review content is required")
        private String content;

        @NotNull(message = "Score is required")
        private Float score;

        @NotNull(message = "Member ID is required")
        @StoreExists
        private Long memberId;

        @NotNull(message = "Store ID is required")
        @MemberExists
        private Long storeId;
    }

    @Getter
    @Setter
    public static class ReveiwDTO {
        @NotBlank(message = "Review title is required")
        private String title;

        @NotBlank(message = "Review content is required")
        private String content;

        @NotNull(message = "Score is required")
        private Float score;
    }
}

