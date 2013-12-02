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

import ch.gitik.ecos.model.Ecos;

/**
 * Schnittstelle zur Ecos Zentrale.
 * @author Roland Gisler
 */
public interface EcosInterface {

   /**
    * Stellt eine Verbindung zur ECoS her.
    */
   void connect();

   /**
    * Stellt eine Verbindung zur ECoS her. Variante mit IP und Port.
    * @param ip IP-Adresse.
    * @param port Port-Nummer.
    */
   void connect(String ip, int port);

   /**
    * Beendet die Verbindung zur Ecos.
    */
   void disconnect();

   /**
    * Getter fuer port.
    * @return Liefert port.
    */
   int getPort();

   /**
    * Setter fuer port.
    * @param port Setzt port.
    */
   void setPort(int port);

   /**
    * Getter fuer ip.
    * @return Liefert ip.
    */
   String getIp();

   /**
    * Setter fuer ip.
    * @param ip Setzt ip.
    */
   void setIp(String ip);

   /**
    * Liefert den Zustand der Zentrale.
    * @return Ecos Model.
    */
   Ecos getEcosInfo();
}
