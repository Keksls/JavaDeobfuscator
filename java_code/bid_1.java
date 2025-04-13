/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.log4j.Logger;

/*
 * Renamed from biD
 */
public class bid_1
extends bia_1 {
    private static final Logger r = Logger.getLogger(biy_2.class);

    public bid_1(long l, bhr_1 bhr_12) {
        super(l);
        this.o = bhr_12;
        ArrayList<bhq_1> arrayList = bhp_1.a.b();
        bhq_1 object = null;
        for (bhq_1 object2 : arrayList) {
            int bhq_12 = object2.a();
            if (bhq_12 != 4) continue;
            object = object2;
            break;
        }
        if (object == null) {
            r.error((Object)"Probl\u00e8me d'export, pas de cat\u00e9gorie des qu\u00eates !!!");
            return;
        }
        ArrayList<bhq_1> arrayList2 = object.c();
        if (arrayList2 == null) {
            r.error((Object)"Probl\u00e8me d'export, la cat\u00e9gorie des qu\u00eates est vide !!!");
            return;
        }
        for (bhq_1 bhq_12 : arrayList2) {
            int n = bhq_12.a();
            boolean bl = !ArrayUtils.contains((int[])enU.q, (int)n);
            biz_2.a.a(this.q, bhq_12, null);
            if (!bl) continue;
            bin_2 bin_22 = biz_2.a.c(this.q, bhq_12.a());
            this.l.put(n, (Object)bin_22);
            this.m.add(bin_22);
        }
        this.n = (bin_2)this.m.get(0);
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
        return true;
    }
}

