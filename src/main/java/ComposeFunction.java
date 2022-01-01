import java.util.function.Function;

public class ComposeFunction {
    public int h(Integer num) {
        Function<Integer, Integer> inc = (value) -> value + 1;
        Function<Integer, Integer> square = (value) -> (int)Math.pow( value, 2);

        return (square.compose(inc)).apply(num);
    }
}
