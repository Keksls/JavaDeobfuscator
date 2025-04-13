/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from eCi
 */
public class eci_0 {
    private eck_0 a = eck_0.d;
    private int b;
    private boolean c;

    public static eci_0 a(ByteBuffer byteBuffer) {
        eci_0 eci_02 = new eci_0();
        eck_0 eck_02 = eck_0.a(byteBuffer.get());
        if (eck_02 == null) {
            return null;
        }
        eci_02.a = eck_02;
        switch (eck_02) {
            case d: {
                return null;
            }
            case a: {
                eci_02.a(byteBuffer.getInt());
                break;
            }
            case b: {
                eci_02.a(byteBuffer.get() == 1);
                break;
            }
            case c: {
                eci_02.a(byteBuffer.getInt());
                eci_02.a(byteBuffer.get() == 1);
            }
        }
        return eci_02;
    }

    public static byte[] a(eci_0 eci_02) {
        abx_2 abx_22 = new abx_2();
        abx_22.a(eck_0.a(eci_02.c()));
        if (eci_02.c().equals((Object)eck_0.a) || eci_02.c().equals((Object)eck_0.c)) {
            abx_22.a(eci_02.b);
        }
        if (eci_02.c().equals((Object)eck_0.b) || eci_02.c().equals((Object)eck_0.c)) {
            abx_22.a(eci_02.c);
        }
        return abx_22.c();
    }

    public boolean a() {
        return this.a == eck_0.b || this.a == eck_0.c;
    }

    public boolean b() {
        return this.a == eck_0.a || this.a == eck_0.c;
    }

    public eck_0 c() {
        return this.a;
    }

    public int d() {
        return this.b;
    }

    public boolean e() {
        return this.c;
    }

    public void a(int n) {
        this.b = n;
        switch (this.a) {
            case b: {
                this.a = eck_0.c;
                return;
            }
            case d: {
                this.a = eck_0.a;
            }
        }
    }

    public void a(boolean bl) {
        this.c = bl;
        switch (this.a) {
            case a: {
                this.a = eck_0.c;
                return;
            }
            case d: {
                this.a = eck_0.b;
            }
        }
    }
}

