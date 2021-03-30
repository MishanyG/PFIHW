package HomeWork_L7.service;

import HomeWork_L7.entity.StudentEntity;
import HomeWork_L7.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
@Transactional
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void delete(Long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public void update(Long id, String name, int age) {
        StudentEntity student = new StudentEntity(id, name, age);
        studentRepository.saveAndFlush(student);
    }

    @Override
    public StudentEntity findById(Long id) {
        return studentRepository.findById(id).orElse(new StudentEntity());
    }

    @Override
    public List <StudentEntity> findAll() {
        return studentRepository.findAll();
    }
}