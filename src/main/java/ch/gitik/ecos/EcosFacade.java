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
 * Implementiert das Inferface und stellt eine Fassade dar.
 * @author Roland Gisler
 */
public class EcosFacade implements EcosInterface {

   private EcosHandler ecosHandler = null;
   
   /**
    * Konstruktor.
    */
   public EcosFacade() {
      this.ecosHandler = new EcosHandler();
   }
   
   /**
    * @see ch.gitik.ecos.EcosInterface#getName()
    */
   @Override
   public String getName() {
      return this.ecosHandler.getName();
   }

   /**
    * @see ch.gitik.ecos.EcosInterface#getHardwareVersion()
    */
   @Override
   public String getHardwareVersion() {
      return this.ecosHandler.getHardwareVersion();
   }


}
