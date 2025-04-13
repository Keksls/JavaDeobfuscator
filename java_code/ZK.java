/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

class ZK {
    private final air_0 a = new air_0();
    final ZG b;

    ZK(ZG zG) {
        this.b = zG;
        this.a.b(1.0f);
        this.a.a(0.001f);
        this.a.c(0.0f);
    }

    public void a(float f2) {
        this.a.e(f2);
    }

    public void a(int n) {
        this.a.a(n);
        this.b.a(n);
    }

    public void a(ArrayList<ZM> arrayList) {
        float f2 = this.a();
        ArrayList<ZM> arrayList2 = this.b.b();
        int n = arrayList2.size();
        for (int k = 0; k < n; ++k) {
            ZM zM = arrayList2.get(k);
            zM.a(f2);
            arrayList.add(zM);
        }
    }

    public final float a() {
        return this.a.a();
    }
}

