package dev.dimuzio.bank;

import com.lightbend.lagom.javadsl.client.integration.LagomClientFactory;
import dev.dimuzio.bank.account.AccountService;
import dev.dimuzio.bank.infrastructure.BankAccountClient;

import java.net.URI;

/**
 * User: pat
 * Date: 19/5/22
 * Time: 13:07
 */
public class Main {

    public static void main(String[] args) {
        try (LagomClientFactory clientFactory = LagomClientFactory.create("client", LagomClientFactory.class.getClassLoader())) {

            BankAccountClient client = new BankAccountClient(clientFactory.createClient(AccountService.class, new URI("http://localhost:9000")));
            System.out.println(client.ping());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
