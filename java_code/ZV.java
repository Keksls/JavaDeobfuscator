/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import java.nio.ByteBuffer;

public abstract class ZV {
    private final TIntObjectHashMap<aaq_0> a = new TIntObjectHashMap();

    protected ZV() {
        this.b();
    }

    public final aaq_0[] a() {
        Object[] objectArray = new aaq_0[this.a.size()];
        this.a.values(objectArray);
        return objectArray;
    }

    public final aaq_0 a(int n) {
        return (aaq_0)this.a.get(n);
    }

    public final ZT a(int n, ByteBuffer byteBuffer) {
        aaq_0 aaq_02 = this.a(n);
        if (aaq_02 == null) {
            return null;
        }
        Object t = aaq_02.b();
        aaq_02.a(((ZT)t).b, byteBuffer);
        return t;
    }

    protected abstract void b();

    protected final void a(aaq_0 aaq_02) {
        this.a.put(aaq_02.e(), (Object)aaq_02);
    }
}

