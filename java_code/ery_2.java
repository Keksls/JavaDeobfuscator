/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.Arrays;

/*
 * Renamed from ery
 */
public class ery_2 {
    private final int a;
    private final enp_2 b;
    private final byte[] c;
    private boolean d;

    public ery_2(int n, enp_2 enp_22, byte[] byArray) {
        this.a = n;
        this.b = enp_22;
        this.c = (byte[])byArray.clone();
    }

    public static ery_2 a(ByteBuffer byteBuffer) {
        int n = byteBuffer.getInt();
        byte[] byArray = new byte[byteBuffer.getInt()];
        byteBuffer.get(byArray);
        byte[] byArray2 = new byte[byteBuffer.getInt()];
        byteBuffer.get(byArray2);
        enp_2 enp_22 = new enp_2();
        enp_22.a(byArray2);
        boolean bl = byteBuffer.get() != 0;
        ery_2 ery_22 = new ery_2(n, enp_22, byArray);
        ery_22.d = bl;
        return ery_22;
    }

    public byte[] a() {
        abx_2 abx_22 = new abx_2();
        abx_22.a(this.a);
        abx_22.a(this.c.length);
        abx_22.b(this.c);
        byte[] byArray = this.b.b();
        abx_22.a(byArray.length);
        abx_22.b(byArray);
        abx_22.a(this.d);
        return abx_22.c();
    }

    public int b() {
        return this.a;
    }

    public byte[] c() {
        return (byte[])this.c.clone();
    }

    public enp_2 d() {
        return this.b;
    }

    public boolean e() {
        return this.d;
    }

    public void a(boolean bl) {
        this.d = bl;
    }

    public String toString() {
        return "WorldInfo{m_serverId=" + this.a + ", m_config=" + this.b + ", m_version=" + Arrays.toString(this.c) + ", m_locked=" + this.d + "}";
    }
}

