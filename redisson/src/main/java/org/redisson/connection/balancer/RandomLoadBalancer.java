/**
 * Copyright 2016 Nikita Koksharov
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.redisson.connection.balancer;

import java.util.List;

import org.redisson.connection.ClientConnectionsEntry;

import io.netty.util.internal.ThreadLocalRandom;

/**
 * 
 * @author Nikita Koksharov
 *
 */
public class RandomLoadBalancer implements LoadBalancer {

    public ClientConnectionsEntry getEntry(List<ClientConnectionsEntry> clientsCopy) {
        int ind = ThreadLocalRandom.current().nextInt(clientsCopy.size());
        return clientsCopy.get(ind);
    }

}
