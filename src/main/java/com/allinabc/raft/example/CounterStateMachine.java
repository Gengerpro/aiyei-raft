package com.allinabc.raft.example;

import com.allinabc.raft.core.RaftIterator;
import com.allinabc.raft.core.StateMachineAdapter;

/**
 * @author Fenger
 * @date 2020-12-23 16:57
 */
public class CounterStateMachine extends StateMachineAdapter {

    @Override
    public void onApply(RaftIterator iter) {
        while (iter.hasNext()) {

        }
    }

}
