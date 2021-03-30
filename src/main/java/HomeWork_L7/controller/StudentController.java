package HomeWork_L7.controller;

import HomeWork_L7.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {

    public final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping(value = "/allStudents")
    public String listStudent(Model model) {
        model.addAttribute("students", studentService.findAll());
        return "student";
    }

    @GetMapping("/newStudent")
    public String addStudent() {
        return "addStudent";
    }

    @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
    public String addNewProduct(@RequestParam("id") Long id, @RequestParam("prod") String name, @RequestParam("price") int age) {
        studentService.update(id, name, age);
        return "student";
    }

    @RequestMapping(value = "/editStudent")
    public String editStudent(Model model, @RequestParam("id") Long id) {
        model.addAttribute("students", studentService.findById(id));
        return "updateStudent";
    }

    @RequestMapping(value = "/updateStudent")
    public String updateStudent(@RequestParam("id") Long id, @RequestParam("name") String name, @RequestParam("age") int age) {
        studentService.update(id, name, age);
        return "student";
    }

    @RequestMapping(value = "/deleteStudent")
    public String deleteStudent(@RequestParam("idDel") Long id) {
        studentService.delete(id);
        return "student";
    }
}