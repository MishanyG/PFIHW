package HomeWork_L7.repository;

import HomeWork_L7.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository <StudentEntity, Long> {

}
