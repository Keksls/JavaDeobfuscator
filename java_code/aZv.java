/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Collections;

class aZv
implements Runnable {
    final /* synthetic */ biI a;
    final /* synthetic */ ArrayList b;
    final /* synthetic */ aZu c;

    aZv(aZu aZu2, biI biI2, ArrayList arrayList) {
        this.c = aZu2;
        this.a = biI2;
        this.b = arrayList;
    }

    @Override
    public void run() {
        this.a.an().a(this.b);
        int n = this.b.size();
        for (int k = 0; k < n; ++k) {
            String string = (String)this.b.get(k);
            int n2 = -1;
            String string2 = string.substring(2, string.length());
            if (this.c.f.contains(string2)) continue;
            this.c.f.add(string2);
        }
        Collections.sort(this.c.f);
        fis_1.a().a((ajf_1)this.c, "linkages");
        this.a.an().y();
        if (this.c.f.size() > 0) {
            this.c.e(this.c.f.get(0));
        }
    }
}

