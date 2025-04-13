/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.List;
import org.apache.log4j.Logger;

public class aUK
extends auz_0
implements ajf_1 {
    protected static final Logger a = Logger.getLogger(aUK.class);
    public static final short b = 0;
    public static final short d = 1;
    public static final short e = 2;
    public static final short f = 4;
    public static final short g = 8;
    private short x = 0;
    private boolean y = false;
    private short z = 0;
    private byte A = 0;
    private String B;
    private boolean C = false;
    private long D;
    private List<Ow> E;
    private xz_0 F = xz_0.a;
    public static final String h = "notify";
    public static final String i = "type";
    public static final String j = "illustrationUrl";
    public static final String k = "commentary";
    public static final String l = "commentaryEdition";
    public static final String m = "level";
    public static final String n = "canInviteToGuild";
    public static final String o = "characterNameWithLanguages";
    public static final String[] p = new String[]{"notify", "type", "illustrationUrl", "commentary", "commentaryEdition", "level", "canInviteToGuild"};
    public static final String[] q = new String[p.length + auz_0.v.length];

    public aUK(String string, String string2, boolean bl, long l, boolean bl2, short s2, byte by, String string3, long l2) {
        super(string, string2, bl, l);
        this.y = bl2;
        this.z = s2;
        this.A = by;
        this.B = string3;
        this.D = l2;
    }

    public aUK(long l, String string, String string2) {
        super(l, string, string2);
    }

    public void a(short s2) {
        this.x = (short)(s2 | this.x);
    }

    public void b(short s2) {
        this.x = (short)(~s2 & this.x);
    }

    public boolean c(short s2) {
        return (this.x & s2) != 0;
    }

    public boolean a() {
        return this.x == 0;
    }

    @Override
    public Object b(String string) {
        if (string.equals(h)) {
            return this.b();
        }
        if (string.equals(i)) {
            return this.x;
        }
        if (string.equals(k)) {
            return this.B != null && this.B.length() > 0 ? this.B : null;
        }
        if (string.equals(l)) {
            return this.C;
        }
        if (string.equals(m)) {
            return this.D == -1L ? "-" : Short.valueOf(Oz.c.a(this.D));
        }
        if (string.equals(j)) {
            if (this.z == -1) {
                return null;
            }
            try {
                return String.format(azs_0.a().a("breedContactListIllustrationPath"), this.z, this.A);
            }
            catch (gm_0 gm_02) {
                a.error((Object)gm_02.getMessage(), (Throwable)gm_02);
            }
        }
        if (string.equals(n)) {
            bnh_1 bnh_12 = (bnh_1)bmf_2.a().b(this.c);
            return this.h() && byp_2.a().a(bnh_12);
        }
        if (string.equals(o)) {
            if (!this.h()) {
                return this.j();
            }
            return bvs_0.a(((bvx_0)ans_0.D().h()).m(), this.j(), this.F, this.E);
        }
        return super.b(string);
    }

    public boolean b() {
        return this.y;
    }

    public void a(boolean bl) {
        this.y = bl;
    }

    @Override
    public String[] d() {
        return q;
    }

    public String c() {
        return this.B;
    }

    public void a(String string) {
        this.B = string;
    }

    public boolean e() {
        return this.C;
    }

    public void b(boolean bl) {
        this.C = bl;
    }

    public void d(short s2) {
        this.z = s2;
    }

    public void a(byte by) {
        this.A = by;
    }

    public void a(long l) {
        this.D = l;
    }

    public void a(List<Ow> list) {
        this.E = list;
    }

    public void a(xz_0 xz_02) {
        this.F = xz_02;
    }

    public void f() {
        fis_1.a().a((ajf_1)this, q);
    }

    static {
        System.arraycopy(p, 0, q, 0, p.length);
        System.arraycopy(auz_0.v, 0, q, p.length, auz_0.v.length);
    }
}

