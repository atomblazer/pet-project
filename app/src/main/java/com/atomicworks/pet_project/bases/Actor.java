package com.atomicworks.pet_project.bases;

public abstract class Actor {
    long id;
    long hitPoints;
    boolean isStatusable;
    ActorStatus status;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(long hitPoints) {
        this.hitPoints = hitPoints;
    }

    public boolean isStatusable() {
        return isStatusable;
    }

    public void setStatusable(boolean statusable) {
        isStatusable = statusable;
    }

    public ActorStatus getStatus() {
        return status;
    }

    public void setStatus(ActorStatus status) {
        this.status = status;
    }
}
