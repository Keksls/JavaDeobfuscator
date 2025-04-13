/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from biy
 */
public class biy_2
extends bia_1 {
    public biy_2(long l, bhr_1 bhr_12) {
        super(l);
        this.o = bhr_12;
        ArrayList<bhq_1> arrayList = bhp_1.a.b();
        for (bhq_1 bhq_12 : arrayList) {
            int n = bhq_12.a();
            if (n == 4) continue;
            biu_2 biu_22 = biz_2.a.a(l, bhq_12, null);
            this.l.put(n, (Object)biu_22);
            this.m.add(biu_22);
        }
        this.p = biz_2.a.a(l);
        this.l.put(this.p.g(), (Object)this.p);
        if (!this.m.isEmpty()) {
            this.n = (bin_2)this.m.get(0);
        }
    }

    @Override
    public Object b(String string) {
        if (string.equals("isQuestView")) {
            return this.c();
        }
        return super.b(string);
    }

    @Override
    public boolean c() {
        return false;
    }
}

