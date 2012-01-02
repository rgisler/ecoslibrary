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
package ch.gitik.ecos;

/**
 * Abstrahiert den Zugriff auf das Hauptobjekt (Zentrale).
 * @author Roland Gisler
 */
public class EcosHandler {

   final private AbstractConnection connection;

   /**
    * Konstruktor.
    */
   public EcosHandler() {
      this.connection = ConnectionFactory.getConnection();
   }

   /**
    * Liefert den Namen der Zentrale.
    * @return Name der Zentrale.
    */
   public final String getName() {
      final String answer = this.connection.request("get(1,info)");
      // TODO Extract Information
      return ("ECoS");
   }

   /**
    * Liefert die HW-Version der Zentrale.
    * @return HW-Version der Zentrale.
    */
   public final String getHardwareVersion() {
      final String answer = this.connection.request("get(1,info)");
      return (AbstractConnection.getAttribute(answer, "HardwareVersion"));
   }
}
