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
package ch.gitik.ecos.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Testfälle für {@link ch.gitik.ecos.model.Ecos}.
 * @author Roland Gisler
 * @version $Revision$
 */
public class EcosTest {

   /**
    * Testfall für {@link ch.gitik.ecos.model.Ecos#Ecos(String, String, String, boolean)}.
    */
   @Test
   public void testConstructor() {
      Ecos test = new Ecos("Name", "1.0.0", "2.0.0", true);
      assertNotNull(test);
   }

   @Test
   public void testGetName() {
      Ecos test = new Ecos("Name", "1.0.0", "2.0.0", true);
      assertEquals("Name", test.getName());
   }

   @Test
   public void testGetHWVersion() {
      Ecos test = new Ecos("Name", "1.0.0", "2.0.0", true);
      assertEquals("1.0.0", test.getHardwareVersion());
   }

   @Test
   public void testGetSWVersion() {
      Ecos test = new Ecos("Name", "1.0.0", "2.0.0", true);
      assertEquals("2.0.0", test.getSoftwareversion());
   }

   @Test
   public void testGetIsActive() {
      Ecos test = new Ecos("Name", "1.0.0", "2.0.0", true);
      assertTrue(test.isActive());
   }

   @Test
   public void testToString() {
      Ecos test = new Ecos("Name", "1.0.0", "2.0.0", true);
      assertTrue(test.toString().contains("2.0.0"));
   }

}
