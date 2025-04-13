/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

public abstract class fhx {
    private int a;
    private int b;

    protected fhx() {
    }

    protected fhx(int n, int n2) {
        this.a = n;
        this.b = n2;
    }

    public int c() {
        return this.a;
    }

    public void a(int n) {
        this.a = n;
    }

    public int d() {
        return this.b;
    }

    public void b(int n) {
        this.b = n;
    }

    void a(abx_2 abx_22) {
        abx_22.a(this.a);
        abx_22.a(this.b);
    }

    void a(ByteBuffer byteBuffer) {
        this.a = byteBuffer.getInt();
        this.b = byteBuffer.getInt();
    }

    public abstract fhu a();
}

