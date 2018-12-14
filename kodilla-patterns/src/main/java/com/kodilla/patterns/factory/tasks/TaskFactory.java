package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPPINGTASK = "SHOPPINGTASK";
    public static final String DRIVINGTASK = "DRIVINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPINGTASK:
                return new ShoppingTask("Shopping list","Carrots",5.0);
            case DRIVINGTASK:
                return new DrivingTask("Driving task","Krakow","Toyota");
            case PAINTINGTASK:
                return new PaintingTask("Painting task","Yellow","Wall");
            default:
                return null;
        }
    }
}
