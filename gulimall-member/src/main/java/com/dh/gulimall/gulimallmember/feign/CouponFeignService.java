package com.dh.gulimall.gulimallmember.feign;

import com.dh.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("gulimall-coupon")
public interface CouponFeignService {
    @RequestMapping("/gulimallcoupon/coupon/member/list")
    public R membercoupons();
}
