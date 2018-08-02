import org.assertj.core.util.Lists;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HouseRobberTest {

    private HouseRobber robber = new HouseRobber();

    @Test
    public void whenGivenArrayOf1House1Return1() {
        assertThat(robber.rob(Lists.newArrayList(1))).isEqualTo(1);
    }

    @Test
    public void whenGivenArrayOf1House2Return2() {
        assertThat(robber.rob(Lists.newArrayList(2))).isEqualTo(2);
    }

    @Test
    public void whenGivenArrayOf3House123Return4(){
        assertThat(robber.rob(Lists.newArrayList(1,2,3))).isEqualTo(4);
    }

    @Test
    public void whenGivenArrayOf5House27931Return12(){
        assertThat(robber.rob(Lists.newArrayList(2,7,9,3,1))).isEqualTo(12);
    }
}