package com.fujiyama.pulp.mvvmpattern.util.rx;

import io.reactivex.Scheduler;

public interface ISchedulerProvider {

    Scheduler computation();

    Scheduler io();

    Scheduler ui();
}
