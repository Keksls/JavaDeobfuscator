/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from eLj
 */
public class elj_0 {
    public static fat<tb_0<tc_0>> a(short s2, short s3, short s4, short s5) {
        fat<tb_0<tc_0>> fat2 = new fat<tb_0<tc_0>>();
        if (s2 > 0) {
            fat2.a(tc_0.b.a(s2));
        }
        if (s3 > 0) {
            fat2.a(tc_0.c.a(s3));
        }
        if (s4 > 0) {
            fat2.a(tc_0.d.a(s4));
        }
        if (s5 > 0) {
            fat2.a(tc_0.e.a(s5));
        }
        return fat2;
    }

    public static fat<tb_0<te_0>> b(short s2, short s3, short s4, short s5) {
        fat<tb_0<te_0>> fat2 = new fat<tb_0<te_0>>();
        if (s2 > 0) {
            fat2.a(te_0.b.a(s2));
        }
        if (s3 > 0) {
            fat2.a(te_0.c.a(s3));
        }
        if (s4 > 0) {
            fat2.a(te_0.d.a(s4));
        }
        if (s5 > 0) {
            fat2.a(te_0.e.a(s5));
        }
        return fat2;
    }

    @Nullable
    public <T extends td_0> T a(fat<tb_0<T>> fat2) {
        tb_0<T> tb_02 = fat2.a((Object)null, (Object)null, (Object)null, (Object)null);
        return tb_02 != null ? (T)tb_02.b() : null;
    }
}

