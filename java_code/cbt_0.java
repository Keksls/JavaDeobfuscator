/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cBT
 */
public class cbt_0
extends ps_0 {
    private String a;
    private long b;
    private String c;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        byte[] byArray2 = new byte[byteBuffer.getInt()];
        byteBuffer.get(byArray2);
        this.a = Cz.a(byArray2);
        this.b = byteBuffer.getLong();
        byte[] byArray3 = new byte[byteBuffer.getInt()];
        byteBuffer.get(byArray3);
        this.c = Cz.a(byArray3);
        return false;
    }

    public String b() {
        return this.a;
    }

    public long c() {
        return this.b;
    }

    public String d() {
        return this.c;
    }

    @Override
    public int a() {
        return 22913;
    }
}

