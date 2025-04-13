/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public class crZ
extends ps_0 {
    private long a;
    private int b;
    private ezg_1 c;
    private boolean d = false;
    private ezj_1 e;
    private eyz_0 f;
    private fiO g;
    private ezx_2 h;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        this.b = byteBuffer.getInt();
        this.c = ezg_1.a(byteBuffer.get());
        boolean bl = this.d = byteBuffer.get() == 1;
        if (this.d) {
            this.e = ezl_1.b(crZ.a(byteBuffer));
            this.f = eyy_0.a(crZ.a(byteBuffer));
            this.g = fiQ.a(ByteBuffer.wrap(crZ.a(byteBuffer)));
            this.h = ezl_2.a(crZ.a(byteBuffer));
        }
        return false;
    }

    private static byte[] a(ByteBuffer byteBuffer) {
        int n = byteBuffer.getInt();
        byte[] byArray = new byte[n];
        byteBuffer.get(byArray);
        return byArray;
    }

    @Override
    public int a() {
        return 13674;
    }

    public long b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }

    public ezg_1 d() {
        return this.c;
    }

    public boolean e() {
        return this.d;
    }

    public ezj_1 f() {
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

