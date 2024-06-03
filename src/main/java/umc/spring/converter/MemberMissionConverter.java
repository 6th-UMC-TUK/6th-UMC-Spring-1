package umc.spring.converter;

import umc.spring.domain.Member;
import umc.spring.domain.Mission;
import umc.spring.domain.mapping.MemberMission;
import umc.spring.web.dto.MemberMissionResponseDTO;

import java.time.LocalDateTime;


public class MemberMissionConverter {
    

    public static MemberMissionResponseDTO.AddMMResultDTO toAddMMResultDTO(MemberMission mm) {
        return MemberMissionResponseDTO.AddMMResultDTO.builder()
                .memberMissionId(mm.getId())
                .memberId(mm.getMember().getId())
                .missionId(mm.getMission().getId())
                .createdAt(LocalDateTime.now())
                .build();
    }

    public static MemberMission toMemberMission(Member member, Mission mission) {
        return MemberMission.builder()
                .member(member)
                .mission(mission)
                .build();
    }
}
