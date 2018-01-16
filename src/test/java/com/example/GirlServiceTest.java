package com.example;

import com.example.domain.Girl;
import com.example.service.GirlService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author 十一城城主
 * @data 2018/1/15 19:55
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class GirlServiceTest {
    @Autowired
    private GirlService girlService;
    @Test
    public void testFindOne(){
        Girl girl = girlService.findOne(1);
        Assert.assertEquals(new Integer(13),girl.getAge());
    }
}
