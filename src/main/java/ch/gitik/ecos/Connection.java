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

/**
 * Abstrakte Basisklasse fuer Verbindung.
 * @author Roland Gisler
 */
public abstract class Connection {

   /**
    * Synchrone Kommunikation mit der Zentrale.
    * @param command
    *           Befehl an die Zentrale.
    * @return Status bzw. Antwort.
    */
   public abstract String request(String command);

   /**
    * Prueft ob die Antwort den OK-Status hat.
    * @param answer
    *           Antwort die Ausgewertet wird.
    * @return true oder false.
    */
   protected boolean isResultOk(String answer) {
      return (getResultCode(answer) == 0);
   }

   /**
    * Prueft ob die Antwort vollständig ist.
    * @param answer
    *           Antwort die Ausgewertet wird.
    * @return true oder false.
    */
   protected boolean isResultValid(String answer) {
      return answer.contains("<REPLY") && answer.contains("<END");
   }

   /**
    * Liest den Antwort-Code aus einer Antwort.
    * @param answer
    *           Antwort die ausgewertet wird.
    * @return Resturncode.
    */
   protected int getResultCode(String answer) {
      int posStart = answer.indexOf("<END ") + 5;
      int posEnd = answer.indexOf(' ', posStart);
      String resultCodeString = answer.substring(posStart, posEnd);
      int resultCode = Integer.parseInt(resultCodeString);
      return resultCode;
   }
}
