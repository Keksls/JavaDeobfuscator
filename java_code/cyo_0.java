/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cYO
 */
public class cyo_0
implements ahr_1 {
    private static final cyo_0 a = new cyo_0();

    public static cyo_0 a() {
        return a;
    }

    @Override
    public boolean a(adt_1 adt_12) {
        adt_12.a();
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
        fis_1.a().a("isInFightPlacement", azu_0.j().c(cYW.a()));
        fis_1.a().a("isInFightPlayerTurn", true);
        cbf_2.a("is_player_turn", true);
    }

    private void a(String string) {
        fyy_0 fyy_02 = fpm_0.b().h().d(string);
        if (fyy_02 != null) {
            fvE fvE2 = (fvE)fyy_02.a("apsContainer");
            fvE2.setVisible(false);
        }
    }

    @Override
    public void b(aav_2 aav_22, boolean bl) {
        if (!bl) {
            this.a("worldAndFightBarDialog");
            this.c();
            fis_1.a().a("isInFightPlayerTurn", false);
            cbf_2.a("is_player_turn", false);
        }
    }

    private void c() {
    }
}

