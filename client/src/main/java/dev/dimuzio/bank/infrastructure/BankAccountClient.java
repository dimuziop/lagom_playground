package dev.dimuzio.bank.infrastructure;

import com.lightbend.lagom.javadsl.client.integration.LagomClientFactory;
import dev.dimuzio.bank.account.AccountService;

/**
 * User: pat
 * Date: 19/5/22
 * Time: 13:07
 */
public class BankAccountClient {
    private AccountService service;

    public BankAccountClient(AccountService service) {
        this.service = service;
    }

    public String ping() throws Exception {
        return  service.ping().invoke().toCompletableFuture().get();
    }

}
