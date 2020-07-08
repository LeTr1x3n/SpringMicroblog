package com.letr1x3n.stickerworld.repository;

import com.letr1x3n.stickerworld.domain.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MessageRepository extends CrudRepository<Message, Long> {

    List<Message> findByTag(String tag);
}
