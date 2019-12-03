package com.jbit.printer.service.impl;

import com.jbit.printer.service.Paper;

public class B5PaperImpl implements Paper {
    @Override
    public String size() {
        return "B5";
    }
}
