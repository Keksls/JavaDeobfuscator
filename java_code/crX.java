/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class crX
extends ps_0 {
    private long a;
    private byte b;
    private short c;
    private int d;
    private boolean e = false;
    private eyz_0 f;
    private fiO g;
    private ezx_2 h;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        this.b = byteBuffer.get();
        this.c = byteBuffer.getShort();
        this.d = byteBuffer.getInt();
        boolean bl = this.e = byteBuffer.get() == 1;
        if (this.e) {
            this.f = eyy_0.a(crX.a(byteBuffer));
            this.g = fiQ.a(ByteBuffer.wrap(crX.a(byteBuffer)));
            this.h = ezl_2.a(crX.a(byteBuffer));
        }
        return true;
    }

    private static byte[] a(ByteBuffer byteBuffer) {
        int n = byteBuffer.getInt();
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        return byArray;
    }

    @Override
    public int a() {
        return 13266;
    }

    public long b() {
        return this.a;
    }

    public byte c() {
        return this.b;
    }

    public short d() {
        return this.c;
    }

    public int e() {
        return this.d;
    }

    public boolean f() {
        return this.e;
    }

    public eyz_0 g() {
        return this.f;
    }

    public fiO h() {
        return this.g;
    }

    public ezx_2 i() {
        return this.h;
    }
}

