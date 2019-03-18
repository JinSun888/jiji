package com.jjr.work.controller;

import com.jjr.work.entity.Student;
import com.jjr.work.service.IStudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping(value = "TestController")
public class TestController {
    private static final Logger logger = LoggerFactory.getLogger(TestController.class);
    @Resource
    private IStudentService iStudentService;


    @RequestMapping(value = "test")
    public String test(HttpServletRequest request, Model model){
        List<Student> list = iStudentService.getuserlist(1);

        model.addAttribute("user", list);
        logger.info("-------------------------测试日志");
        System.out.println("查询成功");
        return "user";
    }

    @RequestMapping(value = "InStudentdent")
    public void inStudentdent(){
        logger.info("-------------------------测试日志开始");
        iStudentService.InStudentdent();
        System.out.println("插入成功");
        logger.info("-------------------------测试日志");
    }
}
