package dev.dimuzio.bank.account;

import akka.NotUsed;
import com.lightbend.lagom.javadsl.api.Descriptor;
import com.lightbend.lagom.javadsl.api.Service;
import com.lightbend.lagom.javadsl.api.ServiceCall;

import static com.lightbend.lagom.javadsl.api.Service.*;

public interface AccountService  extends Service {

    ServiceCall<NotUsed, String> ping();

    @Override
    default Descriptor descriptor() {
        return named("account-service").withCalls(
                namedCall("ping", this::ping)
        ).withAutoAcl(true);
    }

}
