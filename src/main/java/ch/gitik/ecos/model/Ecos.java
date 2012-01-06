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
 */
package ch.gitik.ecos.model;

/**
 * Datenmodell fuer Ecos-Zentrale.
 * @author Roland Gisler
 */
public final class Ecos {

   public static final String ID = "1";

   private final String name;

   private final String hardwareVersion;

   private final String softwareversion;

   private final boolean active;

   /**
    * Konstruktur.
    * @param aName
    *           Name der Zentrale.
    * @param hwVersion
    *           Version der Hardware.
    * @param swVersion
    *           Version der Software.
    * @param isActive
    *           Zentrale aktiv oder nicht.
    */
   public Ecos(final String aName, final String hwVersion, final String swVersion, final boolean isActive) {
      this.name = aName;
      this.hardwareVersion = hwVersion;
      this.softwareversion = swVersion;
      this.active = isActive;
   }

   /**
    * Liefert name zurück.
    * @return name
    */
   public String getName() {
      return name;
   }

   /**
    * Liefert hardwareVersion zurück.
    * @return hardwareVersion
    */
   public String getHardwareVersion() {
      return hardwareVersion;
   }

   /**
    * Liefert softwareversion zurück.
    * @return softwareversion
    */
   public String getSoftwareversion() {
      return softwareversion;
   }

   /**
    * Liefert active zurück.
    * @return active
    */
   public boolean isActive() {
      return active;
   }

   /*
    * @see java.lang.Object#toString()
    */
   public String toString() {
      return "ECoS - Name: " + this.name + ", HW-Version: " + this.hardwareVersion + " , SW-Version: "
            + this.softwareversion + ", Aktiv: " + this.active;
   }

}
