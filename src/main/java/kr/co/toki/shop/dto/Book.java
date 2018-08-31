package kr.co.toki.shop.dto;

import lombok.*;

// [effective java] - builder 패턴 -lombok
// 디자인패턴 - builder 패턴
// 둘의 builder 패턴은 다른개념
@Getter // @Retention(RetentionPolicy.SOURCE)
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Book {
    private Long id;
    private String title;
    private String author;
    private String isbn;
    private int price;

}