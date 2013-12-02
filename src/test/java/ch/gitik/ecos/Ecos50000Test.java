/*
 * Copyright 2013 Roland Gisler, GISLER iNFORMATiK, Switzerland.
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
 */
package ch.gitik.ecos;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

/**
 * @author Roland Gisler
 * @version $Revision$
 */
public class Ecos50000Test {

   /**
    * Test method for {@link ch.gitik.ecos.Ecos50000#connect()}.
    */
   @Test
   public final void testConnect() {
      // TODO
   }

   /**
    * Test method for {@link ch.gitik.ecos.Ecos50000#disconnect()}.
    */
   @Test
   public final void testDisconnect() {
      // TODO
   }

   /**
    * Test method for {@link ch.gitik.ecos.Ecos50000#getPort()}.
    */
   @Test
   public final void testGetPort() {
      EcosInterface ecos = new Ecos50000();
      ecos.connect("101.102.103.104", 8888);
      assertThat(ecos.getIp(), equalTo("101.102.103.104"));
   }

   /**
    * Test method for {@link ch.gitik.ecos.Ecos50000#getIp()}.
    */
   @Test
   public final void testGetIp() {
      EcosInterface ecos = new Ecos50000();
      ecos.connect("101.102.103.104", 8888);
      assertThat(ecos.getPort(), equalTo(8888));
   }
}
