/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bJt
 */
public final class bjt_2
extends big_1
implements bjs_2 {
    private static final Logger a = Logger.getLogger(bjt_2.class);
    private int g;
    private List<Integer> h;

    public bjt_2(int n) {
        super(n);
    }

    @Override
    public void a(String ... stringArray) {
        if (stringArray == null || stringArray.length != 2) {
            a.error((Object)String.format("[ItemAction] Wrong number of argument for this itemAction, requires 2 but got %s", stringArray == null ? 0 : stringArray.length));
            return;
        }
        this.g = Integer.parseInt(stringArray[0]);
        String string = stringArray[1].replace("[", "").replace("]", "");
        this.h = new ArrayList<Integer>();
        for (String string2 : string.split(",")) {
            this.h.add(Integer.parseInt(string2));
        }
    }

    @Override
    public eyx_1 f() {
        return eyx_1.M;
    }

    @Override
    public boolean a(@Nullable bmr_1 bmr_12, @Nullable ezr_0<?> ezr_02) {
        if (bmr_12 == null) {
            return false;
        }
        ece_0 ece_02 = bmr_12.eX();
        for (int n : this.h) {
            if (ece_02.d(this.g, n)) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean a(exk_2 exk_22) {
        bmr_1 bmr_12 = (bmr_1)euu_2.c(azu_0.j().n().u(), exk_22.a());
        if (bmr_12 == null) {
            a.error((Object)"[ItemAction] Trying to start an itemAction with an item we don't have");
            return false;
        }
        if (this.a(bmr_12, exk_22)) {
            for (int n : this.h) {
                eco_0 eco_02 = ecn_0.a.a(this.g).a(n);
                String string = bae.h().a("craft.recipeAlreadyKnow", bae.h().a(15, eco_02 != null ? (long)eco_02.k().a() : (long)exk_22.aT_(), new Object[0]));
                aul_0.a().b(string);
            }
            return false;
        }
        this.a(exk_22.a());
        return true;
    }

    @Override
    public void c() {
    }

    @Override
    protected boolean d() {
        return false;
    }

    public int g() {
        return this.g;
    }

    public List<Integer> h() {
        return this.h;
    }
}

