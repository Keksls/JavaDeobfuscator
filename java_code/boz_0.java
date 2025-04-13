/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongLongHashMap
 */
import gnu.trove.map.hash.TLongLongHashMap;
import java.util.HashMap;

/*
 * Renamed from bOZ
 */
public class boz_0
extends eJL {
    private long u;
    private int v;
    private final TLongLongHashMap w = new TLongLongHashMap();
    private bPd x;

    public boz_0(Su su) {
        super(su);
    }

    @Override
    public void a() {
        this.w.clear();
        if (this.x != null) {
            this.x.b();
        }
        super.a();
    }

    @Override
    public void c() {
        this.w.clear();
        if (this.x != null) {
            this.x.b();
        }
        super.c();
    }

    @Override
    public void k() {
        adi_2.a().a(this.u);
        super.k();
    }

    @Override
    public boolean a(adt_1 adt_12) {
        if (!(adt_12 instanceof adh_2)) {
            return false;
        }
        if (((adh_2)adt_12).b() != this.u) {
            return super.a(adt_12);
        }
        if (!this.w.isEmpty()) {
            ++this.v;
            HashMap<Long, sd_0> hashMap = new HashMap<Long, sd_0>();
            for (long l : this.w.keys()) {
                sd_0 sd_02 = (sd_0)this.b.get(l);
                if (sd_02 == null) continue;
                hashMap.put(this.c(l), sd_02);
            }
            if (ans_0.F().k() != null) {
                ans_0.F().k().a(new epb_1(hashMap));
            }
            return true;
        }
        return true;
    }

    @Override
    public boolean a(long l, boolean bl) {
        this.w.remove(l);
        return super.a(l, bl);
    }

    @Override
    public void a(sd_0 sd_02) {
        long l = 0L;
        ejh_0 ejh_02 = (ejh_0)sd_02;
        if (ejh_02.m() != null) {
            if (!ejh_02.at() && ejh_02.bp_()) {
                l = ejh_02.bo_();
                this.w.put(ejh_02.c(), (long)this.v + l / 1000L);
            }
            super.a(sd_02);
        }
    }

    @Override
    public void a(Su su, So so) {
        this.u = adi_2.a().a(this, 1000L, 0);
        this.v = 0;
        this.x = null;
        super.a(su, so);
    }

    public void a(bPd bPd2) {
        this.x = bPd2;
    }

    public long c(long l) {
        if (this.w.get(l) > (long)this.v) {
            return this.w.get(l) - (long)this.v;
        }
        return -1L;
    }
}

