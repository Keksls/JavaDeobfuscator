/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bJm
 */
public class bjm_1
extends big_1
implements bjs_2 {
    private static final Logger a = Logger.getLogger(bjm_1.class);
    private int g;

    public bjm_1(int n) {
        super(n);
    }

    @Override
    public void a(String[] stringArray) {
        if (stringArray == null || stringArray.length != 1) {
            a.error((Object)String.format("[ItemAction] Wrong number of argument for this itemAction, requires 1 but got %s", stringArray == null ? 0 : stringArray.length));
            return;
        }
        this.g = Integer.parseInt(stringArray[0]);
    }

    @Override
    public boolean a(@Nullable bmr_1 bmr_12, @Nullable ezr_0<?> ezr_02) {
        if (bmr_12 == null) {
            return false;
        }
        return bmr_12.h(this.g);
    }

    @Override
    public boolean a(exk_2 exk_22) {
        bmr_1 bmr_12 = (bmr_1)euu_2.c(azu_0.j().n().u(), exk_22.a());
        if (bmr_12 == null) {
            a.error((Object)"[ItemAction] Trying to start an itemAction with an item we don't have");
            return false;
        }
        if (this.a(bmr_12, exk_22)) {
            String string = bae.h().a(34, (long)this.g, new Object[0]);
            aUh.a("error.title.alreadyKnown", new Object[]{string});
            return false;
        }
        this.a(exk_22.a());
        return true;
    }

    @Override
    public void c() {
    }

    @Override
    public eyx_1 f() {
        return eyx_1.h;
    }
}

