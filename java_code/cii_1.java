/*
 * Decompiled with CFR 0.152.
 */
import com.ankamagames.wakfu.client.chat.console.command.AwayCommand;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from ciI
 */
final class cii_1
extends chd_1<ctm_1, bvw_2> {
    private blx_1 b;

    cii_1() {
    }

    @Override
    public boolean a(ctm_1 ctm_12) {
        long l = ctm_12.b();
        blx_1 blx_12 = bmf_2.a().c(l);
        if (blx_12 == null) {
            this.a(l, false);
            return false;
        }
        this.b = blx_12;
        String string = blx_12.dp();
        if (aUL.a().f().a(l) != null) {
            this.a(l, false);
            return false;
        }
        if (AwayCommand.a && !AwayCommand.b.isEmpty()) {
            aUh.a(AwayCommand.b, blx_12.dp());
            this.a(l, false);
            return false;
        }
        String string2 = this.b();
        Object object = ctm_12.c() == 2 ? bae.h().a("fight.arenaInvitation.dialog", string) : bae.h().a("fight.invitation.dialog", string);
        if (string2 != null) {
            object = (String)object + "\n" + string2;
        }
        fzm_0 fzm_02 = fpm_0.b().a((String)object, cfn_0.a(6), 2073L, 102, 1);
        fzm_02.a(new cij_1(this, l));
        aUh.c("fight.invitation.dialog", string);
        return false;
    }

    private String b() {
        List<fde> list;
        List<fde> list2;
        fbl_0 fbl_02 = cSR.j();
        if (fbl_02 == null) {
            return null;
        }
        ani_2 ani_22 = new ani_2();
        boolean bl = this.c();
        if (bl) {
            ani_22.i().a(azf_2.h.w());
            ani_22.a((CharSequence)"\n").a((CharSequence)bae.h().a("desc.mru.illegalAction", new Object[0]));
            ani_22.j();
        }
        List<fde> list3 = this.d();
        if (fbl_02 == fbl_0.b && !list3.isEmpty()) {
            ani_22.m().i().a(cSS.g);
            ani_22.a().a((CharSequence)bae.h().a("nation.law.mru.good", new Object[0])).b();
            ani_22.j();
            cSR.a(ani_22, list3, cSS.g, bl);
        }
        if (!(list2 = this.f()).isEmpty()) {
            ani_22.m().i().a(cSS.h);
            ani_22.a().a((CharSequence)bae.h().a("nation.law.mru.bad", new Object[0])).b();
            ani_22.j();
            cSR.a(ani_22, list2, cSS.h, bl);
        }
        List<fde> list4 = this.e();
        if (fbl_02 == fbl_0.b && !list4.isEmpty()) {
            ani_22.m().i().a("9ed34b");
            ani_22.a().a((CharSequence)bae.h().a("nation.law.mru.probablyGood", new Object[0])).b();
            ani_22.j();
            cSR.a(ani_22, list4, "9ed34b", bl);
        }
        if (!(list = this.g()).isEmpty()) {
            ani_22.m().i().a("f48140");
            ani_22.a().a((CharSequence)bae.h().a("nation.law.mru.probablyBad", new Object[0])).b();
            ani_22.j();
            cSR.a(ani_22, list, "f48140", bl);
        }
        return ani_22.q() > 0 ? ani_22.r() : null;
    }

    private boolean c() {
        if (cSR.j() != fbl_0.a) {
            return false;
        }
        List<fde> list = this.f();
        return !list.isEmpty();
    }

    private List<fde> d() {
        return fde.b(this.h());
    }

    private List<fde> e() {
        return fde.b(this.i());
    }

    private List<fde> f() {
        return fde.c(this.h());
    }

    private List<fde> g() {
        return fde.c(this.i());
    }

    private List<fde> h() {
        bmr_1 bmr_12 = azu_0.j().k();
        ArrayList<blx_1> arrayList = new ArrayList<blx_1>();
        ArrayList<bmr_1> arrayList2 = new ArrayList<bmr_1>();
        ArrayList<fde> arrayList3 = new ArrayList<fde>();
        arrayList2.add(bmr_12);
        arrayList.add(this.b);
        fex_0 fex_02 = new fex_0(bmr_12, emr_2.n, bmr_12, this.b, null, arrayList);
        fey_0 fey_02 = new fey_0(bmr_12, emr_2.n, this.b, bmr_12, arrayList2);
        fes fes2 = new fes(bmr_12, true);
        arrayList3.addAll(fes2.b());
        fes2 = new fes(bmr_12, false);
        arrayList3.addAll(fes2.b());
        arrayList3.addAll(fex_02.b());
        arrayList3.addAll(fey_02.b());
        return arrayList3;
    }

    private List<fde> i() {
        bmr_1 bmr_12 = azu_0.j().k();
        ArrayList<fde> arrayList = new ArrayList<fde>();
        fez_0 fez_02 = new fez_0(bmr_12, this.b, 0, 1, emr_2.n);
        arrayList.addAll(fez_02.b());
        feA feA2 = new feA(bmr_12, emr_2.n, bmr_12);
        feI feI2 = new feI(bmr_12, emr_2.n);
        arrayList.addAll(feA2.b());
        arrayList.addAll(feI2.b());
        return arrayList;
    }

    void a(long l, boolean bl) {
        cmt_0 cmt_02 = new cmt_0();
        if (bl) {
            blx_1 blx_12 = bmf_2.a().c(l);
            if (blx_12 == null) {
                cmt_02.a(false);
            } else {
                cmt_02.a(bl);
            }
        } else {
            cmt_02.a(false);
        }
        cmt_02.b(((bvx_0)ans_0.D().h()).a(bWe.G));
        cmt_02.a(l);
        azu_0.j().K().c(cmt_02);
    }

    public String toString() {
        return "FightInvitationMessageHandler{m_characterInfo=" + this.b + "}";
    }
}

