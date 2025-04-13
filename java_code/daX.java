/*
 * Decompiled with CFR 0.152.
 */
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class daX
implements ahr_1 {
    public static final daX a = new daX();
    private final ceq_2 b = new ceq_2();
    private final ans_1 c = new daY(this);

    private static void a(short s2, byte by, Object ... objectArray) {
        Pt pt = new Pt();
        pt.a(s2);
        pt.a(by);
        for (Object object : objectArray) {
            pt.a(object);
        }
        azu_0.j().K().c(pt);
    }

    public static void a(short s2, Object ... objectArray) {
        daX.a(s2, (byte)2, objectArray);
    }

    public static void b(short s2, Object ... objectArray) {
        daX.a(s2, (byte)3, objectArray);
    }

    public static void c(short s2, Object ... objectArray) {
        daX.a(s2, (byte)6, objectArray);
    }

    public static void d(short s2, Object ... objectArray) {
        daX.a(s2, (byte)1, objectArray);
    }

    public static void a(flz_0 flz_02, flx_0 flx_02, Object object) {
        daX.a((short)96, new Object[]{flz_02.a(), flx_02.a(), object});
    }

    public static void a() {
        daX.a((short)213, new Object[0]);
        daX.a((short)218, new Object[0]);
        daX.b((short)377, new Object[0]);
        fis_1.a().a((ajf_1)a.g(), "moderatorPosition", "moderatorInstance");
    }

    public void a(List<flu_0> list) {
        this.b.a();
        for (flu_0 flu_02 : list) {
            this.a(flu_02);
        }
    }

    public void a(flu_0 flu_02) {
        this.b.a(flu_02);
        fis_1.a().a("moderationPanelView", "penalFile");
    }

    public void a(long l, long l2) {
        this.b.a(l, l2);
        fis_1.a().a("moderationPanelView", "penalFile");
    }

    public void c() {
        List<cer_2> list = this.b.b();
        String string = list.stream().map(cer_2::toString).collect(Collectors.joining("\n"));
        cel_2 cel_22 = this.b.c();
        String string2 = "Penal file of player " + cel_22.b() + " - Account Id = " + cel_22.c() + " - Character Id = " + cel_22.e() + " :";
        if (!ca_0.a(string2 + "\n\n" + string)) {
            cfn_1.a("Cannot automatically copy penal file of player \"" + cel_22.b() + "\" to clipboard, permission denied");
        }
    }

    public void d() {
        cel_2 cel_22 = (cel_2)this.b.b("currentPlayer");
        if (cel_22 == null) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Account ID: ");
        stringBuilder.append(cel_22.c());
        stringBuilder.append(System.lineSeparator());
        stringBuilder.append("Character ID: ");
        stringBuilder.append(cel_22.e());
        stringBuilder.append(System.lineSeparator());
        stringBuilder.append("Character Name: ");
        stringBuilder.append(cel_22.b());
        stringBuilder.append(System.lineSeparator());
        stringBuilder.append("Ankama Name: ");
        stringBuilder.append(cel_22.f()).append('#').append(cel_22.g());
        stringBuilder.append(System.lineSeparator());
        List list = (List)this.b.b("logs");
        if (list != null) {
            stringBuilder.append("Player penal history for this session:");
            stringBuilder.append(System.lineSeparator());
            String string = String.valueOf(cel_22.c());
            for (int k = list.size() - 1; k >= 0 && k > list.size() - 150; --k) {
                String string2 = (String)list.get(k);
                if (!string2.contains(string)) continue;
                int n = string2.indexOf(40);
                int n2 = string2.indexOf(41);
                if (n2 == -1 || n == -1) continue;
                stringBuilder.append(string2, 0, n);
                stringBuilder.append(string2.substring(n2 + 1));
                stringBuilder.append(System.lineSeparator());
            }
        }
        ca_0.a(stringBuilder.toString());
    }

    @Override
    public void a(aav_2 aav_22, boolean bl) {
        if (!bl) {
            fpm_0.b().a(this.c);
            fpm_0.b().a("moderationPanelDialog", cfi_0.a("moderationPanelDialog"), 32769L, (short)10000);
            fis_1.a().a("moderationPanelView", this.b);
            fpm_0.b().a("wakfu.moderationPanel", chl_0.class);
            if (!azu_0.j().c(cfn_1.a())) {
                azu_0.j().a(cfn_1.a());
            }
            if (this.b.h() == ceo_2.b) {
                daX.a(flz_0.a, flx_0.a, (Object)this.b.c().b());
            }
            if (this.b.h() == ceo_2.a) {
                daX.a();
            }
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            fpm_0.b().b(this.c);
            if (fpm_0.b().q("moderationPanelDialog")) {
                fpm_0.b().o("moderationPanelDialog");
            }
            fis_1.a().a("moderationPanelView");
            fpm_0.b().e("wakfu.moderationPanel");
            if (azu_0.j().c(cfn_1.a())) {
                azu_0.j().b(cfn_1.a());
            }
            if (fpm_0.b().q("moderationPenalFileDialog")) {
                fpm_0.b().o("moderationPenalFileDialog");
            }
            if (fpm_0.b().q("moderationLocalizedSystemMessageDialog")) {
                fpm_0.b().o("moderationLocalizedSystemMessageDialog");
            }
        }
    }

    public static void e() {
        if (fpm_0.b().q("moderationPenalFileDialog")) {
            fpm_0.b().o("moderationPenalFileDialog");
        } else {
            daX.h();
        }
    }

    public static void f() {
        if (fpm_0.b().q("moderationLocalizedSystemMessageDialog")) {
            fpm_0.b().o("moderationLocalizedSystemMessageDialog");
        } else {
            fpm_0.b().a("moderationLocalizedSystemMessageDialog", cfi_0.a("moderationLocalizedSystemMessageDialog"), 32768L, (short)10005);
        }
    }

    public void a(boolean bl) {
        this.b.b(bl);
    }

    public static void a(Map<Byte, String> map) {
        Object[] objectArray = new Object[map.size() * 2];
        int n = 0;
        for (Map.Entry<Byte, String> entry : map.entrySet()) {
            objectArray[n] = entry.getKey();
            objectArray[++n] = entry.getValue();
            ++n;
        }
        daX.a((short)71, objectArray);
    }

    private static void h() {
        fpm_0.b().a("moderationPenalFileDialog", cfi_0.a("moderationPenalFileDialog"), 32768L, (short)10005);
        fyy_0 fyy_02 = fpm_0.b().h().d("moderationPenalFileDialog");
        if (fyy_02 != null) {
            fxu_0 fxu_02 = daX.i();
            fuc_0 fuc_02 = (fuc_0)fyy_02.a("penalTable");
            if (fuc_02 != null) {
                fuc_02.setTableModel(fxu_02);
            }
        }
    }

    private static fxu_0 i() {
        fxu_0 fxu_02 = new fxu_0();
        fxu_02.a("date", new fxw_0(Comparator.comparing(cer_2::c)));
        fxu_02.a("type", new fxw_0(Comparator.comparing(cer_2::a)));
        fxu_02.a("moderator", new fxw_0(Comparator.comparing(cer_2::b)));
        fxu_02.a("reason", new fxw_0(Comparator.comparing(object -> ((cer_2)object).e().toLowerCase())));
        fxu_02.d();
        return fxu_02;
    }

    public static String b(boolean bl) {
        String string = bl ? "Online" : "Offline";
        ani_2 ani_22 = new ani_2();
        ani_22.i().a(bl ? azf_2.k : azf_2.h).a((CharSequence)string).j();
        return ani_22.r();
    }

    @Override
    public boolean a(adt_1 adt_12) {
        return true;
    }

    @Override
    public long a_() {
        return 0L;
    }

    public ceq_2 g() {
        return this.b;
    }

    @Override
    public void a(long l) {
    }
}

