/*
 * Decompiled with CFR 0.152.
 */
import java.sql.ResultSet;

/*
 * Renamed from aGV
 */
public class agv_1
extends agp_1 {
    public static final int d = 0;
    public static final int e = 1;
    public static final int f = 2;
    public static final int g = 3;
    public static final int h = 4;
    public static final int i = 5;
    public static final int j = 6;
    public static final int k = 7;
    private final ago_1 l;
    private final agr_1 m;
    private final ags_1 n;
    private final float o;
    private final boolean p;
    private final boolean q;
    private final int r;
    private final boolean s;
    private final boolean t;

    public agv_1(agx_1 agx_12, ResultSet resultSet) {
        super(agx_12, resultSet.getLong("oid"), resultSet.getString("relname"));
        this.l = agx_12.c(resultSet.getLong("relnamespace"));
        this.m = agx_12.d(resultSet.getLong("reltype"));
        this.n = agx_12.b(resultSet.getInt("relowner"));
        this.o = resultSet.getFloat("reltuples");
        this.p = resultSet.getBoolean("relhasindex");
        this.q = resultSet.getBoolean("relisshared");
        String string = resultSet.getString("relkind");
        this.r = string.equals("r") ? 1 : (string.equals("i") ? 2 : (string.equals("S") ? 3 : (string.equals("v") ? 4 : (string.equals("c") ? 5 : (string.equals("s") ? 6 : (string.equals("t") ? 7 : 0))))));
        this.s = resultSet.getBoolean("relhasoids");
        this.t = resultSet.getBoolean("relhaspkey");
        if (this.l != null) {
            this.l.a(this);
        }
    }

    public ago_1 e() {
        return this.l;
    }

    public agr_1 f() {
        return this.m;
    }

    public ags_1 g() {
        return this.n;
    }

    public float i() {
        return this.o;
    }

    public boolean j() {
        return this.p;
    }

    public boolean k() {
        return this.q;
    }

    public int l() {
        return this.r;
    }

    public boolean m() {
        return this.s;
    }

    public boolean n() {
        return this.t;
    }
}

