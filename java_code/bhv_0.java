/*
 * Decompiled with CFR 0.152.
 */
import java.util.function.Consumer;

/*
 * Renamed from bHV
 */
class bhv_0
implements Consumer<ect_0> {
    private final int a;
    boolean b;

    bhv_0(int n) {
        this.a = n;
    }

    public void a(ect_0 ect_02) {
        brl_1 brl_12 = new brl_1(ect_02.a(), this.a);
        if (brl_12.j()) {
            brl_12.c(this.a);
            brl_12.a(true);
        }
        if (!brl_12.m()) {
            return;
        }
        this.b = true;
    }

    @Override
    public /* synthetic */ void accept(Object object) {
        this.a((ect_0)object);
    }
}

