/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from csT
 */
public class cst_1
extends ps_0 {
    private long a;
    private final List<exk_2> b = new ArrayList<exk_2>();
    private long c;
    private ell_0 d;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        this.c = byteBuffer.getLong();
        this.d = ell_0.a(byteBuffer.get());
        int n = byteBuffer.getShort();
        vf_2 vf_22 = new vf_2();
        for (int k = n; k > 0; --k) {
            if (!vf_22.b(byteBuffer)) {
                return false;
            }
            exk_2 exk_22 = new exk_2();
            exk_22.b(vf_22);
            this.b.add(exk_22);
            vf_22.c();
        }
        return true;
    }

    @Override
    public int a() {
        return 12304;
    }

    public List<exk_2> b() {
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

