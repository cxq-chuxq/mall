package club.banyuan.blog.controller.api;

import club.banyuan.blog.common.CommonResult;
import club.banyuan.blog.mapper.AnswerMapper;
import club.banyuan.blog.mapper.QuestionMapper;
import club.banyuan.blog.model.Answer;
import club.banyuan.blog.model.AnswerExample;
import club.banyuan.blog.model.Question;
import club.banyuan.blog.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import javax.xml.stream.events.Comment;
import java.util.Objects;

@RestController
@RequestMapping(value = "/api/answer")
public class AnswerController {
    @Autowired
    private AnswerMapper answerMapper;

    @PostMapping(value = "/create")
    public CommonResult create(@RequestBody Answer answer, HttpSession session) {
        User user = (User) session.getAttribute("user");
        if (user == null) {
            return CommonResult.failed("您尚未登录!");
        }

        // 判断是否已回答过这个问题
        AnswerExample example = new AnswerExample();
        example.createCriteria()
                .andQuestionIdEqualTo(answer.getQuestionId())
                .andUserIdEqualTo(user.getId());
        long count = answerMapper.countByExample(example);
        if (count > 0) {
            return CommonResult.failed("您已经回答过这个问题了");
        }

        answer.setUserId(user.getId());
        answerMapper.insertSelective(answer);
        return CommonResult.success("OK");
    }
    @PostMapping(value = "/update")
    public CommonResult update(@RequestBody Answer answer, HttpSession session) {
        User user = (User) session.getAttribute("user");
        if (user == null) {
            return CommonResult.failed("您尚未登录!");
        }
        //根据用户id查找用户之前的回答
        String perviousContent = answerMapper.queryAnswerByUserIdAndQuestionId(user.getId(),answer.getQuestionId());
        String content = answer.getContent();
        if (Objects.equals(perviousContent,content)) {
            return CommonResult.failed("内容没有修改");
        }else{
            answerMapper.updateAnswerByUserIdAndQuestionId(content,user.getId(),answer.getQuestionId());
            return CommonResult.success("ok!");
        }
    }
}
