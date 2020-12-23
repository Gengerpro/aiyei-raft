package com.allinabc.raft.core;

import com.allinabc.raft.exception.RaftException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Fenger
 * @date 2020-12-23 16:38
 */
public abstract class StateMachineAdapter implements StateMachine {

    private static final Logger LOG = LoggerFactory.getLogger(StateMachineAdapter.class);

    @Override
    public void onError(RaftException e) {
        LOG.error(this.getClass().getName(), e);
    }

}
