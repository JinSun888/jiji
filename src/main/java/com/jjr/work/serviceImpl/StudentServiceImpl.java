package com.jjr.work.serviceImpl;

import com.jjr.work.dao.StudentMapper;
import com.jjr.work.entity.Student;
import com.jjr.work.service.IStudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class StudentServiceImpl implements IStudentService {
    @Resource
    private StudentMapper studentMapper;

    public List<Student> getuserlist(int id) {
        return studentMapper.getuserlist(id);
    }

    public void InStudentdent() {
        studentMapper.InStudentdent();
    }
}
