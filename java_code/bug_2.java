/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bUg
 */
public class bug_2
extends bue_2<etn_2> {
    public static final String a = "iconUrl";
    public static final String b = "description";
    public static final String d = "sidoaNeed";
    public static final String e = "buildDelay";
    public static final String f = "conditions";
    public static final String g = "ressources";
    public static final String[] h = bug_2.a("iconUrl", "description", "sidoaNeed", "buildDelay", "conditions", "ressources");
    private final cco_1 i;

    @Override
    public String[] d() {
        return h;
    }

    public bug_2(@NotNull etn_2 etn_22, @NotNull cco_1 cco_12) {
        super(etn_22);
        this.i = cco_12;
    }

    @Override
    public Object b(String string) {
        Object object = super.b(string);
        if (object != null) {
            return object;
        }
        if (string.equals(a)) {
            return this.i.c(((etn_2)this.n).b());
        }
        if (string.equals(b)) {
            return bae.h().a(125, (long)((etn_2)this.n).i(), new Object[0]);
        }
        if (string.equals(f)) {
            return null;
        }
        return super.b(string);
    }

    @Override
    public boolean a() {
        return this.j();
    }

    @Override
    public int b() {
        return 0;
    }

    @Override
    public bue_2 e() {
        bug_2 bug_22 = new bug_2((etn_2)this.n, cco_1.a);
        return bug_22;
    }

    @Override
    public btu_2 g() {
        return btu_2.a;
    }
}

