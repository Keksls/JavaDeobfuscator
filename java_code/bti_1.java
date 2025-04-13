/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

/*
 * Renamed from bTi
 */
class bti_1
implements brw_2 {
    final /* synthetic */ bth_1 a;

    bti_1(bth_1 bth_12) {
        this.a = bth_12;
    }

    @Override
    public void a(long l, List<bss_0<?, ?>> list) {
        this.a.f.Q = (int)Math.ceil((double)l / 12.0);
        this.a.c.addAll(list);
        this.a.d = true;
        if (this.a.b != null) {
            this.a.b.a(list);
        }
    }

    @Override
    public void a() {
        this.a.f.Q = 0;
        this.a.d = true;
        if (this.a.b != null) {
            this.a.b.a();
        }
    }
}

