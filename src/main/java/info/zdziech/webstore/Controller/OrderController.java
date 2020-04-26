package info.zdziech.webstore.Controller;

import info.zdziech.webstore.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


    @Controller
    public class OrderController {
        @Autowired
        private OrderService orderService;
        @RequestMapping("/order/1234/2")
        public String process() {
            orderService.processOrder((long) 1234, 2);
            return "redirect /products";
        }
    }
