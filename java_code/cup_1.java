/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.HashMap;

/*
 * Renamed from cup
 */
public class cup_1
extends ps_0 {
    private long a;
    private int b;
    private epe_0 c;
    private final HashMap<String, Object> d = new HashMap();

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        this.b = byteBuffer.getInt();
        this.c = epe_0.a(byteBuffer.get());
        int n = byteBuffer.getInt();
        for (int k = 0; k < n; ++k) {
            byte[] byArray2 = new byte[byteBuffer.getInt()];
            byteBuffer.get(byArray2);
            this.d.put(Cz.a(byArray2), byteBuffer.getLong());
        }
        return true;
    }

    @Override
    public int a() {
        return 13431;
    }

    public long b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }

    public epe_0 d() {
        return this.c;
    }

    public HashMap<String, Object> e() {
        return this.d;
    }
}

