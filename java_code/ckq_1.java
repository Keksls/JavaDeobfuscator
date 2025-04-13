/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ckQ
 */
public class ckq_1
extends ps_0 {
    private byte a;
    private int b;
    private byte[] c;

    @Override
    public boolean a(byte[] byArray) {
        if (!this.a(byArray.length, 1, false)) {
            return false;
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.get();
        if (this.a == 5 || this.a == 6 || this.a == 121) {
            if (!this.a(byArray.length, 5, false)) {
                return false;
            }
            this.b = byteBuffer.getInt();
        }
        if (this.b()) {
            if (!this.a(byArray.length, 3, false)) {
                return false;
            }
            int n = byteBuffer.getShort() & 0xFFFF;
            if (!this.a(byArray.length, n + 3, true)) {
                return false;
            }
            this.c = new byte[n];
            byteBuffer.get(this.c);
        }
        return true;
    }

    @Override
    public int a() {
        return 515;
    }

    public boolean b() {
        return this.a == 0;
    }

    public byte c() {
        return this.a;
    }

    public byte[] d() {
        return this.c;
    }

    public int e() {
        return this.b;
    }
}

