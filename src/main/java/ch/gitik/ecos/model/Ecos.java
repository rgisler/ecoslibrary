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

   /**
    * Fixe Adressierung für Ecos-System.
    */
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

   /**
    * @see java.lang.Object#toString()
    */
   @Override
   public String toString() {
      return "ECoS - Name: " + this.name + ", HW-Version: " + this.hardwareVersion + " , SW-Version: "
            + this.softwareversion + ", Aktiv: " + this.active;
   }

   /**
    * @see java.lang.Object#hashCode()
    */
   @Override
   public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + (active ? 1231 : 1237);
      result = prime * result + ((hardwareVersion == null) ? 0 : hardwareVersion.hashCode());
      result = prime * result + ((name == null) ? 0 : name.hashCode());
      result = prime * result + ((softwareversion == null) ? 0 : softwareversion.hashCode());
      return result;
   }

   /**
    * @see java.lang.Object#equals(java.lang.Object)
    */
   @Override
   public boolean equals(Object obj) {
      if (this == obj)
         return true;
      if (obj == null)
         return false;
      if (getClass() != obj.getClass())
         return false;
      Ecos other = (Ecos) obj;
      if (active != other.active)
         return false;
      if (hardwareVersion == null) {
         if (other.hardwareVersion != null)
            return false;
      } else if (!hardwareVersion.equals(other.hardwareVersion))
         return false;
      if (name == null) {
         if (other.name != null)
            return false;
      } else if (!name.equals(other.name))
         return false;
      if (softwareversion == null) {
         if (other.softwareversion != null)
            return false;
      } else if (!softwareversion.equals(other.softwareversion))
         return false;
      return true;
   }

}
