package org.study.helpers;

import org.junit.jupiter.api.Test;
import org.study.entity.Client;

import static org.junit.jupiter.api.Assertions.*;

class ClientHelperTest {

  @Test
  void clientTest() {
    Client client = new Client();
    client.setName("Ya");
    client.setNumber("0939328243");

    ClientHelper clientHelper = new ClientHelper();
    long id = clientHelper.addClient(client).getId();

    Client c2 = clientHelper.getClientById(id);

    assertEquals(client, c2);

    c2 = clientHelper.getClientsList().get(0);

//    assertEquals(client, c2);
  }

}