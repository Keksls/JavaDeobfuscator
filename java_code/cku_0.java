/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import java.nio.ByteBuffer;

/*
 * Renamed from ckU
 */
public class cku_0
extends ps_0 {
    private final TIntObjectHashMap<eru_2> a = new TIntObjectHashMap();
    private final TIntObjectHashMap<ery_2> b = new TIntObjectHashMap();

    @Override
    public boolean a(byte[] byArray) {
        int n;
        if (!this.a(byArray.length, 1, false)) {
            return false;
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        int n2 = byteBuffer.getInt();
        for (n = 0; n < n2; ++n) {
            eru_2 eru_22 = eru_2.a(byteBuffer);
            this.a.put(eru_22.a(), (Object)eru_22);
        }
        n = byteBuffer.getInt();
        for (int k = 0; k < n; ++k) {
            ery_2 ery_22 = ery_2.a(byteBuffer);
            this.b.put(ery_22.b(), (Object)ery_22);
        }
        return true;
    }

    public TIntObjectHashMap<eru_2> b() {
        return this.a;
    }

    public TIntObjectHashMap<ery_2> c() {
        return this.b;
    }

    @Override
    public int a() {
        return 491;
    }
}

