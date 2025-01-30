package E_LearningPlatformModule.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import E_LearningPlatformModule.entity.Instructor;

public interface InstructorRepository extends JpaRepository<Instructor, Long> {
}

