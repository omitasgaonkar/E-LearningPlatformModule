package E_LearningPlatformModule.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import E_LearningPlatformModule.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
}

