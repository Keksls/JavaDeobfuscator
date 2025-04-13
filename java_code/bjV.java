/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.Iterator;
import java.util.LinkedList;
import org.apache.log4j.Logger;

public class bjV
extends bjf_0<bjS> {
    private static final Logger a = Logger.getLogger(bjV.class);
    private final LinkedList<bjS> d = new LinkedList();
    private final bjT e = new bjT(this);
    private boolean f = true;

    public void a(biI biI2, efh_0 efh_02, int n, RH rH, aff_1 aff_12, boolean bl, boolean bl2) {
        bjS bjS2 = new bjS(efh_02, n, aff_12, bl, bl2, rH, this);
        this.b(biI2, bjS2);
        if (!bjS2.f) {
            this.b.add(bjS2);
        }
        bjS2.a(biI2);
    }

    @Override
    public void a(biI biI2, bjS bjS2) {
        if (bjS2.i == null) {
            bjS2.i = this;
        }
        super.b(biI2, bjS2);
    }

    private void c(bjS bjS2) {
        blx_1 blx_12 = bjS2.h.bI();
        if (blx_12 != null && blx_12.bV()) {
            bjS2.g = null;
            return;
        }
        if (blx_12 != null && blx_12.cX() && !blx_12.ak()) {
            bjS2.g = null;
            return;
        }
        if (bjS2.c.a(eff_0.H)) {
            int n = ((bvx_0)ans_0.D().h()).d(bWe.aI);
            bvt_0 bvt_02 = bvt_0.a(n).orElse(bvt_0.a);
            if (bvt_02 == bvt_0.d) {
                bjS2.g = null;
                return;
            }
            if (bvt_02 == bvt_0.b && (blx_12 == null || blx_12.a_() != azu_0.j().k().a_())) {
                bjS2.g = null;
                return;
            }
        }
        bjS2.g = aij_0.a().a(bjS2.a);
        if (blx_12 != null && blx_12.ak()) {
            bjS2.g.a(blx_12.bA());
        }
        if (bjS2.b != null) {
            bjS2.g.b(bjS2.b.d(), bjS2.b.e(), bjS2.b.f());
        } else {
            float f2 = -1.0f;
            int n = -1;
            if (blx_12 instanceof bnh_1) {
                boolean bl;
                bnh_1 bnh_12 = (bnh_1)blx_12;
                bpc_2 bpc_22 = bnh_12.eE();
                boolean bl2 = bl = bpc_22 != null && bpc_22.ac_() == 14;
                if (bl) {
                    f2 = 0.0f;
                    n = 3;
                }
            }
            switch (bjS2.e) {
                case a: 
                case b: {
                    break;
                }
                case d: {
                    f2 = 1.0f;
                    n = 0;
                    break;
                }
                case c: {
                    f2 = 0.5f;
                    n = 0;
                    break;
                }
                default: {
                    a.error((Object)("Localisation d'aps non traitee " + bjS2.e));
                }
            }
            if (f2 < 0.0f || n < 0) {
                bjS2.g.a(bjS2.h);
            } else {
                bjS2.g.a(bjS2.h, f2, n);
            }
        }
        if (bjS2.j) {
            bjS2.g.c(false);
        } else {
            bjS2.j = true;
        }
        bjS2.g.b(this.f);
        aik_0.a().b(bjS2.g);
    }

    @Override
    protected void b(biI biI2, bjS bjS2) {
        if (!bjS2.d && !bjS2.f) {
            this.d.addLast(bjS2);
        }
        if (!this.e.c()) {
            this.e.a();
        }
    }

    @Override
    public void a(bjS bjS2, bjS bjS3, biI biI2) {
        this.d(bjS3);
        if (bjS3 == this.d.peek()) {
            this.d.poll();
            this.f(this.d.peek());
        } else {
            this.a(bjS3);
        }
        if (this.b()) {
            this.e.b();
        }
    }

    @Override
    protected void a(bjS bjS2) {
        Iterator iterator = this.d.iterator();
        while (iterator.hasNext()) {
            bjS bjS3 = (bjS)iterator.next();
            if (bjS3 != bjS2) continue;
            iterator.remove();
        }
    }

    private void d(bjS bjS2) {
        if (bjS2 == null) {
            return;
        }
        if (bjS2.g == null) {
            return;
        }
        bjS2.g.aa();
        bjS2.g = null;
    }

    public void a() {
        if (this.d.isEmpty() || this.d.size() == 1) {
            return;
        }
        bjS bjS2 = this.d.poll();
        this.e(bjS2);
        this.d.addLast(bjS2);
        try {
            this.f(this.d.peek());
        }
        catch (Exception exception) {
            a.error((Object)"Exception levee", (Throwable)exception);
            this.d.poll();
        }
    }

    private void e(bjS bjS2) {
        if (bjS2 == null || bjS2.g == null || !bjS2.g.an()) {
            return;
        }
        bjS2.g.Z();
    }

    private void f(bjS bjS2) {
        if (bjS2 == null) {
            return;
        }
        if (bjS2.g == null || !bjS2.g.an()) {
            this.c(bjS2);
        } else {
            bjS2.g.X();
            bjS2.g.W();
        }
    }

    @Override
    public void a(boolean bl) {
        this.f = bl;
        bjS bjS2 = this.d.peek();
        if (bjS2 == null || bjS2.g == null) {
            return;
        }
        aik_0.a().b(bjS2.g.ac(), bl);
    }

    public void b(bjS bjS2) {
        if (bjS2.d || bjS2.f) {
            this.c(bjS2);
        } else if (this.d.size() == 1) {
            if (this.d.peek() == bjS2) {
                this.c(bjS2);
            } else {
                a.warn((Object)"Si la liste est de taille 1, le premier element devrait etre celui la, ce n'est pas nomal d'en avoir un autre");
            }
        }
    }

    @Override
    public void a(biI biI2) {
        for (bjS bjS2 : this.b) {
            this.a(bjS2, bjS2, biI2);
        }
        this.b.clear();
    }

    public void b(biI biI2, efh_0 efh_02, int n, RH rH, aff_1 aff_12, boolean bl, boolean bl2) {
        bjS bjS2 = new bjS(efh_02, n, aff_12, bl, bl2, rH, this);
        if (bjS2.f) {
            bjS bjS3 = (bjS)this.c();
            this.a(bjS3, (bjS)null, biI2);
        } else {
            this.a(biI2, bjS2, false);
        }
    }

    @Override
    protected /* synthetic */ void a(biI biI2, bjg_0 bjg_02) {
        this.b(biI2, (bjS)bjg_02);
    }

    @Override
    public /* synthetic */ void b(biI biI2, bjg_0 bjg_02) {
        this.a(biI2, (bjS)bjg_02);
    }
}

