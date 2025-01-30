package E_LearningPlatformModule.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import E_LearningPlatformModule.entity.Instructor;
import E_LearningPlatformModule.repository.InstructorRepository;

import java.util.List;

@Service
public class InstructorService {

    @Autowired
    private InstructorRepository instructorRepository;

    public Instructor createInstructor(Instructor instructor) {
        return instructorRepository.save(instructor);
    }

    public Instructor getInstructorById(Long instructorId) {
        return instructorRepository.findById(instructorId).orElse(null);
    }

    public List<Instructor> getAllInstructors() {
        return instructorRepository.findAll();
    }

    public Instructor updateInstructor(Long instructorId, Instructor instructorDetails) {
        Instructor instructor = instructorRepository.findById(instructorId).orElse(null);
        if (instructor != null) {
            instructor.setName(instructorDetails.getName());
            instructor.setProfilePhoto(instructorDetails.getProfilePhoto());
            instructor.setBio(instructorDetails.getBio());
            return instructorRepository.save(instructor);
        }
        return null;
    }

    public void deleteInstructor(Long instructorId) {
        instructorRepository.deleteById(instructorId);
    }

    public void linkInstructorToCourse(Long instructorId, Long courseId) {
        Instructor instructor = instructorRepository.findById(instructorId).orElse(null);
        // logic to link instructor to course...
    }
}

