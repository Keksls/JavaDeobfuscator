/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashSet;
import java.util.Set;

/*
 * Renamed from eHU
 */
public final class ehu_0
extends ejh_0 {
    private static final aqr_2 v = new eFw(new eFv("Params", new eFu[0]));

    @Override
    public aqr_2 c_() {
        return v;
    }

    public ehu_0() {
        this.M();
    }

    public ehu_0 aD() {
        ehu_0 ehu_02 = new ehu_0();
        return ehu_02;
    }

    @Override
    public void j(sd_0 sd_02) {
    }

    @Override
    protected void b(sd_0 sd_02, boolean bl) {
        this.ba();
        if (!(this.f instanceof epq_2)) {
            a.error((Object)"La cible doit \u00eatre un fighter");
            return;
        }
        if (!(this.m() instanceof efq_0)) {
            a.error((Object)"Cet effet ne peut \u00eatre utilis\u00e9 que dans un combat");
            return;
        }
        epq_2 epq_22 = (epq_2)this.f;
        HashSet<epq_2> hashSet = new HashSet<epq_2>();
        aej_2[] aej_2Array = aej_2.d();
        for (int k = 0; k < aej_2Array.length; ++k) {
            aej_2 object = aej_2Array[k];
            hashSet.addAll(this.a(epq_22, object));
        }
        for (epq_2 epq_23 : hashSet) {
            epq_23.c(eoz_1.aX);
        }
    }

    private Set<epq_2> a(epq_2 epq_22, aej_2 aej_22) {
        Object object;
        aff_1 aff_12 = new aff_1(epq_22.P_());
        aff_12.a(aej_22);
        efq_0 efq_02 = (efq_0)this.m();
        elm_0 elm_02 = efq_02.l();
        byte by = epq_22.Y();
        HashSet<Object> hashSet = new HashSet<Object>();
        HashSet<Object> hashSet2 = new HashSet<Object>();
        HashSet<Object> hashSet3 = new HashSet<Object>();
        while (elm_02.d(aff_12) != null) {
            object = elm_02.d(aff_12);
            if (((epq_2)object).Y() == by) {
                hashSet2.addAll(hashSet);
                hashSet3.add(object);
                hashSet.clear();
                break;
            }
            hashSet.add(object);
            aff_12.a(aej_22);
        }
        object = new HashSet();
        object.addAll(hashSet3);
        object.addAll(hashSet2);
        return object;
    }

    @Override
    public boolean Q() {
        return false;
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
    }

    @Override
    public /* synthetic */ sd_0 x() {
        return this.aD();
    }
}

