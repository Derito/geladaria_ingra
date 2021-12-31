package com.helder.pro.geladariaingra.controller;

import com.helder.pro.geladariaingra.domain.Anime;
import com.helder.pro.geladariaingra.util.DateUtil;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("anime")
@Log4j2
@AllArgsConstructor
public class AnimeController {

    /*Autowired  a classe injectada deve ser um Bean ela é usado para injecção de dependências, substitui
    o que se usava anteriormente exemplo. private DateUtil  dateUtil = new DateUtil();
     */
    //@Autowired
    private  DateUtil dateUtil;

    /*Construtor criado virtualmente pelo @AllArgsConstructor forma ideal de
    injecção de dependências em vez de usar @Autowired.
    public AnimeController(DateUtil dateUtil) {
        this.dateUtil = dateUtil;
    }*/

    @GetMapping(path = "list")
    public List<Anime> list(){
       // Log.info(dateUtil.formatLocalDateTimeDatabaseStyle(LocalDateTime.now()));
         return List.of(new Anime("DBZ"), new Anime("Berserk"));
    }
}
