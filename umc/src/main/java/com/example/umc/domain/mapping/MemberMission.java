package com.example.umc.domain.mapping;

import com.example.umc.domain.Member;
import com.example.umc.domain.Mission;
import com.example.umc.domain.common.BaseEntity;
import com.example.umc.domain.enums.MissionStatus;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class MemberMission extends BaseEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private MissionStatus status;

    @ManyToOne
    @JoinColumn(name = "member")  // Foreign Key 컬럼 이름
    private Member member;  // Member와의 관계 설정

    @ManyToOne
    @JoinColumn(name = "mission")  // Foreign Key 컬럼 이름
    private Mission mission;  // Member와의 관계 설정
}
