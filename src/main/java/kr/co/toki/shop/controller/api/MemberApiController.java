package kr.co.toki.shop.controller.api;

import kr.co.toki.shop.dto.Member;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@Controller : @ResponseBody가 안붙었을 경우엔 메소드가 리턴한값은 view name
//@ResponseBody : 붙어있을 경우엔 컨트롤러 메소드가 리턴하는 값은 응답 바디로 전달
@Slf4j
@RestController
@RequestMapping("/api/members")
public class MemberApiController {
    public MemberApiController() {
        System.out.println("MemberApiController...");
    }

    @GetMapping("/member1")
    public String member1() {
        return "member1";
    }

    @GetMapping("/member2")
    public Member member2() {
        Member member = new Member(1L, "Hong", "serverwizard@naver.com");
        return member;
    }

    //  /member3?name=kim&id=5
    @GetMapping("/member3")
    public Member member3(@RequestParam String name,
                        @RequestParam(name="id", required = false, defaultValue = "1") Long id) {
        log.info("name:{}, email:{}", name, id);
        Member member = new Member(id, name, "");
        return member;
    }

    // @ModelAttribute는 파라미터 이름과 같은 프로퍼티(메소드)에 값을 설정
    @GetMapping("/member4")
    public Member member4(@ModelAttribute Member member) {
        return member;
    }

    @PostMapping("/member5")
    public String member5() {
        return "member5";
    }

    @PostMapping("/member6")
    public Member member6(@RequestParam String name,
                          @RequestParam(name="id", required = false, defaultValue = "1") Long id) {
        log.info("name:{}, email:{}", name, id);
        Member member = new Member(id, name, "");
        return member;
    }

    @PostMapping("/member7")
    public Member member7(@RequestBody Member member) {
        return member;
    }

    @GetMapping("/member8/{id}")
    public Long member8(@PathVariable Long id) {
        return id;
    }

}
