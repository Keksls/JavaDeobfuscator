/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntShortHashMap
 */
import gnu.trove.map.hash.TIntShortHashMap;
import java.nio.ByteBuffer;

/*
 * Renamed from cri
 */
public final class cri_0
extends ps_0 {
    private long a;
    private TIntShortHashMap b;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        int n = byteBuffer.getShort();
        this.b = new TIntShortHashMap(n);
        for (int k = 0; k < n; ++k) {
            this.b.put(byteBuffer.getInt(), byteBuffer.getShort());
        }
        return false;
    }

    public long b() {
        return this.a;
    }

    public TIntShortHashMap c() {
        return this.b;
    }

    @Override
    public int a() {
        return 13317;
    }

    @Override
    public String toString() {
        return "LevelUpNewAptitudeResultMessage{m_results=" + this.b + "}";
    }
}

