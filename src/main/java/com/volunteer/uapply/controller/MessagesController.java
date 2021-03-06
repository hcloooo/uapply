package com.volunteer.uapply.controller;

import com.aliyuncs.exceptions.ClientException;
import com.volunteer.uapply.annotation.MinisterLogin;
import com.volunteer.uapply.annotation.UserLogin;
import com.volunteer.uapply.pojo.info.AliyunEnrollParam;
import com.volunteer.uapply.pojo.info.AliyunFisrtInterviewParam;
import com.volunteer.uapply.pojo.info.AliyunSecondInterviewParam;
import com.volunteer.uapply.service.impl.MessageServiceImpl;
import com.volunteer.uapply.utils.response.UniversalResponseBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 短信
 * @author 郭树耸
 * @version 1.0
 * @date 2020/2/8 11:05
 */
@RestController
@RequestMapping("/messages")
public class MessagesController {

    @Resource
    MessageServiceImpl messageService;

    /**
     * 发送一面面试短信
     * @param aliyunInterviewParamInfo
     * @return
     * @throws ClientException
     */
    @MinisterLogin
    @PostMapping("/interview/first")
    public UniversalResponseBody SendFirstInterviewMessage(@RequestBody AliyunFisrtInterviewParam aliyunInterviewParamInfo) throws ClientException {
        return messageService.FirstInterviewMessage(aliyunInterviewParamInfo);
    }

    /**
     * 发送二面短信
     * @param aliyunSecondMsgParamInfo
     * @return
     */
    @MinisterLogin
    @PostMapping("/interview/second")
    public UniversalResponseBody SendSecondInterviewMessage(AliyunSecondInterviewParam aliyunSecondMsgParamInfo) throws ClientException {
        return messageService.SecondInterviewMessage(aliyunSecondMsgParamInfo);
    }

    /**
     * 发送录取短信
     * @param aliyunEnrollParamInfo
     * @return
     * @throws ClientException
     */
    @MinisterLogin
    @PostMapping("/enroll")
    public UniversalResponseBody SendFirstInterviewMessage(AliyunEnrollParam aliyunEnrollParamInfo) throws ClientException {
        return messageService.EnrollMessage(aliyunEnrollParamInfo);
    }
}
