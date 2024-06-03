package umc.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import umc.spring.domain.mapping.MemberMission;

@Repository
public interface MemberMissionRepository extends JpaRepository<MemberMission, Long> {

//    @Query(value = "SELECT CASE WHEN COUNT(*) > 0 THEN TRUE ELSE FALSE END FROM member_mission WHERE member_id = :memberId AND mission_id = :missionId", nativeQuery = true)
    boolean existsByMemberIdAndMissionId(Long memberId, Long missionId);
}
