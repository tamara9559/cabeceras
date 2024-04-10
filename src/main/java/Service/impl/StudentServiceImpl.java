package Service.impl;

import Model.Student;
import Service.StudentImpl;
import mapping.StudentDTO;
import mapping.StudentMapper;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StudentServiceImpl implements StudentImpl {
    private List<Student> students = Arrays.asList(new Student(1,"juan","a",1));

    @Override
    public List<StudentDTO> listar() {
        return students.stream().map(StudentMapper::mapFrom).collect(Collectors.toList());
    }
}
