/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TLongArrayList
 */
import gnu.trove.list.array.TLongArrayList;

/*
 * Renamed from btI
 */
public class bti_0
extends OT {
    private bth_0 a;

    public bti_0(int n) {
        super(btd_0.c.a(), btd_0.c.a(n));
    }

    public void a(bth_0 bth_02) {
        this.a = bth_02;
    }

    public int g() {
        return this.a.a();
    }

    @Override
    public String d() {
        return this.a.c();
    }

    @Override
    public int e() {
        return this.a.b();
    }

    @Override
    public void f() {
        this.a(new btU(this.a.c(), this.a.b()));
        this.a(new btT(this.a.e(), this.a.f()));
        this.a(new btT(this.a.g(), this.a.h()));
        this.a(new btT(this.a.i(), this.a.j()));
        this.a(new btO(this.a.k(), this.a(this.a.l())));
        this.a(new btO(this.a.m(), this.b(this.a.n())));
        this.a(new btO(this.a.o(), this.b(this.a.p())));
    }

    private TLongArrayList a(int[] nArray) {
        TLongArrayList tLongArrayList = new TLongArrayList(nArray.length);
        for (int n : nArray) {
            tLongArrayList.add(btd_0.d.a(n));
        }
        return tLongArrayList;
    }

    private TLongArrayList b(int[] nArray) {
        TLongArrayList tLongArrayList = new TLongArrayList(nArray.length);
        for (int n : nArray) {
            tLongArrayList.add(btd_0.e.a(n));
        }
        return tLongArrayList;
    }
}

