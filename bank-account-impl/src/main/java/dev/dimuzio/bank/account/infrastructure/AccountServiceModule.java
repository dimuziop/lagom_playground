package dev.dimuzio.bank.account.infrastructure;

import com.google.inject.AbstractModule;
import com.lightbend.lagom.javadsl.server.ServiceGuiceSupport;
import dev.dimuzio.bank.account.AccountService;
import dev.dimuzio.bank.account.application.AccountServiceImpl;

public class AccountServiceModule extends AbstractModule implements ServiceGuiceSupport {
    @Override
    protected void configure() {
        bindService(AccountService.class, AccountServiceImpl.class);
    }
}
