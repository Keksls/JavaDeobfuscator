/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/*
 * Renamed from eFW
 */
public abstract class efw_0
extends ejh_0 {
    private static final BitSet C = new BitSet();
    protected byte v = 0;
    protected byte w = 0;
    protected int x = 0;
    protected int y = 0;
    protected int z = 0;
    protected boolean A = false;
    protected HashSet<Long> B = null;

    public abstract efw_0 aC();

    public efw_0 aD() {
        efw_0 efw_02 = this.aC();
        efw_02.B = this.B;
        efw_02.v = this.v;
        efw_02.w = this.w;
        efw_02.x = this.x;
        efw_02.y = this.y;
        efw_02.z = this.z;
        return efw_02;
    }

    @Override
    public BitSet L() {
        return C;
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        if (this.D()) {
            this.B.add(this.f.a_());
        }
        this.j(true);
    }

    @Override
    public void j(sd_0 sd_02) {
        this.m -= (int)((float)(this.v * this.y * this.m) / 100.0f);
        if (this.f != null) {
            this.B.add(this.f.a_());
        }
    }

    @Override
    public boolean ab() {
        if (this.f instanceof sr_0 && !((sr_0)this.f).ab()) {
            return false;
        }
        return super.ab();
    }

    @Override
    public void al() {
        this.v = (byte)(this.v + 1);
        if (this.v > this.w) {
            return;
        }
        int n = this.x - (int)((float)(this.v * this.y * this.x) / 100.0f);
        if (n <= 0) {
            return;
        }
        if (this.h == null || this.h.f() == null) {
            return;
        }
        if (!this.f.a(eps_0.b)) {
            return;
        }
        if (this.f instanceof sr_0 && !((sr_0)this.f).ab()) {
            return;
        }
        ArrayList<abo_2<Integer, Su>> arrayList = new ArrayList<abo_2<Integer, Su>>();
        if (!(this.f instanceof eks_0)) {
            Iterator<Su> iterator = this.aE();
            while (iterator.hasNext()) {
                Su su = iterator.next();
                if (!su.a(eps_0.b) || !su.an()) continue;
                this.a(arrayList, su);
            }
        }
        if (!arrayList.isEmpty()) {
            this.c(arrayList);
        }
        super.al();
    }

    private Iterator<Su> aE() {
        return this.h.c().k();
    }

    private void a(ArrayList<abo_2<Integer, Su>> arrayList, Su su) {
        boolean bl;
        boolean bl2;
        int n;
        int n2 = this.z;
        if (this.B.contains(su.a_())) {
            return;
        }
        apc_2 apc_22 = ((efh_0)this.c).Q();
        if (apc_22 != null && (n = (int)(apc_22.b(this.e, su, this.k(), this.m()) ? 1 : 0)) == 0) {
            return;
        }
        n = aob_2.c((aoc_2)su, this.f);
        boolean bl3 = bl2 = n > n2;
        if (bl2) {
            return;
        }
        if (su instanceof sr_0 && !((sr_0)su).ab()) {
            return;
        }
        if (!(su instanceof ekf_0)) {
            if (!(this.e instanceof app_2) || !(su instanceof app_2)) {
                return;
            }
            if (!this.a((app_2)((Object)this.e), (app_2)((Object)su))) {
                return;
            }
        }
        if (!(bl = this.a(su, this.f))) {
            return;
        }
        this.a(arrayList, su, n);
    }

    protected abstract boolean a(app_2 var1, app_2 var2);

    private boolean a(Su su, Su su2) {
        boolean bl;
        tg_0 tg_02 = this.h.e();
        if (tg_02 == null) {
            a.warn((Object)("pas de fightmap sur le context " + this.h));
            return false;
        }
        ui_0 ui_02 = ui_0.a();
        ui_02.a(su2.G(), su2.H(), su2.I());
        ui_02.b(su.G(), su.H(), su.I());
        ui_02.a(tg_02);
        if (su2 instanceof ti_0) {
            tg_02.d((ti_0)((Object)su2));
        }
        try {
            if (ui_02.b()) {
                tg_02.l();
                ui_02.release();
                return true;
            }
            if (su.W() <= 0) {
                tg_02.l();
                ui_02.release();
                return false;
            }
            ui_02.a(su2.G(), su2.H(), (short)(su.I() + su.W()));
            ui_02.b(su.G(), su.H(), (short)(su2.I() + su2.W()));
            bl = ui_02.b();
            ui_02.release();
        }
        catch (Exception exception) {
            a.error((Object)"Exception levee", (Throwable)exception);
            tg_02.l();
            return false;
        }
        return bl;
    }

    void a(List<abo_2<Integer, Su>> list, Su su, int n) {
        if (list == null) {
            return;
        }
        if (list.isEmpty()) {
            list.add(new abo_2<Integer, Su>(n, su));
        } else {
            boolean bl = false;
            int n2 = 0;
            for (abo_2<Integer, Su> abo_22 : list) {
                if (abo_22.a() > n) {
                    list.add(n2, new abo_2<Integer, Su>(n, su));
                    bl = true;
                    break;
                }
                if (abo_22.a() == n && abo_22.b().a(eps_0.b) && su.a(eps_0.b) && abo_22.b().c(eps_0.b) > su.c(eps_0.b)) {
                    list.add(n2, new abo_2<Integer, Su>(n, su));
                    bl = true;
                    break;
                }
                ++n2;
            }
            if (!bl) {
                list.add(list.size(), new abo_2<Integer, Su>(n, su));
            }
        }
    }

    private void c(List<abo_2<Integer, Su>> list) {
        if (!this.bg()) {
            return;
        }
        if (!this.A) {
            this.a(list);
        } else {
            this.b(list);
        }
    }

    @Override
    void a(List<abo_2<Integer, Su>> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Su su = list.get(0).b();
        if (this.B != null) {
            this.B.add(su.a_());
        }
        this.d(su);
    }

    void b(List<abo_2<Integer, Su>> list) {
        if (list == null) {
            return;
        }
        int n = Math.min(this.w, list.size());
        for (int k = 0; k < n; ++k) {
            Su su = list.get(k).b();
            if (this.B != null && !this.B.contains(su.a_())) {
                this.B.add(su.a_());
                this.d(su);
            }
            n = Math.min(this.w, list.size());
        }
    }

    private void d(Su su) {
        efw_0 efw_02 = (efw_0)this.w();
        efw_02.c(su);
        efw_02.q();
    }

    @Override
    public boolean Q() {
        return true;
    }

    @Override
    public boolean R() {
        return true;
    }

    @Override
    public boolean S() {
        return false;
    }

    @Override
    public void z() {
        super.z();
        this.v = 0;
        this.w = 0;
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.B = null;
        this.A = false;
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aD();
    }
}

