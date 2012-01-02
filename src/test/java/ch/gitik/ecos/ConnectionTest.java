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

import org.junit.Test;

/**
 * @author Roland Gisler
 * @version $Revision$
 */
public class ConnectionTest {

   @Test
   public void testIsResultOk() {
      // fail("Not yet implemented");
   }

   @Test
   public void testIsResultValid() {
      // fail("Not yet implemented");
   }

   @Test
   public void testGetResultCode() {
      // fail("Not yet implemented");
   }

   @Test
   public void testGetAttribute() {
      assertEquals("value", Connection.getAttribute("something AnAttribute[value] other stuff", "AnAttribute"));
   }
}
