/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
import java.nio.ByteBuffer;
import javax.annotation.Nullable;

/*
 * Renamed from cto
 */
public class cto_2
extends csy_2 {
    private byte[] b;
    private byte[] c;
    private long d;
    private byte e;
    private byte f;
    private vw_0 g;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a(byteBuffer);
        this.d = byteBuffer.getLong();
        this.f = byteBuffer.get();
        this.e = byteBuffer.get();
        this.b = new byte[byteBuffer.getShort()];
        byteBuffer.get(this.b);
        this.c = new byte[byteBuffer.getInt()];
        byteBuffer.get(this.c);
        if (byteBuffer.get() == 1) {
            this.g = new vw_0();
            this.g.a(Vx.a(byteBuffer.get()));
            this.g.a(byteBuffer.getLong());
            this.g.a(byteBuffer.getInt());
        }
        return true;
    }

    public byte[] b() {
        return this.b;
    }

    public byte[] c() {
        return this.c;
    }

    public long e() {
        return this.d;
    }

    public byte f() {
        return this.e;
    }

    public byte g() {
        return this.f;
    }

    @Nullable
    public vw_0 h() {
        return this.g;
    }

    @Override
    public int a() {
        return 12696;
    }
}

