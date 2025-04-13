/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Preconditions
 *  com.google.inject.Module
 */
import com.google.common.base.Preconditions;
import com.google.inject.Module;

class GG
extends Gu {
    private final Class<? extends Module> c;

    GG(Class<? extends Module> clazz) {
        this.c = (Class)Preconditions.checkNotNull(clazz);
    }

    public Class<? extends Module> b() {
        return this.c;
    }

    public int hashCode() {
        int n = 442292081;
        return 442292081 + this.c.hashCode();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (this.getClass() != object.getClass()) {
            return false;
        }
        GG gG = (GG)object;
        return this.c.equals(gG.c);
    }

    public String toString() {
        return "I[" + this.c.getName() + "]";
    }
}

