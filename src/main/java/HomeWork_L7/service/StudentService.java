package HomeWork_L7.service;

import HomeWork_L7.entity.StudentEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    void delete(Long id);
    void update(Long id, String name, int age);
    StudentEntity findById(Long id);
    List <StudentEntity> findAll();
}