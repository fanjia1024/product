package com.imooc.product.service.impl;

import com.imooc.product.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceImplTest {
    @Autowired
    private ProductServiceImpl productService;

    @Test
    public void findUpAll() {
        List<ProductInfo> productInfoList =productService.findUpAll();
        Assert.assertTrue(productInfoList.size()>0);
    }

    @Test
    public void findList() {
//        productService.findList(Arrays.asList(11,22));
    }
}