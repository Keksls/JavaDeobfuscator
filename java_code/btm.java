/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Locale;
import org.jetbrains.annotations.Nullable;

public class btm
implements ajh_1 {
    public static final String a = "teamId";
    public static final String b = "rank";
    public static final String d = "stasis";
    public static final String e = "dungeonTurn";
    public static final String f = "bossTurn";
    public static final String g = "completionDate";
    public static final String h = "members";
    public static final String i = "recordBorder";
    public static final String j = "member0";
    public static final String k = "member1";
    public static final String l = "member2";
    public static final String m = "member3";
    public static final String n = "member4";
    public static final String o = "member5";
    public static final String p = "laurel";
    public static final String q = "isRewarded";
    public static final String r = "teamScore";
    public static final String s = "waveReached";
    public static final String t = "monstersDefeated";
    private final long u;
    private final int v;
    private final short w;
    private final short x;
    private final short y;
    private final long z;
    private final long A;
    private final ArrayList<btk> B = new ArrayList();
    private final int C;
    private final int D;
    private final boolean E;

    public btm(hD hD2, int n) {
        this.u = hD2.g();
        this.v = n;
        this.w = (short)hD2.i();
        this.x = (short)hD2.m();
        this.y = (short)hD2.o();
        this.C = hD2.v();
        this.D = hD2.x();
        this.A = hD2.k();
        this.z = hD2.t();
        this.E = this.C == 0 && this.w > 0 && this.z == 0L;
    }

    @Override
    public String[] d() {
        return new String[0];
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(a)) {
            return "(" + this.u + ")";
        }
        if (string.equals(b)) {
            return this.v + 1;
        }
        if (string.equals(e)) {
            return bae.h().a("stasis.dungeon.turn", this.x);
        }
        if (string.equals(f)) {
            return bae.h().a("stasis.dungeon.turn", this.y);
        }
        if (string.equals(g)) {
            wt_0 wt_02 = wt_0.b(this.A);
            Locale locale = bae.h().f().a();
            DateFormat dateFormat = DateFormat.getDateTimeInstance(1, 3, locale);
            dateFormat.setTimeZone(wt_0.a);
            String string2 = dateFormat.format(wt_02.i());
            return bae.h().a("dungeon.ladder.completion", new Object[0]) + string2;
        }
        if (string.equals(h)) {
            return this.B;
        }
        if (string.equals(d)) {
            return this.w;
        }
        if (string.equals(i)) {
            return btf.a(this.w);
        }
        if (string.equals(j)) {
            return this.a(0);
        }
        if (string.equals(k)) {
            return this.a(1);
        }
        if (string.equals(l)) {
            return this.a(2);
        }
        if (string.equals(m)) {
            return this.a(3);
        }
        if (string.equals(n)) {
            return this.a(4);
        }
        if (string.equals(o)) {
            return this.a(5);
        }
        if (string.equals(p)) {
            return this.b();
        }
        if (string.equals(q)) {
            return this.a();
        }
        if (string.equals(r)) {
            return this.z / (long)this.B.size();
        }
        if (string.equals(s)) {
            return this.C;
        }
        if (string.equals(t)) {
            return this.D;
        }
        return null;
    }

    public boolean a() {
        return this.v < (this.E ? 13 : 200);
    }

    public String b() {
        if (this.v < (this.E ? 1 : 1)) {
            return azs_0.a().t(String.valueOf(3));
        }
        if (this.v < (this.E ? 7 : 60)) {
            return azs_0.a().t(String.valueOf(2));
        }
        if (this.v < (this.E ? 13 : 200)) {
            return azs_0.a().t(String.valueOf(1));
        }
        return azs_0.a().t(String.valueOf(0));
    }

    @Nullable
    public btk a(int n) {
        if (this.B.size() < n + 1) {
            return null;
        }
        return this.B.get(n);
    }

    public void a(btk btk2) {
        btk2.a(this);
        this.B.add(btk2);
    }

    public void c() {
        this.B.clear();
    }

    public ArrayList<btk> e() {
        return this.B;
    }

    public int f() {
        return this.v;
    }

    public short g() {
        return this.w;
    }
}

