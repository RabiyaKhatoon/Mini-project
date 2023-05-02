package in.ashokit.repo;

import in.ashokit.entity.CourseEntity;
import in.ashokit.entity.UserDetailsEntity;
import org.hibernate.validator.internal.engine.resolver.JPATraversableResolver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepo extends JpaRepository<CourseEntity, Integer> {

  //  public CourseEntity findByCourseNames(String courseName);

}
