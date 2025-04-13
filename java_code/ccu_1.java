/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from ccu
 */
public class ccu_1 {
    final int a;
    final boolean b;
    final yn_0 c;
    final ym_0 d;
    final ArrayList<ccv_2> e = new ArrayList();
    final boolean f;

    public ccu_1(ByteBuffer byteBuffer) {
        this.a = byteBuffer.getInt();
        this.b = byteBuffer.get() != 0;
        this.f = byteBuffer.get() != 0;
        this.c = new yn_0(byteBuffer);
        this.d = new ym_0(byteBuffer);
        int n = byteBuffer.getInt();
        for (int k = 0; k < n; ++k) {
            this.e.add(new ccv_2(byteBuffer));
        }
    }

    public ccu_1(int n, boolean bl, yn_0 yn_02, ym_0 ym_02, boolean bl2) {
        this.a = n;
        this.b = bl;
        this.c = yn_02;
        this.d = ym_02;
        this.f = bl2;
    }

    public void a(gk_0 gk_02) {
        gk_02.a(this.a);
        gk_02.a((byte)(this.b ? 1 : 0));
        gk_02.a((byte)(this.f ? 1 : 0));
        this.c.a(gk_02);
        this.d.a(gk_02);
        gk_02.a(this.e.size());
        for (ccv_2 ccv_22 : this.e) {
            ccv_22.a(gk_02);
        }
    }

    public int a() {
        return this.a;
    }

    public yn_0 b() {
        return this.c;
    }

    public ym_0 c() {
        return this.d;
    }

    public boolean d() {
        return this.f;
    }

    public boolean a(ccv_2 ccv_22) {
        return this.e.add(ccv_22);
    }

    public ArrayList<ccv_2> e() {
        return this.e;
    }
}

