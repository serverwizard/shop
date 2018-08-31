package kr.co.toki.shop.dto;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Member {
    private Long id;
    private String n;
    private String email;

    // setter, getter, 메소드를 프로퍼티라고한다.

}