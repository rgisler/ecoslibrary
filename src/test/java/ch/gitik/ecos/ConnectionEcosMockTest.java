/*
 * Copyright 2012 Roland Gisler, GISLER iNFORMATiK, Switzerland.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * $Id: AbstractBpmsTask.java 38 2007-02-12 12:50:46Z rog $
 */
package ch.gitik.ecos;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Mock-Klasse fuer Simulation.
 * @author Roland Gisler
 */
public class ConnectionEcosMockTest {

   @Test
   public void testGetEcOS() {
      Connection con = new ConnectionEcosMock();
      String answer = con.request("get(1,info)");
      assertTrue(con.isResultValid(answer));
      assertTrue(con.isResultOk(answer));
   }

   @Test
   public void testInvalidCommand() {
      Connection con = new ConnectionEcosMock();
      String answer = con.request("get(1,unknown)");
      assertTrue(con.isResultValid(answer));
      assertFalse(con.isResultOk(answer));
      assertEquals(32, con.getResultCode(answer));
   }
}
