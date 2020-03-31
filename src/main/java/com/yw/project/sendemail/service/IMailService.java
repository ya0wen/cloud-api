package com.yw.project.sendemail.service;

import javax.mail.MessagingException;

/**
 * @Author: yw
 * @Description: 封装一个发邮件的接口，后边直接调用即可
 * @Date: Create in 2020年3月31日 15:18:09
 * @param: $params$
 * @return: $returns$
 */
public interface IMailService {

    /**
     * 发送文本邮件
     * @param to 收件人
     * @param subject 主题
     * @param content 内容
     */
    void sendSimpleMail(String to, String subject, String content);

    /**
     * 发送HTML邮件
     * @param to 收件人
     * @param subject 主题
     * @param content 内容
     */
    public void sendHtmlMail(String to, String subject, String content);



    /**
     * 发送带附件的邮件
     * @param to 收件人
     * @param subject 主题
     * @param content 内容
     * @param filePath 附件
     */
    public void sendAttachmentsMail(String to, String subject, String content, String filePath);


    /**
     * 发送带图片的邮件
     * @param to 收件人
     * @param subject 主题
     * @param content 内容里面需要包含img标签，然后src内要包含图片id  例如： src='cid:p01'    picI的= p01
     * @param picPath 图片路径
     * @param picId 图片id
     */
    public void sendPicture(String to,String subject, String content,
                              String picPath,String picId) ;
}
