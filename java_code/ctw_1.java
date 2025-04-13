/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from ctw
 */
public class ctw_1
extends csy_2 {
    long b;
    int c;
    int d;
    int e;

    @Override
    public boolean a(byte[] byArray) {
        if (byArray.length != 24) {
            return false;
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a(byteBuffer);
        this.b = byteBuffer.getLong();
        this.c = byteBuffer.getInt();
        this.d = byteBuffer.getInt();
        this.e = byteBuffer.getInt();
        return true;
    }

    public int b() {
        return this.d;
    }

    public long c() {
        return this.b;
    }

    public int e() {
        return this.c;
    }

    public int f() {
        return this.e;
    }

    @Override
    public int a() {
        return 13759;
    }
}

