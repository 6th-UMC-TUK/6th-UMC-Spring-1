package umc.spring.validation.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import lombok.RequiredArgsConstructor;
import umc.spring.repository.MemberMissionRepository;
import umc.spring.validation.annotation.UniqueChallenge;

@RequiredArgsConstructor
public class UniqueChallengeValidator implements ConstraintValidator<UniqueChallenge, Long> {

    private final MemberMissionRepository memberMissionRepository;

    @Override
    public boolean isValid(Long value, ConstraintValidatorContext context) {
        // Assume that the MemberMissionRepository has a method existsByMemberIdAndMissionId
        return !memberMissionRepository.existsByMemberIdAndMissionId(value, value);
    }
}
