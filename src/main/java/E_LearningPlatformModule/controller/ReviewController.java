package E_LearningPlatformModule.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import E_LearningPlatformModule.entity.Course;
import E_LearningPlatformModule.entity.Review;
import E_LearningPlatformModule.service.ReviewService;

import java.util.List;

@RestController
@RequestMapping("/api/courses/{courseId}/reviews")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @PostMapping
    public Review addReview(@PathVariable Long courseId, @RequestBody Review review) {
        review.setCourse(new Course()); // Associate with the course
        review.getCourse().setCourseId(courseId);
        return reviewService.addReview(review);
    }

    @PutMapping("/{reviewId}")
    public Review updateReview(@PathVariable Long reviewId, @RequestBody Review reviewDetails) {
        return reviewService.updateReview(reviewId, reviewDetails);
    }

    @GetMapping
    public List<Review> getReviews(@PathVariable Long courseId) {
        return reviewService.getReviewsByCourse(courseId);
    }

    @DeleteMapping("/{reviewId}")
    public void deleteReview(@PathVariable Long reviewId) {
        reviewService.deleteReview(reviewId);
    }
}

