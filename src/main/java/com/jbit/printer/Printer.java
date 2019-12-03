package com.jbit.printer;

import com.jbit.printer.service.LnkBox;
import com.jbit.printer.service.Paper;
import lombok.Setter;

@Setter
public class Printer {

    //墨盒 (规范)
    private LnkBox lnkBox;
    //纸张  （规范）
    private Paper paper;

    //打印
    public void print(String words){
        System.out.println("惠普打印机正在使用"+lnkBox.color()+"墨盒，在"+paper.size()+"纸张上打印："+words);
    }
}
