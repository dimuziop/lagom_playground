package dev.dimuzio.bank.account;

import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static com.lightbend.lagom.javadsl.testkit.ServiceTest.*;

public class AccountServiceImplIntegrationTest {

    @Test
    public void ping_shouldReturnAPongAnswerAsLifeProof() {
        withServer(defaultSetup(), server -> {

            AccountService accountService = server.client(AccountService.class);

            String result = accountService
                    .ping()
                    .invoke(/*No params due to NotUsed*/)
                    .toCompletableFuture()
                    .get(5, TimeUnit.SECONDS);

            assertEquals("PONG", result);
        });

    }

}