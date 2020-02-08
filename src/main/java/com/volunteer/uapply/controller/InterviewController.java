package com.volunteer.uapply.controller;

import com.volunteer.uapply.annotation.UserLoginToken;
import com.volunteer.uapply.pojo.User;
import com.volunteer.uapply.service.impl.SecondInterviewServiceImpl;
import com.volunteer.uapply.utils.response.UniversalResponseBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 面试
 * @author 郭树耸
 * @version 1.0
 * @date 2020/2/8 11:34
 */
@RestController
@RequestMapping("/interview")
public class InterviewController {

    @Resource
    SecondInterviewServiceImpl secondInterviewService;


    /**
     * 查询面试状态
     * @param userId
     * @return
     */
    @GetMapping("/status")
    @UserLoginToken
    public UniversalResponseBody applyStatus(Integer userId){
        return null;
    }
    /**
     * 待一面
     * @param departmentId
     * @return
     */
    @UserLoginToken
    @GetMapping("/first/un")
    public UniversalResponseBody<List<User>> UnFirstInterview(Integer departmentId){
        return null;
    }

    /**
     * 已经一面
     * @param departmentId
     * @return
     */
    @UserLoginToken
    @GetMapping("/first/finish")
    public UniversalResponseBody<List<User>> FirstInterviewed(Integer departmentId){
        return null;
    }

    /**
     * 淘汰一面人员
     * @param userId
     * @param departmentId
     * @return
     */
    @UserLoginToken
    @PostMapping("/first/eliminate")
    public UniversalResponseBody FirstEliminate(Integer userId,Integer departmentId){
        return null;
    }



    /**
     * 二面签到
     * @param userTel
     * @param departmentId
     * @return
     */
    @UserLoginToken
    @PostMapping("/second/check")
    public UniversalResponseBody SecondCheck(String userTel,Integer departmentId){
        return secondInterviewService.SecondCheck(userTel,departmentId);
    }

    /**
     * 待二面
     * @param departmentId
     * @return
     */
    @UserLoginToken
    @GetMapping("/second/un")
    public UniversalResponseBody<List<User>> UnSecondInterview(Integer departmentId){
        return null;
    }

    /**
     * 已经二面
     * @param departmentId
     * @return
     */
    @UserLoginToken
    @GetMapping("/second/finish")
    public UniversalResponseBody<List<User>> SecondedInterviewed(Integer departmentId){
        return null;
    }


    /**
     * 淘汰二面人员
     * @param userId
     * @param departmentId
     * @return
     */
    @UserLoginToken
    @PostMapping("/second/eliminate")
    public UniversalResponseBody SecondEliminate(Integer userId,Integer departmentId){
        return null;
    }
}