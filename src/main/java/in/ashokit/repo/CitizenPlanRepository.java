package in.ashokit.repo;

import in.ashokit.entity.CitizenPlan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CitizenPlanRepository extends JpaRepository<CitizenPlan, Integer> {

    @Query("select distinct(planName) from CitizenPlan")
    public List<String> getDistinctPlanNames();

    @Query("select distinct(planStatus) from CitizenPlan")
    public List<String> getDistinctPlanStatus();
}

