/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from cVs
 */
public class cvs_0
implements ahr_1 {
    private static final cvs_0 a = new cvs_0();
    private ans_1 b;

    public static ahr_1 a() {
        return a;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        switch (adt_12.a()) {
            case 17791: {
                azu_0.j().b(this);
                return false;
            }
        }
        return true;
    }

    @Override
    public long a_() {
        return 0L;
    }

    @Override
    public void a(long l) {
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (bl) {
            return;
        }
        this.b = string -> {
            if (string.equals("adminCharacterEditorDialog") && !fpm_0.b().q("adminCharacterColorEditorDialog") || string.equals("adminCharacterColorEditorDialog") && !fpm_0.b().q("adminCharacterEditorDialog")) {
                azu_0.j().b(cvs_0.a());
            }
        };
        fpm_0.b().a(this.b);
        fis_1.a().a("spellsList", (Object)null);
        fis_1.a().a("craftSkillsList", (Object)null);
        cvs_0.c();
        cvs_0.d();
        fpm_0.b().a("adminCharacterEditorDialog", cfi_0.a("adminCharacterEditorDialog"), 1L, (short)10000);
        fpm_0.b().a("wakfu.adminCharacterEditor", cfw_0.class);
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (bl) {
            return;
        }
        fis_1.a().a("spellsList");
        fis_1.a().a("craftSkillsList");
        fpm_0.b().o("adminCharacterEditorDialog");
        fpm_0.b().o("adminCharacterColorEditorDialog");
        fpm_0.b().b(this.b);
        fpm_0.b().e("wakfu.adminCharacterEditor");
    }

    public static void c() {
        ArrayList<bpl_0> arrayList = new ArrayList<bpl_0>();
        for (bpl_0 bpl_02 : azu_0.j().k().aZ()) {
            arrayList.add(bpl_02);
        }
        fis_1.a().a("spellsList", arrayList);
    }

    public static void d() {
        bmr_1 bmr_12 = azu_0.j().k();
        ece_0 ece_02 = bmr_12.eX();
        ArrayList arrayList = new ArrayList();
        ecn_0.a.b(ect_02 -> {
            if (ecn_0.a.a(ect_02.a()).e()) {
                return;
            }
            if (ece_02.e(ect_02.a())) {
                return;
            }
            arrayList.add(new brg_1(ect_02.a(), bmr_12.U_(), ece_02));
        });
        fis_1.a().a("craftSkillsList", arrayList);
    }

    public String toString() {
        return "UIAdminCharacterEditorFrame{m_dialogUnloadListener=" + this.b + "}";
    }
}

