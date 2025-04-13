/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from csU
 */
public class csu_1
extends ps_0 {
    private long a;
    private final List<ts_0> b = new ArrayList<ts_0>();
    private long c;
    private ell_0 d;

    @Override
    public boolean a(byte[] byArray) {
        int n;
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        this.c = byteBuffer.getLong();
        this.d = ell_0.a(byteBuffer.get());
        vf_2 vf_22 = new vf_2();
        for (int k = n = byteBuffer.getShort(); k > 0; --k) {
            if (!vf_22.b(byteBuffer)) {
                return false;
            }
            exk_2 exk_22 = new exk_2();
            exk_22.b(vf_22);
            this.b.add(exk_22);
        }
        return true;
    }

    @Override
    public int a() {
        return 12934;
    }

    public List<ts_0> b() {
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
}

