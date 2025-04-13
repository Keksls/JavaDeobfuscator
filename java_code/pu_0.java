/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from Pu
 */
public class pu_0
extends ps_0 {
    public static final byte a = 0;
    public static final byte b = 1;
    public static final byte c = 2;
    public static final byte d = 3;
    private byte e;
    private String f;
    private int g = 0xFFFFFF;
    private boolean h;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.e = byteBuffer.get();
        if (this.e == 3) {
            this.g = byteBuffer.getInt();
        }
        this.f = Cz.a(byteBuffer);
        this.h = byteBuffer.get() == 1;
        return true;
    }

    @Override
    public int a() {
        return 346;
    }

    public byte b() {
        return this.e;
    }

    public String c() {
        return this.f;
    }

    public int d() {
        return this.g;
    }

    public boolean e() {
        return this.h;
    }
}

