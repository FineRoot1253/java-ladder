package com.fineroot.ladder.domain;

import com.fineroot.ladder.engine.Bar;
import com.fineroot.ladder.engine.Line;
import com.fineroot.ladder.engine.Position;
import java.util.List;
import java.util.stream.Collectors;

public class MyLine implements Line {
    private final List<Bar> bars;

    MyLine(final List<Bar> bars){
        this.bars = bars;
    }

    @Override
    public Position move(Position position){
        return position.getFromList(bars).move(position);
    }

    @Override
    public String toString() {
        return bars.stream().map(Bar::toString).collect(Collectors.joining()).stripTrailing();
    }
}
