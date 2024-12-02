package jpabook.jpashop.service;

import jpabook.jpashop.domain.item.Item;
import jpabook.jpashop.repositroy.ItemRepository;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class ItemServiceTest {

    @Autowired
    private ItemService itemService;

    @Autowired
    private ItemRepository itemRepository;

    @Test
    public void 상품추가() throws Exception{
        //given
        Item item = new Item(){};
        item.setName("item");

        //when
        Long saveId = itemRepository.save(item);

        //then
        Assertions.assertEquals(item, itemRepository.findOne(saveId));
    }

    @Test
    public void 상품찾기(){
        //given
        Item item = new Item() {
        };

        //when

        //then
    }

}