package com.allinabc.raft.core;

import com.allinabc.raft.exception.RaftException;

/**
 * @author Fenger
 * @date 2020-12-23 15:06
 */
public interface StateMachine {

    void onApply(RaftIterator iter);

    void onError(RaftException e);

}
