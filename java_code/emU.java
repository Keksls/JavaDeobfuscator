/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.primitives.Longs
 */
import com.google.common.primitives.Longs;
import java.util.Comparator;

class emU
implements Comparator<emn_0> {
    emU() {
    }

    public int a(emn_0 emn_02, emn_0 emn_03) {
        return Longs.compare((long)emn_02.b(), (long)emn_03.b());
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((emn_0)object, (emn_0)object2);
    }
}

