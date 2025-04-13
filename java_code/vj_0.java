/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from VJ
 */
public class vj_0
implements Wf<vl_0> {
    private final List<vl_0> a = new ArrayList<vl_0>(4);
    private final List<vl_0> b = new ArrayList<vl_0>(4);

    public void a(vl_0 vl_02, boolean bl) {
        List<vl_0> list = bl ? this.b : this.a;
        list.add(vl_02);
        vl_02.a(this);
    }

    public Iterable<vl_0> a() {
        return this.b;
    }

    public Iterable<vl_0> b() {
        return new ArrayList<vl_0>(this.b);
    }

    public Iterable<vl_0> c() {
        return this.a;
    }

    public Iterable<vl_0> d() {
        return new ArrayList<vl_0>(this.a);
    }

    public int e() {
        int n = 4;
        n += this.a(this.b);
        return n += this.a(this.a);
    }

    private int a(List<vl_0> list) {
        int n = 0;
        for (vl_0 vl_02 : list) {
            n += vl_02.d();
        }
        return n;
    }

    @Override
    public void a(ByteBuffer byteBuffer) {
        this.a(byteBuffer, this.a);
        this.a(byteBuffer, this.b);
    }

    private void a(ByteBuffer byteBuffer, List<vl_0> list) {
        byteBuffer.putShort((short)list.size());
        for (vl_0 vl_02 : list) {
            vl_02.b(byteBuffer);
        }
    }

    protected void a(vz_0 vz_02, ByteBuffer byteBuffer) {
        this.a(vz_02, byteBuffer, this.a);
        this.a(vz_02, byteBuffer, this.b);
    }

    private void a(vz_0 vz_02, ByteBuffer byteBuffer, List<vl_0> list) {
        short s2 = byteBuffer.getShort();
        for (short s3 = 0; s3 < s2; s3 = (short)(s3 + 1)) {
            list.add(vl_0.b(vz_02, byteBuffer));
        }
    }

    public static vj_0 b(vz_0 vz_02, ByteBuffer byteBuffer) {
        vj_0 vj_02 = new vj_0();
        vj_02.a(vz_02, byteBuffer);
        return vj_02;
    }

    public void f() {
        vl_0 vl_02;
        int n;
        for (n = 0; n < this.a.size(); ++n) {
            vl_02 = this.a.get(n);
            vl_02.e();
        }
        this.a.clear();
        for (n = 0; n < this.b.size(); ++n) {
            vl_02 = this.b.get(n);
            vl_02.e();
        }
        this.b.clear();
    }

    @Override
    public void a(vl_0 vl_02) {
        this.b.remove(vl_02);
        this.a.remove(vl_02);
    }
}

