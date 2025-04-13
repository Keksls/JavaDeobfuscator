/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.io.IOException;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from bWu
 */
public class bwu_2 {
    private static final Logger a = Logger.getLogger(bwu_2.class);

    @Nullable
    public static abu a(int n) {
        aby_0 aby_02 = new aby_0(abd_1.c(), 0.0f, 0.0f, 0.0f);
        String string = n + ".anm";
        try {
            aby_02.a(azs_0.a().a("ANMGUIPath") + string, true);
        }
        catch (IOException iOException) {
            a.warn((Object)iOException.getMessage());
            return null;
        }
        catch (gm_0 gm_02) {
            a.warn((Object)gm_02.getMessage());
            return null;
        }
        aby_02.a(string);
        return aby_02;
    }

    public static void a(@NotNull abu abu2, @NotNull bnm_0 bnm_02) {
        abu2.g(bnm_02.b());
        abu2.e(bnm_02.b());
    }

    public static void a(abu abu2) {
        bwu_2.a(abu2, bnm_0.a);
    }
}

