/*
 * Copyright 2014 http://Bither.net
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

package net.bither.bitherj.db;

import net.bither.bitherj.core.Peer;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;

public interface IPeerProvider {


    public void deletePeersNotInAddresses(List<InetAddress> peerAddrsses);

    public ArrayList<InetAddress> exists(ArrayList<InetAddress> peerAddresses);

    public void addPeers(List<Peer> items);

    public void removePeer(InetAddress address);

    public void conncetFail(InetAddress address);

    public void connectSucceed(InetAddress address);

    public List<Peer> getPeersWithLimit(int limit);

    public void cleanPeers();
}
