package com.thoughtworks.rectangle;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;


class RectangleTest{
    @Test
    public void shouldReturnAreaWhenBothLengthAndBreadthAreGreaterThanZero() {

        Rectangle Rectangle = new Rectangle(2.5,3.5);

        double expected = 2.5*3.5;
        double actualArea = Rectangle.area();

        assertThat(actualArea, closeTo(expected,0.01));
    }
    @Test
    public void shouldReturnPerimeterWhenBothLengthAndBreadthAreGreaterThanZero() {
        Rectangle Rectangle = new Rectangle(3.5,4.5);

        double expected = 2*(3.5+4.5);
        double actualPerimeter = Rectangle.perimeter();

        assertThat(actualPerimeter, closeTo(expected,0.01));
    }

}