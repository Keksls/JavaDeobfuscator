/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.set.hash.TLongHashSet
 */
import gnu.trove.set.hash.TLongHashSet;
import java.nio.ByteBuffer;

/*
 * Renamed from csZ
 */
public final class csz_2
extends csy_2 {
    private final TLongHashSet b = new TLongHashSet();

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a(byteBuffer);
        int n = byteBuffer.get();
        for (int k = 0; k < n; ++k) {
            this.b.add(byteBuffer.getLong());
        }
        return true;
    }

    @Override
    public int a() {
        return 12573;
    }

    public TLongHashSet b() {
        return this.b;
    }
}

