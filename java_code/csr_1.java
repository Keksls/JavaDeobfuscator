/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from csR
 */
public class csr_1
extends ps_0 {
    private long a;
    private exk_2 b;
    private long c;
    private ell_0 d;
    private short e;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        this.c = byteBuffer.getLong();
        this.d = ell_0.a(byteBuffer.get());
        this.e = byteBuffer.getShort();
        vf_2 vf_22 = new vf_2();
        if (!vf_22.b(byteBuffer)) {
            return false;
        }
        this.b = new exk_2();
        this.b.b(vf_22);
        return true;
    }

    @Override
    public int a() {
        return 12050;
    }

    public exk_2 b() {
        return this.b;
    }

    public long c() {
        return this.c;
    }

    public long d() {
        return this.a;
    }

    public ell_0 e() {
        return this.d;
    }

    public short f() {
        return this.e;
    }
}

