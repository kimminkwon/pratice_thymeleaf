package org.zerock.boot5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.zerock.boot5.domain.MemberVO;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Controller
public class SampleController {
    @GetMapping("/sample1")
    public void sample1(Model model) {
        model.addAttribute("greeting", "안녕하세요!");
    }

    @GetMapping("/sample2")
    public void sample2(Model model) {
        MemberVO vo = new MemberVO(123, "u00", "p00", "홍길동", new Timestamp(System.currentTimeMillis()));
        model.addAttribute("vo", vo);
    }

    @GetMapping("/sample3")
    public void sample3(Model model) {
        List<MemberVO> list = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            list.add(new MemberVO(123, "u00" + i, "p00" + i, "홍길동" + i, new Timestamp(System.currentTimeMillis())));
        }
        model.addAttribute("memberList", list);
    }

    @GetMapping("/sample4")
    public void sample4(Model model) {
        List<MemberVO> list = new ArrayList<>();

        for(int i = 0; i < 10; i++) {
            list.add(new MemberVO(i, "u000" + i % 3, "p00" + i % 3, "홍길동" + i, new Timestamp(System.currentTimeMillis())));
        }

        model.addAttribute("memberList", list);
    }

    @GetMapping("/sample5")
    public void sample5(Model model) {
        String result = "SUCCESS";
        model.addAttribute("result", result);
    }

    @GetMapping("/sample6")
    public void sample6(Model model) {
        List<MemberVO> list = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            list.add(new MemberVO(123, "u00" + i, "p00" + i, "홍길동" + i, new Timestamp(System.currentTimeMillis())));
        }

        model.addAttribute("list", list);

        String result = "SUCCESS";
        model.addAttribute("result", result);
    }

    @GetMapping("/sample7")
    public void sample7(@RequestParam("p1") String p1, @RequestParam("p2") String p2, Model model) {
        model.addAttribute("p1", p1);
        model.addAttribute("p2", p2);
    }

    @GetMapping("/sample8")
    public void sample8(Model model) {

    }

    @GetMapping("/sample/hello")
    public void hello() {

    }
}
