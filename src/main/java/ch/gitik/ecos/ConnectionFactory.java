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
 * Factory fuer AbstractConnection-Objekte.
 * @author Roland Gisler
 */
public final class ConnectionFactory {

   /**
    * Privater Konstruktor.
    */
   private ConnectionFactory() {
   }

   /**
    * Statische Factory Methode.
    * @return Liefert immer ein Mock.
    */
   public static AbstractConnection getConnection() {
      return new ConnectionEcosMock();
   }

}
