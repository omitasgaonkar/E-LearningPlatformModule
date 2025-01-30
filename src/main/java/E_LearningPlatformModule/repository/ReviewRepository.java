package E_LearningPlatformModule.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import E_LearningPlatformModule.entity.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {
	
	    List<Review> findByCourse_CourseId(Long courseId); // If 'courseId' is the field in Course
	}



