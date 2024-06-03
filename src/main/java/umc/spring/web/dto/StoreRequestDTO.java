package umc.spring.web.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

public class StoreRequestDTO {

    @Getter
    @Setter
    public static class AddStoreDto {

        @NotBlank(message = "Store name is required")
        private String name;

        @NotBlank(message = "Address is required")
        private String address;

        @NotBlank(message = "Food category is required")
        private String foodCategory;

        @NotBlank(message = "OwnerNickName is required")
        private String ownerNickName;

        @NotNull(message = "Region ID is required")
        private Long regionId;

    }

}
