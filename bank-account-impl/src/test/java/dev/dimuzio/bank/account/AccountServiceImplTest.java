package dev.dimuzio.bank.account;

import dev.dimuzio.bank.account.application.AccountServiceImpl;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class AccountServiceImplTest {

    @Test
    public void ping_shouldReturnAPongAnswerAsLifeProof() throws Exception {
        AccountService accountService = new AccountServiceImpl();

        // this is a thread blocking op - fot the sake of the test | NOT FOR PROD
        String result = accountService
                .ping()
                .invoke(/*No params due to NotUsed*/)
                .toCompletableFuture()
                .get(5, TimeUnit.SECONDS);

        assertEquals("PONG", result);
    }

}