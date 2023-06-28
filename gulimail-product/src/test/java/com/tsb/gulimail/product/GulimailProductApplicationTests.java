package com.tsb.gulimail.product;

import com.tsb.gulimail.product.entity.BrandEntity;
import com.tsb.gulimail.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GulimailProductApplicationTests {
    @Autowired
    private BrandService brandService;

    @Test
    public void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("小米");
        brandService.save(brandEntity);
        System.out.println("保存成功");
    }
}
