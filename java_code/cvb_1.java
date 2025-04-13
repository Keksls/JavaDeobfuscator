/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cvB
 */
public class cvb_1
extends ps_0 {
    private eAW a;
    private String b;
    private long c;
    private long d;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = eAW.a(byteBuffer.get());
        if (this.a != eAW.a) {
            return true;
        }
        int n = byteBuffer.getInt();
        byte[] byArray2 = new byte[n];
        byteBuffer.get(byArray2);
        this.b = Cz.a(byArray2);
        this.c = byteBuffer.getLong();
        this.d = byteBuffer.getLong();
        return true;
    }

    public eAW b() {
        return this.a;
    }

    public String c() {
        return this.b;
    }

    public long d() {
        return this.c;
    }

    public long e() {
        return this.d;
    }

    @Override
    public int a() {
        return 12980;
    }
}

