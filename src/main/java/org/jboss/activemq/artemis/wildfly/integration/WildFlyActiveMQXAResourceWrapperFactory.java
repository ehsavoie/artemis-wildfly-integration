/*
 * Copyright 2005-2014 Red Hat, Inc.
 * Red Hat licenses this file to you under the Apache License, version
 * 2.0 (the "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *    http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 */

package org.jboss.activemq.artemis.wildfly.integration;

import java.util.Map;
import javax.transaction.xa.XAResource;

import org.apache.activemq.artemis.service.extensions.xa.ActiveMQXAResourceWrapper;
import org.apache.activemq.artemis.service.extensions.xa.ActiveMQXAResourceWrapperFactory;

/**
 * @author <a href="mailto:mtaylor@redhat.com">Martyn Taylor</a>
 */

public class WildFlyActiveMQXAResourceWrapperFactory implements ActiveMQXAResourceWrapperFactory
{
   @Override
   public ActiveMQXAResourceWrapper wrap(XAResource xaResource, Map<String, Object> properties)
   {
      return new WildFlyActiveMQXAResourceWrapper(xaResource, properties);
   }
}
