package jpabook.jpashop.service;

import jpabook.jpashop.domain.item.Album;
import jpabook.jpashop.domain.item.Book;
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
        Book book = new Book();
        book.setName("book");

        //when
        Long saveId = itemRepository.save(book);

        //then
        Assertions.assertEquals(book, itemRepository.findOne(saveId));
    }

    @Test
    public void 상품하나찾기(){
        //given
        Book book = new Book();
        book.setName("book");

        Album album = new Album();
        album.setArtist("artist");

        //when
        Long saveId = itemRepository.save(book);
        itemService.findOne(saveId);

        //then
        Assertions.assertEquals(book, itemRepository.findOne(saveId));
    }

    @Test
    public void 상품전부찾기(){
        //given

        //when

        //then

    }

}