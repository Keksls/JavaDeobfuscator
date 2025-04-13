/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

public class bLw
extends bLt {
    private long c;

    public void a(long l) {
        this.c = l;
    }

    @Override
    public void a(fjg_1 fjg_12) {
        afc afc2;
        if (!bLt.b(fjg_12)) {
            fjg_12.f(false);
            return;
        }
        if (fjg_12.j() instanceof afc && this.a(afc2 = (afc)fjg_12.j())) {
            if (afc2.a == this.c) {
                fjg_12.f(false);
                return;
            }
            fjg_12.e(true);
            Object Info = fjs.a.a(fjv.b, afc2.a);
            bLw.a(fjg_12, ((fjB)Info).h());
            long l = azu_0.j().n().u();
            if (fjq_0.a(l, ay_0.b, (int)afc2.a)) {
                fjg_12.f(true);
                fjg_12.d(true);
                fjg_12.e(false);
                return;
            }
        }
        fjg_12.f(true);
        fjg_12.d(false);
        fjg_12.e(true);
    }

    private boolean a(afc afc2) {
        return afc2.b == 47;
    }

    @Override
    private boolean b(fjg_1 fjg_12) {
        if (fjg_12.j() instanceof afc) {
            return this.a((afc)fjg_12.j());
        }
        return false;
    }

    @Override
    public List<fjg_1> a(List<fjg_1> list) {
        ArrayList<fjg_1> arrayList = new ArrayList<fjg_1>(list);
        list.sort((fjg_12, fjg_13) -> {
            boolean bl = this.b((fjg_1)fjg_12);
            boolean bl2 = this.b((fjg_1)fjg_13);
            if (bl && !bl2) {
                return 1;
            }
            if (!bl && bl2) {
                return -1;
            }
            return 0;
        });
        return arrayList;
    }
}

