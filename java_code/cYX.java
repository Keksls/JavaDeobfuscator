/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public class cYX
extends cuy_0
implements ahr_1 {
    private bvx_2 d;
    private biI e;
    public static final cYX c = new cYX();

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            bvx_2 bvx_22 = azu_0.j().k().dm();
            if (bvx_22 == null) {
                return;
            }
            cxu_0.a().c(false);
            aZG.e().a("fight", true);
            aZG.e().a("world", false);
            this.d = bvx_22;
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            if (this.e != null) {
                biM.b(this.e);
                this.e = null;
            }
            cxu_0.a().c(true);
            aZG.e().a("fight", false);
            aZG.e().a("world", true);
            this.d = null;
            this.e();
        }
    }

    @Override
    public boolean a(adt_1 adt_12) {
        if (this.d == null) {
            return true;
        }
        switch (adt_12.a()) {
            case 16119: {
                dhL dhL2 = (dhL)adt_12;
                ace_0 ace_02 = ans_0.D().c();
                ArrayList<abz_0> arrayList = ((aNF)ace_02).e(dhL2.r(), dhL2.s());
                if (arrayList.isEmpty() || !dhL2.q()) break;
                cYX.a(arrayList, this.d.c());
                return false;
            }
            case 19751: {
                dhL dhL3 = (dhL)adt_12;
                ace_0 ace_03 = ans_0.D().c();
                aff_1 aff_12 = this.a(dhL3.r(), dhL3.s(), !cYX.c(), false, this.d);
                if (aff_12 != null && this.d != null && this.d.d(aff_12) == null) {
                    this.a(ace_03, aff_12, this.d);
                }
                return false;
            }
            case 16992: {
                cYX.a(this.d);
                return false;
            }
            case 16468: {
                cYX.b(this.d);
                return false;
            }
            case 19764: {
                cYX.f();
                return false;
            }
        }
        return true;
    }

    private void h() {
        if (this.e != null) {
            biM.b(this.e);
            this.e = null;
        }
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }

    public String toString() {
        return "UIFightSpectatorFrame{m_fight=" + this.d + ", m_actor=" + this.e + "}";
    }

    public bvx_2 g() {
        return this.d;
    }
}

