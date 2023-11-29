package com.fineroot.ladder.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ladder {

    private final List<Line> lineList = new ArrayList<>();

    private Ladder(final Users users, final int countOfHeight){
        for (int i = 0; i <countOfHeight; i++) {
            lineList.add(Line.from(users));
        }
    }

    public static Ladder of(final Users users, final int countOfHeight){
        return new Ladder(users, countOfHeight);
    }

    @Override
    public String toString() {
        return lineList.stream().map(e->toString().concat(System.lineSeparator())).collect(Collectors.joining());
    }
}