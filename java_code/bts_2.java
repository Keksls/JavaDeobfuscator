/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;

/*
 * Renamed from bTS
 */
class bts_2
implements TObjectProcedure<btm_2> {
    final /* synthetic */ btr_2 a;

    bts_2(btr_2 btr_22) {
        this.a = btr_22;
    }

    public boolean a(btm_2 btm_22) {
        ArrayList<ajf_1> arrayList = btm_22.f;
        for (ajf_1 ajf_12 : arrayList) {
            Object object;
            Object object2;
            if (ajf_12 instanceof buc_2) {
                object2 = new fkz(this.a.a);
                object = (buc_2)ajf_12;
                int n = ((buc_2)object).h();
                ((bue_2)object).a(((fkx)object2).a(new cdj_1(0L, n, 0, Short.MIN_VALUE, Short.MIN_VALUE)));
                ((bue_2)object).a((fkx)object2);
                continue;
            }
            if (ajf_12 instanceof buf_2 || !(ajf_12 instanceof bug_2)) continue;
            object2 = (bug_2)ajf_12;
            object = (etn_2)((bue_2)object2).i();
            esl_1 esl_12 = ddZ.d().a();
            int n = this.a(esl_12);
            boolean bl = this.a.b.b(((etn_2)object).b()) ? n >= 20 : false;
            boolean bl2 = this.a.a.b(((etn_2)object).a());
            ((bue_2)object2).a(bl2 && !bl);
        }
        return true;
    }

    private int a(esl_1 esl_12) {
        if (esl_12 == null) {
            return 0;
        }
        ahh_2 ahh_22 = new ahh_2();
        esl_12.b(new btt_2(this, ahh_22));
        for (btd_2 btd_22 : this.a.b.n) {
            this.a(ahh_22, btd_22, esl_12);
        }
        return ahh_22.c();
    }

    private void a(ahh_2 ahh_22, btd_2 btd_22, esl_1 esl_12) {
        cLl cLl2;
        fkw fkw2;
        short s2;
        cLm cLm2 = btd_22.c();
        if (cLm2 instanceof cLj) {
            cLj cLj2 = (cLj)cLm2;
            fkw fkw3 = (fkw)cLj2.e();
            short s3 = cLj2.b();
            if (this.a.b.b(fkw3.h()) && !this.a.b.b(s3)) {
                ahh_22.a();
            } else if (!this.a.b.b(fkw3.h()) && this.a.b.b(s3)) {
                ahh_22.a(-1);
            }
        } else if (cLm2 instanceof cLl && this.a.b.b(s2 = (fkw2 = (fkw)(cLl2 = (cLl)cLm2).e()).h())) {
            ahh_22.a(-1);
        }
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((btm_2)object);
    }
}

