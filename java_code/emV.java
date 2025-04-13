/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.primitives.Ints
 */
import com.google.common.primitives.Ints;
import java.util.Comparator;

class emV
implements Comparator<emW> {
    emV() {
    }

    public int a(emW emW2, emW emW3) {
        return Ints.compare((int)emW2.a(), (int)emW3.a());
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((emW)object, (emW)object2);
    }
}

