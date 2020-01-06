package org.itstack.demo.test;

import com.jetbrains.ls.newLicenses.DecodeCertificates;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 博客：http://bugstack.cn
 * 公众号：bugstack虫洞栈 | 更多原处优质干货
 * 测试类配置 VM 参数
 * Idea VM options：-javaagent:E:\itstack\GIT\itstack.org\itstack-demo-code\itstack-demo-code-idea\target\itstack-demo-code-idea-1.0-SNAPSHOT.jar
 */
public class ApiTest {

    private static Logger logger = LoggerFactory.getLogger(ApiTest.class);

    public static void main(String[] args) throws Exception {
        DecodeCertificates decodeCertificates = new DecodeCertificates();
        // 模拟usingKey：认购有效期至2089年7月8日
        String license = decodeCertificates.decodeLicense("Subscription is active until July 8, 2089");
        logger.info("测试结果：{}", license);
    }

}
