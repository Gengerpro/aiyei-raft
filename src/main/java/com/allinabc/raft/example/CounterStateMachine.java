package com.allinabc.raft.example;

import com.allinabc.raft.core.RaftIterator;
import com.allinabc.raft.core.StateMachineAdapter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Fenger
 * @date 2020-12-23 16:57
 */
public class CounterStateMachine extends StateMachineAdapter {

    private static final Logger LOG = LoggerFactory.getLogger(CounterStateMachine.class);

    @Override
    public void onApply(RaftIterator iter) {
        while (iter.hasNext()) {

        }
    }

}
