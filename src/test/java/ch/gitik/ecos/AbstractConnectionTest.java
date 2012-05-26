/*
 * Copyright 2007 Roland Gisler, GISLER iNFORMATiK, Switzerland.
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
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Roland Gisler
 * @version $Revision$
 */
public class AbstractConnectionTest {

   @Test
   public void testIsResultOk() {
      // TODO not implemented
      // fail("Not yet implemented");
   }

   @Test
   public void testIsResultValidOk() {
      assertTrue(AbstractConnection.isResultValid("<REPLY><END>"));
   }

   @Test
   public void testIsResultValidNotOk() {
      assertFalse(AbstractConnection.isResultValid("EMPTY"));
      assertFalse(AbstractConnection.isResultValid("<REPLY>"));
      assertFalse(AbstractConnection.isResultValid("<END>"));
   }

   @Test
   public void testGetResultCodeOk() {
      assertEquals(0, AbstractConnection.getResultCode("<END 0 OK>"));
   }

   @Test
   public void testGetResultCodeInvalid() {
      assertEquals(99999, AbstractConnection.getResultCode("0 invalid>"));
   }

   @Test
   public void testGetResultCodeOk100() {
      assertEquals(100, AbstractConnection.getResultCode("<END 100 Hundert>"));
   }

   @Test
   public void testGetResultCodeMissing() {
      assertEquals(AbstractConnection.ERROR_RESULT, AbstractConnection.getResultCode("<FAILED>"));
   }

   @Test
   public void testGetResultCodeEmptyString() {
      assertEquals(AbstractConnection.ERROR_RESULT, AbstractConnection.getResultCode(""));
   }

   @Test
   public void testGetResultCodeNullString() {
      assertEquals(AbstractConnection.ERROR_RESULT, AbstractConnection.getResultCode(null));
   }

   @Test
   public void testGetAttribute() {
      assertEquals("value", AbstractConnection.getAttribute("something AnAttribute[value] other stuff", "AnAttribute"));
   }
}
