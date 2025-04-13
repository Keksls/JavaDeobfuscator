/*
 * Decompiled with CFR 0.152.
 */
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyEditor;
import java.util.ArrayList;
import java.util.List;

final class MN
implements PropertyEditor {
    private final List<PropertyChangeListener> a = new ArrayList<PropertyChangeListener>();
    private final Class b;
    private final String[] c;
    private Object d;

    MN(Class<?> clazz) {
        ?[] objArray = clazz.getEnumConstants();
        if (objArray == null) {
            throw new IllegalArgumentException("Unsupported " + clazz);
        }
        this.b = clazz;
        this.c = new String[objArray.length];
        for (int k = 0; k < objArray.length; ++k) {
            this.c[k] = ((Enum)objArray[k]).name();
        }
    }

    @Override
    public Object getValue() {
        return this.d;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void setValue(Object object) {
        PropertyChangeListener[] propertyChangeListenerArray;
        Object object2;
        if (object != null && !this.b.isInstance(object)) {
            throw new IllegalArgumentException("Unsupported m_value: " + object);
        }
        Object object3 = this.a;
        synchronized (object3) {
            object2 = this.d;
            this.d = object;
            if (object == null ? object2 == null : object.equals(object2)) {
                return;
            }
            int n = this.a.size();
            if (n == 0) {
                return;
            }
            propertyChangeListenerArray = this.a.toArray(new PropertyChangeListener[n]);
        }
        object3 = new PropertyChangeEvent(this, null, object2, object);
        for (PropertyChangeListener propertyChangeListener : propertyChangeListenerArray) {
            propertyChangeListener.propertyChange((PropertyChangeEvent)object3);
        }
    }

    @Override
    public String getAsText() {
        return this.d != null ? ((Enum)this.d).name() : "null";
    }

    @Override
    public void setAsText(String string) {
        this.setValue(string != null ? Enum.valueOf(this.b, string) : null);
    }

    @Override
    public String[] getTags() {
        return (String[])this.c.clone();
    }

    @Override
    public String getJavaInitializationString() {
        return this.d != null ? this.b.getName() + "." + ((Enum)this.d).name() : "null";
    }

    @Override
    public boolean isPaintable() {
        return false;
    }

    @Override
    public void paintValue(Graphics graphics, Rectangle rectangle) {
    }

    @Override
    public boolean supportsCustomEditor() {
        return false;
    }

    @Override
    public Component getCustomEditor() {
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void addPropertyChangeListener(PropertyChangeListener propertyChangeListener) {
        List<PropertyChangeListener> list = this.a;
        synchronized (list) {
            this.a.add(propertyChangeListener);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void removePropertyChangeListener(PropertyChangeListener propertyChangeListener) {
        List<PropertyChangeListener> list = this.a;
        synchronized (list) {
            this.a.remove(propertyChangeListener);
        }
    }
}

