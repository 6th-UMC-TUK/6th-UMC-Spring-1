package umc.spring.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import umc.spring.domain.Mission;


public interface MissionRepository extends JpaRepository<Mission, Long> {
    Page<Mission> findAllByStore(Mission mission, PageRequest pageRequest);

}
