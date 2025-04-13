/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from blc
 */
public class blc_0
implements ajh_1 {
    private static final Logger d = Logger.getLogger(blc_0.class);
    public static final blc_0 a = new blc_0();
    public static final String b = "levels";
    private final List<blb_0> e = new ArrayList<blb_0>();
    private static final String[] f = new String[]{"levels"};

    private blc_0() {
        for (ezi_1 ezi_12 : ezi_1.values()) {
            blb_0 blb_02 = new blb_0(ezi_12.a());
            this.e.add(blb_02);
        }
    }

    public blb_0 a(short s2) {
        for (blb_0 blb_02 : this.e) {
            if (blb_02.a() != s2) continue;
            return blb_02;
        }
        return this.a();
    }

    public blb_0 a() {
        return this.e.get(0);
    }

    public String b(short s2) {
        String string = this.a(s2).b();
        String string2 = s2 <= 0 ? string : bae.h().a("levelShort.custom", string);
        ani_2 ani_22 = new ani_2();
        ani_22.i().a((CharSequence)"(").a((CharSequence)string2);
        try {
            if (s2 > 0) {
                ani_22.a((CharSequence)" ").a(bac.a(116), 14, 13, null, null);
            }
        }
        catch (gm_0 gm_02) {
            d.error((Object)"Exception trying to get downscale arrow image", (Throwable)gm_02);
        }
        return ani_22.a((CharSequence)")").r();
    }

    public List<blb_0> a(blx_1 blx_12) {
        return this.a(blx_12, Integer.MIN_VALUE);
    }

    public List<blb_0> a(blx_1 blx_12, int n) {
        short s2 = blx_12.dt();
        return this.e.stream().filter(Objects::nonNull).filter(blb_02 -> blc_0.a(blb_02.a(), s2, n)).collect(Collectors.toList());
    }

    private static boolean a(short s2, short s3, int n) {
        if (s2 == -1) {
            return s3 >= n;
        }
        return s3 - 1 >= s2 && s2 >= n;
    }

    @Override
    public String[] d() {
        return f;
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(b)) {
            return this.e;
        }
        return null;
    }
}

