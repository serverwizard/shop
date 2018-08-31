package kr.co.toki.shop.controller;

import kr.co.toki.shop.dto.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/members")
public class MemberController {

    @GetMapping
    public String list(ModelMap modellMap) {
        modellMap.addAttribute("name", "kim");
        List<Member> list = new ArrayList<>();
        list.add(new Member(1L, "hsong", "serverwizard@naver.com"));
        list.add(new Member(2L, "park", "park@gmail.com"));
        list.add(new Member(3L, "kang", "kang@naver.com"));
        modellMap.addAttribute("list", list);

        return "list"; // view name
    }
}