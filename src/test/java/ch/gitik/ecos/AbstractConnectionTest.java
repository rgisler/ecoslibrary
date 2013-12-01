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
 * 
 * $Id: AbstractBpmsTask.java 38 2007-02-12 12:50:46Z rog $
 */
package ch.gitik.ecos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Testfälle für {@link ch.gitik.ecos.AbstractConnection}.
 * @author Roland Gisler
 * @version $Revision$
 */
public class AbstractConnectionTest {

   /**
    * Testfall für {@link ch.gitik.ecos.AbstractConnection#isResultValid(String)}.
    */
   @Test
   public void testIsResultValidOk() {
      assertTrue(AbstractConnection.isResultValid("<REPLY><END>"));
   }

   /**
    * Testfall für {@link ch.gitik.ecos.AbstractConnection#isResultValid(String)}.
    */
   @Test
   public void testIsResultValidNotOk() {
      assertFalse(AbstractConnection.isResultValid("EMPTY"));
      assertFalse(AbstractConnection.isResultValid("<REPLY>"));
      assertFalse(AbstractConnection.isResultValid("<END>"));
   }

   /**
    * Testfall für {@link ch.gitik.ecos.AbstractConnection#getResultCode(String)}.
    */
   @Test
   public void testGetResultCodeOk() {
      assertEquals(0, AbstractConnection.getResultCode("<END 0 OK>"));
   }

   /**
    * Testfall für {@link ch.gitik.ecos.AbstractConnection#getResultCode(String)}.
    */
   @Test
   public void testGetResultCodeInvalid() {
      assertEquals(99999, AbstractConnection.getResultCode("0 invalid>"));
   }

   /**
    * Testfall für {@link ch.gitik.ecos.AbstractConnection#getResultCode(String)}.
    */
   @Test
   public void testGetResultCodeOk100() {
      assertEquals(100, AbstractConnection.getResultCode("<END 100 Hundert>"));
   }

   /**
    * Testfall für {@link ch.gitik.ecos.AbstractConnection#getResultCode(String)}.
    */
   @Test
   public void testGetResultCodeMissing() {
      assertEquals(AbstractConnection.ERROR_RESULT, AbstractConnection.getResultCode("<FAILED>"));
   }

   /**
    * Testfall für {@link ch.gitik.ecos.AbstractConnection#getResultCode(String)}.
    */
   @Test
   public void testGetResultCodeEmptyString() {
      assertEquals(AbstractConnection.ERROR_RESULT, AbstractConnection.getResultCode(""));
   }

   /**
    * Testfall für {@link ch.gitik.ecos.AbstractConnection#getResultCode(String)}.
    */
   @Test
   public void testGetResultCodeNullString() {
      assertEquals(AbstractConnection.ERROR_RESULT, AbstractConnection.getResultCode(null));
   }

   /**
    * Testfall für {@link ch.gitik.ecos.AbstractConnection#getAttribute(String, String)}.
    */
   @Test
   public void testGetAttribute() {
      assertEquals("value", AbstractConnection.getAttribute("something AnAttribute[value] other stuff", "AnAttribute"));
   }
}
