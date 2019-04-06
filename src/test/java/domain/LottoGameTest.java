package domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LottoGameTest {
    private LottoGame lottoGame;

    @Before
    public void setUp() throws Exception {
        lottoGame = new LottoGame();
    }

    @Test
    public void userInputVerify() {
        boolean result = lottoGame.userInputVerify(2000);
        Assert.assertEquals(true, result);
    }

    @Test
    public void userInputVerifyZero() {
        boolean result = lottoGame.userInputVerify(0);
        Assert.assertEquals(false, result);
    }

    @Test
    public void userInputVerifyNegative() {
        boolean result = lottoGame.userInputVerify(-1000);
        Assert.assertEquals(false, result);
    }

    @Test
    public void userInputVerifyNotThousandNumber() {
        boolean result = lottoGame.userInputVerify(1234);
        Assert.assertEquals(false, result);
    }
}