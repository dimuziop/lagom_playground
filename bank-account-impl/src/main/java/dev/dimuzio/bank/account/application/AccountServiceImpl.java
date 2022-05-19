package dev.dimuzio.bank.account.application;

import akka.NotUsed;
import com.lightbend.lagom.javadsl.api.ServiceCall;
import dev.dimuzio.bank.account.AccountService;

import static java.util.concurrent.CompletableFuture.completedFuture;

public class AccountServiceImpl implements AccountService {
    @Override
    public ServiceCall<NotUsed, String> ping() {
        return NotUsed -> completedFuture("PONG");
    }
}
