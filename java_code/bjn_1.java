/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import java.nio.ByteBuffer;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bJn
 */
public class bjn_1
extends big_1
implements bjs_2 {
    private static final Logger a = Logger.getLogger(bjn_1.class);
    private ft_1 g;

    public bjn_1(int n) {
        super(n);
    }

    @Override
    public void a(String ... stringArray) {
        if (stringArray == null || stringArray.length != 1) {
            a.error((Object)String.format("[ItemAction] Wrong number of argument for this itemAction, requires 1 but got %s", stringArray == null ? 0 : stringArray.length));
            return;
        }
        this.g = ft_1.b(Integer.parseInt(stringArray[0]));
    }

    @Override
    public boolean a(@Nullable bmr_1 bmr_12, @Nullable ezr_0<?> ezr_02) {
        if (ezr_02 == null) {
            return false;
        }
        return bol_1.a(ezr_02.n(), this.g);
    }

    @Override
    public boolean a(exk_2 exk_22) {
        bmr_1 bmr_12 = (bmr_1)euu_2.c(azu_0.j().n().u(), exk_22.a());
        if (bmr_12 == null) {
            a.error((Object)("[ItemAction] Trying to start an itemAction with an item we don't have " + exk_22));
            return false;
        }
        if (this.a(bmr_12, exk_22)) {
            bQG.a();
            bQG.a(57, new Object[0]);
            return false;
        }
        fzn_0 fzn_02 = new fzn_0(102, 0, bae.h().a(this.g(), new Object[0]), 6L);
        fzm_0 fzm_02 = fpm_0.b().a(fzn_02);
        fzm_02.a((int n, String string) -> {
            if (n != 2) {
                return;
            }
            this.a(exk_22.a());
        });
        return true;
    }

    @Override
    public boolean b(ByteBuffer byteBuffer) {
        if (!super.b(byteBuffer)) {
            return false;
        }
        this.g = ft_1.b(byteBuffer.getInt());
        return true;
    }

    @Override
    public void c() {
    }

    @Override
    public eyx_1 f() {
        return eyx_1.P;
    }

    public String g() {
        switch (this.g) {
            case a: 
            case b: {
                return "cosmetics.petEquipment.confirmation";
            }
            case c: {
                return "cosmetics.costume.confirmation";
            }
            case d: {
                return "cosmetics.playerSprint.confirmation";
            }
            case e: {
                return "cosmetics.finisher.confirmation";
            }
            case f: {
                return "cosmetics.aura.confirmation";
            }
        }
        return null;
    }

    public ft_1 h() {
        return this.g;
    }
}

