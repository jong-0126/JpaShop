package jpabook.jpashop.domain;

import jakarta.persistence.*;
import jpabook.jpashop.domain.item.Item;
import lombok.Getter;
import lombok.Setter;

@Entity
public class OrderItem {

    @Id @GeneratedValue
    @Getter @Setter
    @Column(name = "order_item_key")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "item_key")
    private Item item;

    @ManyToOne
    @JoinColumn(name = "order_key")
    private Order order;

    private int orderPrice;

    private int cnt;
}
