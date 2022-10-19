package org.zaika.prototype.shape;

public abstract class Shape implements Cloneable {
    protected String id;
    protected String type;

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public Object clone() {
        Object clone = null;

        try {
            clone = super.clone();
        } catch (CloneNotSupportedException exp) {
            exp.printStackTrace();
        }
        return clone;
    }
}
