package com.atomicworks.pet_project.bases;

public abstract class Panel {
    private boolean isOccupied;
    private Actor occupant;
    private PanelType panelType;

    abstract void doPanelEffect();

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public Actor getOccupant() {
        return occupant;
    }

    public void setOccupant(Actor occupant) {
        this.occupant = occupant;
    }

    public PanelType getPanelType() {
        return panelType;
    }

    public void setPanelType(PanelType panelType) {
        this.panelType = panelType;
    }

}
