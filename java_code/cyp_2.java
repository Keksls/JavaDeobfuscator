/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cyp
 */
public class cyp_2
extends ps_0 {
    private int a;
    private int b;
    private long c;

    @Override
    public boolean a(byte[] byArray) {
        if (byArray.length < 16) {
            return false;
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.c = byteBuffer.getLong();
        this.a = byteBuffer.getInt();
        this.b = byteBuffer.getInt();
        return true;
    }

    @Override
    public int a() {
        return 13147;
    }

    public long b() {
        return this.c;
    }

    public int c() {
        return this.a;
    }

    public int d() {
        return this.b;
    }
}

