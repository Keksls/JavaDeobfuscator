/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TShortIntHashMap
 */
import gnu.trove.map.hash.TShortIntHashMap;
import java.nio.ByteBuffer;

public final class csb
extends ps_0 {
    private final TShortIntHashMap a = new TShortIntHashMap();

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        while (byteBuffer.hasRemaining()) {
            this.a.put(byteBuffer.getShort(), byteBuffer.getInt());
        }
        return true;
    }

    @Override
    public int a() {
        return 13381;
    }

    public TShortIntHashMap b() {
        return this.a;
    }
}

