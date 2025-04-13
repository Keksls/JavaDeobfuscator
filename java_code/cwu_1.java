/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cwU
 */
public class cwu_1
extends ps_0 {
    private boolean a;
    private un_2 b;
    private boolean c;
    private boolean d = true;
    private boolean e = false;
    private int f;

    public boolean b() {
        return this.a;
    }

    public un_2 c() {
        return this.b;
    }

    public int d() {
        return this.f;
    }

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.get() == 1;
        this.c = byteBuffer.get() == 1;
        this.f = byteBuffer.getInt();
        if (this.a) {
            if (!this.c) {
                this.b = new un_2();
                this.b.b(byteBuffer);
            } else {
                this.e = byteBuffer.get() == 1;
                this.d = byteBuffer.get() == 1;
                this.b = null;
            }
        }
        return true;
    }

    @Override
    public int a() {
        return 12097;
    }

    public boolean e() {
        return this.c;
    }

    public boolean f() {
        return this.e;
    }

    public boolean g() {
        return this.d;
    }
}

