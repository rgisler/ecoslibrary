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
 * Implementation für Ecos 50000 und 50022.
 * @author Roland Gisler
 */
public class Ecos50000 implements EcosInterface {

   private int port = 15471;
   private String ip = "127.0.0.1";
   
   /**
    * @see ch.gitik.ecos.EcosInterface#connect()
    */
   @Override
   public void connect() {
   }

   /**
    * @see ch.gitik.ecos.EcosInterface#connect(java.lang.String, int)
    */
   @Override
   public void connect(String ip, int port) {
      this.setIp(ip);
      this.setPort(port);
      this.connect();
   }

   /**
    * @see ch.gitik.ecos.EcosInterface#disconnect()
    */
   @Override
   public void disconnect() {
   }

   /**
    * @see ch.gitik.ecos.EcosInterface#getPort()
    */
   @Override
   public final int getPort() {
      return port;
   }

   /**
    * @see ch.gitik.ecos.EcosInterface#setPort(int)
    */
   @Override
   public final void setPort(final int port) {
      this.port = port;
   }

   /**
    * @see ch.gitik.ecos.EcosInterface#getIp()
    */
   @Override
   public final String getIp() {
      return ip;
   }

   /**
    * @see ch.gitik.ecos.EcosInterface#setIp(java.lang.String)
    */
   @Override
   public final void setIp(final String ip) {
      this.ip = ip;
   }

   /**
    * @see ch.gitik.ecos.EcosInterface#getEcosInfo()
    */
   @Override
   public Ecos getEcosInfo() {
      return new Ecos("Name", "Version", "swVersion", true);
   }
}
