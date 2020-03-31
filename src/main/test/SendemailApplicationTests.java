import com.yw.ywApplication;
import com.yw.project.sendemail.service.IMailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ywApplication.class)
public class SendemailApplicationTests {

    /**
     * 注入发送邮件的接口
     */
    @Autowired
    private IMailService mailService;

    /**
     * 测试发送文本邮件
     */
//    @Test
//    public void sendmail() {
//        mailService.sendSimpleMail("2914147992@qq.com","主题：你好普通邮件","内容：第一封邮件");
//    }
//
//    @Test
//    public void sendmailHtml(){
//        mailService.sendHtmlMail("smfx1314@163.com","主题：你好html邮件","<h1>内容：第一封html邮件</h1>");
//    }
//
//
//    @Test
//    public void sendPicture(){
//        mailService.sendPicture("2914147992@qq.com","test","<div>hello,这是一封带图片资源的邮件：<br>\" +\n" +
//                "                        \"这是图片1：<div><img src='cid:p01'/></div>\" +\n" +
//                "                        \"</div>","C:\\Users\\29141\\Desktop\\11.png","p01");
//    }
}
