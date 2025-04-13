/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cst
 */
public class cst_0
extends ps_0 {
    private long a;
    private long b;
    private ft_1 c;
    private fv_2 d;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        this.b = byteBuffer.getLong();
        this.c = ft_1.b(byteBuffer.getInt());
        this.d = fv_2.a(byteBuffer);
        return false;
    }

    @Override
    public int a() {
        return 13189;
    }

    public long b() {
        return this.a;
    }

    public long c() {
        return this.b;
    }

    public ft_1 d() {
        return this.c;
    }

    public fv_2 e() {
        return this.d;
    }
}

