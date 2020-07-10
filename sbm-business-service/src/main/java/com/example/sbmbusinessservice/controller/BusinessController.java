package com.example.sbmbusinessservice.controller;

import com.example.sbmbusinessservice.service.BusinessService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author zhang
 */
@RequestMapping("/api/business")
@RestController
@RequiredArgsConstructor(onConstructor_={@Autowired})
public class BusinessController {

    private final BusinessService businessService;

    /**
     * 购买下单，模拟全局事务提交
     *
     * @return Boolean
     */
    @RequestMapping("/purchase/commit")
    public Boolean purchaseCommit(HttpServletRequest request) {
        businessService.purchase("1001", "2001", 1);
        return true;
    }

    /**
     * 购买下单，模拟全局事务回滚
     *
     * @return
     */
    @RequestMapping("/purchase/rollback")
    public Boolean purchaseRollback() {
        try {
            businessService.purchase("1002", "2001", 1);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }
}