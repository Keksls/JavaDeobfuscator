/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TLongArrayList
 */
import gnu.trove.list.array.TLongArrayList;
import java.util.List;

/*
 * Renamed from btK
 */
public class btk_0
extends OT {
    private btj_0 a;

    public btk_0(int n) {
        super(btd_0.b.a(), btd_0.b.a(n));
    }

    public void a(btj_0 btj_02) {
        this.a = btj_02;
    }

    public int g() {
        return this.a.b();
    }

    @Override
    public String d() {
        return this.a.a();
    }

    @Override
    public int e() {
        return this.a.c();
    }

    @Override
    public void f() {
        List<bpb_1> list;
        List<bpb_1> list2;
        this.a(new btU(this.a.a(), this.a.c()));
        List<bpb_1> list3 = this.a.e();
        if (list3 != null) {
            this.a(new btO(this.a.d(), this.a(list3)));
        }
        if ((list2 = this.a.g()) != null) {
            this.a(new btO(this.a.f(), this.a(list2)));
        }
        if ((list = this.a.i()) != null) {
            this.a(new btO(this.a.h(), this.a(list)));
        }
    }

    private TLongArrayList a(List<bpb_1> list) {
        TLongArrayList tLongArrayList = new TLongArrayList(list.size());
        for (bpb_1 bpb_12 : list) {
            tLongArrayList.add(btd_0.c.a(bpb_12.s()));
        }
        return tLongArrayList;
    }
}

