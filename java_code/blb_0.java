/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from blb
 */
public class blb_0
implements ajh_1 {
    private static final String a = "level";
    private static final String[] b = new String[]{"level"};
    private final short d;

    public blb_0(short s2) {
        this.d = s2;
    }

    @Override
    public String[] d() {
        return b;
    }

    @Override
    @Nullable
    public Object b(String string) {
        if (string.equals(a)) {
            return this.b();
        }
        return null;
    }

    public short a() {
        return this.d;
    }

    public String b() {
        return this.d <= 0 ? bae.h().a("aptitude.real.level", new Object[0]) : String.valueOf(this.d);
    }

    public String toString() {
        return "BuildSheetLevel{m_level=" + this.d + "}";
    }
}

