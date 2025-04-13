/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 */
import gnu.trove.iterator.TLongObjectIterator;
import java.util.ArrayList;

/*
 * Renamed from bUw
 */
public class buw_0
implements fck {
    public static final buw_0 a = new buw_0();
    private int b = -1;
    private final ArrayList<Long> c = new ArrayList();

    private buw_0() {
    }

    @Override
    public void a(faX faX2) {
        int n = faX2.c();
        boolean bl = this.b == -1 || this.b != n;
        this.b = n;
        if (bl) {
            this.c.clear();
        }
        fdk_0 fdk_02 = faX2.m();
        TLongObjectIterator<fde> tLongObjectIterator = fdk_02.d();
        while (tLongObjectIterator.hasNext()) {
            dhc dhc2;
            String string;
            String string2;
            String string3;
            String string4;
            tLongObjectIterator.advance();
            long l = tLongObjectIterator.key();
            if (fdk_02.c(l)) {
                if (this.c.contains(l)) continue;
                this.c.add(l);
                if (bl) continue;
                string4 = bae.h().a(39, (long)n, new Object[0]);
                string3 = bae.h().a(97, (long)((int)l), new Object[0]);
                string2 = bae.h().a("notification.lawAddedTitle", new Object[0]);
                string = cIg.createLink(bae.h().a("notification.lawAddedText", string4, string3), blr_1.e, "2");
                dhc2 = new dhc(string2, string, blr_1.e, 600132);
                add_2.b().a(dhc2);
                continue;
            }
            if (bl || !this.c.contains(l)) continue;
            this.c.remove(l);
            string4 = bae.h().a(39, (long)n, new Object[0]);
            string3 = bae.h().a(97, (long)((int)l), new Object[0]);
            string2 = bae.h().a("notification.lawRemovedTitle", new Object[0]);
            string = cIg.createLink(bae.h().a("notification.lawRemovedText", string4, string3), blr_1.e, "2");
            dhc2 = new dhc(string2, string, blr_1.e, 600132);
            add_2.b().a(dhc2);
        }
        fis_1.a().a((ajf_1)bwy_2.h(), "nation");
    }

    public void a() {
        this.c.clear();
        this.b = -1;
    }
}

