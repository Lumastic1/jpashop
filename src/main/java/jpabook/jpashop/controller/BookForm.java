package jpabook.jpashop.controller;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

@Getter
@Setter
public class BookForm {

    private Long id;

    @NotEmpty(message = "책 이름을 입력 하세요.")
    private String name;

    private int price;
    private int stockQuantity;

    private String author;
    private String isbn;


}
