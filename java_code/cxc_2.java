/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cxC
 */
public final class cxc_2
extends ps_0 {
    private int a;
    private boolean b;
    private fga_0 c;
    private int d;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getInt();
        this.b = byteBuffer.get() == 1;
        this.c = fga_0.a(byteBuffer.get());
        this.d = byteBuffer.getInt();
        return true;
    }

    public int b() {
        return this.a;
    }

    public boolean c() {
        return this.b;
    }

    public fga_0 d() {
        return this.c;
    }

    public int e() {
        return this.d;
    }

    @Override
    public int a() {
        return 13480;
    }
}

