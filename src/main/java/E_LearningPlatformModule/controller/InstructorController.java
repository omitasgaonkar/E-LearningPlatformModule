package E_LearningPlatformModule.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import E_LearningPlatformModule.entity.Instructor;
import E_LearningPlatformModule.service.InstructorService;

import java.util.List;

@RestController
@RequestMapping("/api/instructors")
public class InstructorController {

    @Autowired
    private InstructorService instructorService;

    @PostMapping
    public Instructor createInstructor(@RequestBody Instructor instructor) {
        return instructorService.createInstructor(instructor);
    }

    @GetMapping("/{instructorId}")
    public Instructor getInstructor(@PathVariable Long instructorId) {
        return instructorService.getInstructorById(instructorId);
    }

    @GetMapping
    public List<Instructor> getAllInstructors() {
        return instructorService.getAllInstructors();
    }

    @PutMapping("/{instructorId}")
    public Instructor updateInstructor(@PathVariable Long instructorId, @RequestBody Instructor instructorDetails) {
        return instructorService.updateInstructor(instructorId, instructorDetails);
    }

    @DeleteMapping("/{instructorId}")
    public void deleteInstructor(@PathVariable Long instructorId) {
        instructorService.deleteInstructor(instructorId);
    }

    @PostMapping("/{instructorId}/courses/{courseId}")
    public void linkInstructorToCourse(@PathVariable Long instructorId, @PathVariable Long courseId) {
        instructorService.linkInstructorToCourse(instructorId, courseId);
    }
}

