package com.albedo.state_pattern;

public class Context extends LifeState {
    public final static OpeningState opening = new OpeningState();
    public final static ClosingState closing = new ClosingState();
    public final static RunningState running = new RunningState();
    public final static StoppingState stopping = new StoppingState();

    private LifeState lifeState;

    public LifeState getLifeState() {
        return lifeState;
    }

    public void setLifeState(LifeState lifeState) {
        this.lifeState = lifeState;
        this.lifeState.setContext(this);
    }

    @Override
    public void open() {
        this.lifeState.open();
    }

    @Override
    public void close() {
        this.lifeState.close();
    }

    @Override
    public void run() {
        this.lifeState.run();
    }

    @Override
    public void stop() {
        this.lifeState.stop();
    }
}
