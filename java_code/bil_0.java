/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from bIL
 */
public class bil_0
extends big_1 {
    private long a = -1L;
    private byte g = (byte)-1;

    bil_0(int n) {
        super(n);
    }

    @Override
    public void a(String ... stringArray) {
    }

    @Override
    public boolean a(exk_2 exk_22) {
        if (this.a == -1L || this.g == -1) {
            return false;
        }
        this.a(exk_22.a());
        this.a = -1L;
        this.g = (byte)-1;
        return true;
    }

    @Override
    protected boolean d() {
        return false;
    }

    @Override
    public void c() {
    }

    public void b(long l) {
        this.a = l;
    }

    public void a(int n) {
        this.g = (byte)n;
    }

    @Override
    public boolean a(ByteBuffer byteBuffer) {
        boolean bl = super.a(byteBuffer);
        byteBuffer.putLong(this.a);
        byteBuffer.put(this.g);
        return bl;
    }

    @Override
    public int b() {
        return super.b() + 8 + 1;
    }

    @Override
    public eyx_1 f() {
        return eyx_1.L;
    }
}

