package com.allinabc.raft.core;

import java.nio.ByteBuffer;

/**
 * @author Fenger
 * @date 2020-12-23 17:00
 */
public class RaftIteratorImpl implements RaftIterator {

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public ByteBuffer next() {
        return null;
    }

}
