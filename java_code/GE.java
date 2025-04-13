/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Preconditions
 *  com.google.inject.Module
 */
import com.google.common.base.Preconditions;
import com.google.inject.Module;
import java.util.function.Function;

class GE
extends Gu {
    public static final Function<GE, Module> c = gE -> gE.d;
    private final Module d;

    public Module b() {
        return this.d;
    }

    GE(Module module) {
        this.d = (Module)Preconditions.checkNotNull((Object)module);
    }

    public int hashCode() {
        return GF.a(this.d);
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
        GE gE = (GE)object;
        return GF.a(this.d, gE.d);
    }

    public String toString() {
        return "M[" + this.d.getClass().getName() + "]";
    }
}

