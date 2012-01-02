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
 * Simulation der Ecos fuer Testing.
 * @author Roland Gisler
 */
public class ConnectionEcosMock extends AbstractConnection {

   @Override
   public final String request(final String command) {
      String result;
      if (command.contains("get(1,info)")) {
         result = "<REPLY get(1, info)>\n";
         result += "1 ECoS\n";
         result += "1 ProtocolVersion[0.1]\n";
         result += "1 ApplicationVersion[1.0.1]\n";
         result += "1 HardwareVersion[1.3]\n";
         result += "<END 0 (OK)>";
      } else {
         result = "<REPLY " + command + ">\n<END 32 (UNKNOWN COMMAND)>";
      }
      return result;
   }
}
