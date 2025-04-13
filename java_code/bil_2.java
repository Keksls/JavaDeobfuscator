/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from bil
 */
public abstract class bil_2
implements ajh_1 {
    public static final String a = "description";
    public static final String b = "progressionText";
    public static final String d = "isCompleted";
    public static final String e = "isFailed";
    public static final String f = "isCompassed";
    public static final String g = "canBeCompassed";
    public static final String h = "canBeCompassedNow";
    public static final String i = "objectiveInstanceName";
    public static final String[] j = new String[]{"description", "progressionText", "isCompleted", "isCompassed", "canBeCompassedNow"};

    @Override
    public String[] d() {
        return j;
    }

    @Override
    public Object b(String string) {
        if (string.equals(a)) {
            return this.a();
        }
        if (string.equals(b)) {
            long l = this.b();
            return l == -1L ? null : Long.valueOf(l);
        }
        if (string.equals(d)) {
            return this.c();
        }
        if (string.equals(e)) {
            return this.f();
        }
        if (string.equals(f)) {
            return this.e();
        }
        if (string.equals(g)) {
            return this.g();
        }
        if (string.equals(h)) {
            return this.h();
        }
        if (string.equals(i)) {
            return this.i();
        }
        return null;
    }

    protected abstract String a();

    protected abstract long b();

    protected abstract boolean c();

    protected abstract boolean e();

    protected abstract boolean f();

    protected abstract boolean g();

    protected abstract boolean h();

    @NotNull
    protected Object i() {
        return bae.h().a("compass", new Object[0]);
    }
}

