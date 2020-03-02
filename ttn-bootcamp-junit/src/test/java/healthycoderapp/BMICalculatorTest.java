package healthycoderapp;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BMICalculat1orTest {

    @Test
    void Should_ReturnTrue_when_Diet_is_Recommended(){
        //given
        double weight=89.0;
        double height=1.50;

        //when
        boolean recommended=BMICalculator.isDietRecommended(weight,height);

        //then
        assertTrue(recommended);
    }


    @Test
    void should_ReturnFalse_When_DietRecommended(){
        //given
        double weight = 54.5;
        double height = 1.72;
        //when
        boolean recommended = BMICalculator.isDietRecommended(weight,height);
                //then
        assertFalse(recommended);
    }
    @Test
    void should_Throw_Exception_When_HeightZero(){
        //given
        double weight = 54.5;
        double height = 0.0;
        //when
        Executable executable = ()->BMICalculator.isDietRecommended(weight,height);

        //then
        assertThrows(ArithmeticException.class,executable);
        }

        @Test
    void should_ReturnCoderWithWorstBMI_When_CoderListNotEmpty()
        {
            //given
            List<Coder> coders = new ArrayList<>();

            coders.add(new Coder(1.80,60.0));
            coders.add(new Coder(1.82,98.0));
            coders.add(new Coder(1.82,64.7));
        }

    @Test
    void shouldReturnCorrectBMIScoreArrayWhenCoderListIsNotEmpty() {
        // given
        List<Coder> coders = new ArrayList<>();
        coders.add(new Coder(1.89, 60.0));
        coders.add(new Coder(1.82, 98.0));
        coders.add(new Coder(1.82, 64.7));
        double[] expected = {16.8,29.59,19.53};

        // when
        double[] bmiScores = BMICalculator.getBMIScores(coders);
        System.out.println("hello");
        for (double b : bmiScores) {
            System.out.println(b);
        }

        // then
        assertArrayEquals(expected,bmiScores);
    }



}