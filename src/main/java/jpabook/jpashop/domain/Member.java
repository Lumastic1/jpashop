package jpabook.jpashop.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.errorprone.annotations.InlineMeValidationDisabled;
import com.sun.nio.sctp.PeerAddressChangeNotification;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter@Setter
public class Member {

    @Id
    @GeneratedValue
    @Column(name = "member_id")
    private Long Id;

//    @NotEmpty // 엔티티에서 직접 쓰면 안됨
    private String name;

    @Embedded
    private Address address;

    @JsonIgnore // 양방향 일떄는 사용 해야함  엔티티에서 직접 쓰면 안됨
    @OneToMany(mappedBy = "member")
    private List<Order> orders = new ArrayList<>();
}
