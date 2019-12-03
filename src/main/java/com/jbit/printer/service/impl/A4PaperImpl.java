package com.jbit.printer.service.impl;

import com.jbit.printer.service.Paper;

public class A4PaperImpl implements Paper {
    @Override
    public String size() {
        return "A4";
    }
}
