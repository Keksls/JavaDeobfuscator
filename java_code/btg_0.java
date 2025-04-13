/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TLongArrayList
 */
import gnu.trove.list.array.TLongArrayList;

/*
 * Renamed from btG
 */
public class btg_0
extends OT {
    private btf_0 a;

    public btg_0() {
        super(btd_0.a.a(), btd_0.a.a(0));
    }

    public void a(btf_0 btf_02) {
        this.a = btf_02;
    }

    @Override
    public String d() {
        return this.a.b();
    }

    @Override
    public int e() {
        return 0;
    }

    @Override
    public void f() {
        this.a(new btU(this.a.b(), 0));
        this.a(new btO("", this.a(this.a.a()), true));
    }

    private TLongArrayList a(int[] nArray) {
        TLongArrayList tLongArrayList = new TLongArrayList(nArray.length);
        for (int n : nArray) {
            tLongArrayList.add(btd_0.b.a(n));
        }
        return tLongArrayList;
    }
}

