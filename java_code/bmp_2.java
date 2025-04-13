/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from bmP
 */
class bmp_2
implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ bhj_1 b;
    final /* synthetic */ bmn_1 c;

    bmp_2(bmn_1 bmn_12, String string, bhj_1 bhj_12) {
        this.c = bmn_12;
        this.a = string;
        this.b = bhj_12;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        ArrayList<Runnable> arrayList = this.c.f;
        synchronized (arrayList) {
            if (this.c.b()) {
                this.c.a(this.a, this.b);
            } else {
                dbp.a().a(new bmq_1(this));
            }
            this.c.f.remove(this);
        }
    }
}

