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
 * Renamed from bop
 */
public class bop_2
implements ajh_1 {
    private static final Logger b = Logger.getLogger(bop_2.class);
    public static final bop_2 a = new bop_2();

    @Override
    public String[] d() {
        return null;
    }

    @Override
    @Nullable
    public Object b(String string) {
        try {
            return bac.a(string);
        }
        catch (gm_0 gm_02) {
            b.error((Object)("Error when displaying icon with name : " + string), (Throwable)gm_02);
            return null;
        }
    }
}

