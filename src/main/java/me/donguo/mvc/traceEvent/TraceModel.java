package me.donguo.mvc.traceEvent;

/**
 * Created by songway on 2017/5/18.
 */
public class TraceModel {
    private  String eventId;

    private  String label;

    private String Properties;


    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getProperties() {
        return Properties;
    }

    public void setProperties(String properties) {
        Properties = properties;
    }

    public  String desc() {
        return "eventId: " + eventId + " label: " + label;
    }
}
