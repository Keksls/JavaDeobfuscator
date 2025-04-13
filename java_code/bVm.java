/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TLongObjectIterator
 */
import gnu.trove.iterator.TLongObjectIterator;
import java.util.ArrayList;
import java.util.Collections;

public class bVm
implements ajh_1 {
    public static final String a = "laws";
    public static final String b = "rights";
    public static final String d = "currentLawPoints";
    public static final String e = "nation";
    public final String[] f = new String[]{"laws", "rights", "currentLawPoints", "nation"};
    ArrayList<bUR> h;
    ArrayList<bUR> i;
    private final faX j;
    final /* synthetic */ bUW g;

    public bVm(bUW bUW2, faX faX2) {
        this.g = bUW2;
        this.j = faX2;
    }

    private ArrayList<bUR> b() {
        if (this.h == null) {
            this.h = new ArrayList();
            fdk_0 fdk_02 = this.j.m();
            TLongObjectIterator<fde> tLongObjectIterator = fdk_02.d();
            while (tLongObjectIterator.hasNext()) {
                tLongObjectIterator.advance();
                fde fde2 = (fde)tLongObjectIterator.value();
                boolean bl = fdk_02.c(fde2.a());
                if (fde2.b() >= 0 || !((fde)tLongObjectIterator.value()).d() && !bl && (!this.g.O() || this.j != bUW.a().x())) continue;
                this.h.add(new bUR(fde2));
            }
            Collections.sort(this.h);
        }
        return this.h;
    }

    private ArrayList<bUR> c() {
        if (this.i == null) {
            this.i = new ArrayList();
            fdk_0 fdk_02 = this.j.m();
            TLongObjectIterator<fde> tLongObjectIterator = fdk_02.d();
            while (tLongObjectIterator.hasNext()) {
                tLongObjectIterator.advance();
                boolean bl = fdk_02.c(((fde)tLongObjectIterator.value()).a());
                if (((fde)tLongObjectIterator.value()).b() <= 0 || !((fde)tLongObjectIterator.value()).d() && !bl && (!this.g.O() || this.j != bUW.a().x())) continue;
                this.i.add(new bUR((fde)tLongObjectIterator.value()));
            }
            Collections.sort(this.i);
            Collections.reverse(this.i);
        }
        return this.i;
    }

    @Override
    public String[] d() {
        return this.f;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.b();
        }
        if (string.equals(b)) {
            return this.c();
        }
        if (string.equals(d)) {
            return 50 - this.e();
        }
        if (string.equals(e)) {
            return new bVn(this.j.c());
        }
        return null;
    }

    int e() {
        int n = 0;
        if (this.g.av == null) {
            return n;
        }
        for (bUR bUR2 : this.g.av.h) {
            if (!bUR2.b()) continue;
            n += bUR2.a().c();
        }
        for (bUR bUR2 : this.g.av.i) {
            if (!bUR2.b()) continue;
            n += bUR2.a().c();
        }
        return n;
    }

    public faX a() {
        return this.j;
    }
}

